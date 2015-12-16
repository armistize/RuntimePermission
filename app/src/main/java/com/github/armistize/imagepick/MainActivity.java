package com.github.armistize.imagepick;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.media.Image;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

/**
 * Activity for image picker
 *
 * This activity is used to demo the image picker with runtime permission request
 *
 * @author tawit.k
 */
public class MainActivity extends AppCompatActivity {

    /**
     * Pick photo requestCode.
     */
    private static final int PICK_PHOTO = 1;

    /**
     * onCreate.
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button imageButton = (Button) findViewById(R.id.button);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pickImage();
            }

        });
    }

    /**
     * onActivityResult.
     * @param requestCode
     * @param resultCode
     * @param imageReturnedIntent
     */
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent imageReturnedIntent) {
        super.onActivityResult(requestCode, resultCode, imageReturnedIntent);

        switch (requestCode) {
            case PICK_PHOTO:
                if (resultCode == RESULT_OK) {
                    Uri selectedImage = imageReturnedIntent.getData();
                    processImage(selectedImage);
                }
                break;
            default:
                break;
        }
    }

    /**
     * onRequestPermissionsResult.
     * @param requestCode
     * @param permissions
     * @param grantResults
     */
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults){
        switch(requestCode){
            case PermissionConstants.REQUEST_READ_EXTERNAL_STORAGE:
                if(grantResults[0]==PackageManager.PERMISSION_GRANTED){
                    Toast.makeText(getApplicationContext(),
                            "PERMISSION_GRANTED", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(),
                            "PERMISSION_DENIED", Toast.LENGTH_LONG).show();
                }
                break;
            default: break;
        }
    }

    /**
     * Pick image and handle runtime permission.
     */
    private void pickImage() {
        PermissionManager permissionManager = PermissionManager.getInstance();
        if (!permissionManager.isGranted(this, Manifest.permission.READ_EXTERNAL_STORAGE)) {
            permissionManager.requestReadExternalStoragePermission(this);
        } else {
            Intent intent = new Intent();
            intent.setType("image/*");
            intent.setAction(Intent.ACTION_GET_CONTENT);
            startActivityForResult(Intent.createChooser(intent, "Select Picture"), PICK_PHOTO);
        }
    }

    /**
     * For processing image.
     * @param selectedImage
     */
    private void processImage(Uri selectedImage) {
        //TODO: Finish pick a photo. Now you can do your work here eg. image processing.
    }
}

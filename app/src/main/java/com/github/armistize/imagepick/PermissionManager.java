package com.github.armistize.imagepick;

import android.Manifest;
import android.app.Activity;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;

/**
 *
 * PermissionManager is singleton class for managing runtime permission effortlessly.
 *
 * @author tawit.k
 */
public class PermissionManager {

    private static PermissionManager instance = null;

    private PermissionManager() {

    }
    public static PermissionManager getInstance() {
        if(instance == null) {
            instance = new PermissionManager();
        }
        return instance;
    }

    public boolean isGranted(Activity activity,String permission) {
        return ActivityCompat.checkSelfPermission(activity, permission)
                == PackageManager.PERMISSION_GRANTED;
    }

    public void requestReadCalendarPermission(Activity activity) {
        ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.READ_CALENDAR},
                PermissionConstants.REQUEST_READ_CALENDAR);
    }
    
    public void requestWriteCalendarPermission(Activity activity) {
        ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.WRITE_CALENDAR},
                PermissionConstants.REQUEST_WRITE_CALENDAR);
    }
    
    public void requestCameraPermission(Activity activity) {
        ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.CAMERA},
                PermissionConstants.REQUEST_CAMERA);
    }
    
    public void requestReadContactsPermission(Activity activity) {
        ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.READ_CONTACTS},
                PermissionConstants.REQUEST_READ_CONTACTS);
    }
    
    public void requestWriteContactsPermission(Activity activity) {
        ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.WRITE_CONTACTS},
                PermissionConstants.REQUEST_WRITE_CONTACTS);
    }
    
    public void requestGetAccountsPermission(Activity activity) {
        ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.GET_ACCOUNTS},
                PermissionConstants.REQUEST_GET_ACCOUNTS);
    }
    
    public void requestAccessFineLocationPermission(Activity activity) {
        ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.ACCESS_FINE_LOCATION},
                PermissionConstants.REQUEST_ACCESS_FINE_LOCATION);
    }
    
    public void requestAccessCoarseLocationPermission(Activity activity) {
        ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.ACCESS_COARSE_LOCATION},
                PermissionConstants.REQUEST_ACCESS_COARSE_LOCATION);
    }
    
    public void requestRecordAudioPermission(Activity activity) {
        ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.RECORD_AUDIO},
                PermissionConstants.REQUEST_RECORD_AUDIO);
    }
    
    public void requestReadPhoneStatePermission(Activity activity) {
        ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.READ_PHONE_STATE},
                PermissionConstants.REQUEST_READ_PHONE_STATE);
    }
    
    public void requestCallPhonePermission(Activity activity) {
        ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.CALL_PHONE},
                PermissionConstants.REQUEST_CALL_PHONE);
    }
    
    public void requestReadCallLogPermission(Activity activity) {
        ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.READ_CALL_LOG},
                PermissionConstants.REQUEST_READ_CALL_LOG);
    }
    
    public void requestWriteCallLogPermission(Activity activity) {
        ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.WRITE_CALL_LOG},
                PermissionConstants.REQUEST_WRITE_CALL_LOG);
    }
    
    public void requestAddVoiceMailPermission(Activity activity) {
        ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.ADD_VOICEMAIL},
                PermissionConstants.REQUEST_ADD_VOICEMAIL);
    }
    
    public void requestUseSIPPermission(Activity activity) {
        ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.USE_SIP},
                PermissionConstants.REQUEST_USE_SIP);
    }
    
    public void requestProcessOutgoingCallPermission(Activity activity) {
        ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.PROCESS_OUTGOING_CALLS},
                PermissionConstants.REQUEST_PROCESS_OUTGOING_CALLS);
    }
    
    public void requestBodySensorsPermission(Activity activity) {
        ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.BODY_SENSORS},
                PermissionConstants.REQUEST_BODY_SENSORS);
    }
    
    public void requestSendSMSPermission(Activity activity) {
        ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.SEND_SMS},
                PermissionConstants.REQUEST_SEND_SMS);
    }
    
    public void requestReceiveSMSPermission(Activity activity) {
        ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.RECEIVE_SMS},
                PermissionConstants.REQUEST_RECEIVE_SMS);
    }
    
    public void requestReadSMSPermission(Activity activity) {
        ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.READ_SMS},
                PermissionConstants.REQUEST_READ_SMS);
    }
    
    public void requestReceiveWAPPushPermission(Activity activity) {
        ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.RECEIVE_WAP_PUSH},
                PermissionConstants.REQUEST_RECEIVE_WAP_PUSH);
    }
    
    public void requestReceiveMMSPermission(Activity activity) {
        ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.RECEIVE_MMS},
                PermissionConstants.REQUEST_RECEIVE_MMS);
    }
    
    public void requestReadExternalStoragePermission(Activity activity) {
        ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE},
                PermissionConstants.REQUEST_READ_EXTERNAL_STORAGE);
    }
    
    public void requestWriteExternalStoragePermission(Activity activity) {
        ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},
                PermissionConstants.REQUEST_WRITE_EXTERNAL_STORAGE);
    }
}

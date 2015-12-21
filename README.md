
#Introduction
This project contains an **Android project** that demonstrates how to handle runtime permission since Android 6.0 (Marshmallow, API 23) some permissions are considered as **dangerous** and listed in the table below

| Permission Group  | Permissions |
| ------------- | ------------- |
| CALENDAR  | READ_CALENDAR <br> WRITE_CALENDAR  |
| CAMERA  | CAMERA  |
| CONTACTS  | READ_CONTACTS <br> WRITE_CONTACTS <br> GET_ACCOUNTS|
| LOCATION  | ACCESS_FINE_LOCATION <br> ACCESS_COARSE_LOCATION |
| MICROPHONE  | RECORD_AUDIO  |
| PHONE  | READ_PHONE_STATE <br> CALL_PHONE <br> READ_CALL_LOG <br> WRITE_CALL_LOG <br> ADD_VOICEMAIL <br> USE_SIP <br> PROCESS_OUTGOING_CALLS|
| SENSORS  | BODY_SENSORS  |
| SMS  | SEND_SMS <br> RECEIVE_SMS <br> READ_SMS <br> RECEIVE_WAP_PUSH <br> RECEIVE_MMS  |
| STORAGE  | READ_EXTERNAL_STORAGE <br> WRITE_EXTERNAL_STORAGE  |

>
> **Note:** If you are new to Android development please see [Detailed guides](https://github.com/armistize/RuntimePermission#detailed-guides) topic first.
>

#Usages
For checking and requesting runtime permission if needed.
```JAVA
        PermissionManager permissionManager = PermissionManager.getInstance();
        if (!permissionManager.isGranted(this, Manifest.permission.READ_EXTERNAL_STORAGE)) {
            permissionManager.requestReadExternalStoragePermission(this);
        } else {
            //Permission is granted. Do you work here.
        }
```

#Detailed guides
[Android API guide](http://developer.android.com/guide/index.html)  
[System Permissions](http://developer.android.com/guide/topics/security/permissions.html#normal-dangerous)  
[Requesting Permissions at Run Time](http://developer.android.com/training/permissions/requesting.html)  

#License
>The MIT License (MIT)

>Copyright (c) 2015 Tawit K.

>Permission is hereby granted, free of charge, to any person obtaining a copy
>of this software and associated documentation files (the "Software"), to deal
>in the Software without restriction, including without limitation the rights
>to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
>copies of the Software, and to permit persons to whom the Software is
>furnished to do so, subject to the following conditions:

>The above copyright notice and this permission notice shall be included in all
>copies or substantial portions of the Software.

>THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

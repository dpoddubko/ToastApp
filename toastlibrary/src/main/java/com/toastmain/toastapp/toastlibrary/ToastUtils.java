package com.toastmain.toastapp.toastlibrary;

import android.app.Activity;
import android.widget.Toast;

/**
 * Created by admin on 7/19/2018.
 */

public class ToastUtils {
    public void showToast(Activity activity, String msg) {
        Toast.makeText(activity, msg, Toast.LENGTH_SHORT).show();
    }
}

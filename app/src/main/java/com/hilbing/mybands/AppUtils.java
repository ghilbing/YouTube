package com.hilbing.mybands;

import android.widget.Toast;

public class AppUtils {

    public static void showToast(String iMessage) {
        Toast.makeText(LatentLoaderApplication.getAppContext(), iMessage, Toast.LENGTH_SHORT).show();
    }
}

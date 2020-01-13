package com.hilbing.mybands;

import android.app.Application;
import android.content.Context;
import android.util.Log;

public class LatentLoaderApplication extends Application {

    private static Context sContext = null;

    public static Context getAppContext() {
        return sContext;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        sContext = this;
    }

    public static String appName() {
        Log.d("APP NAME", String.valueOf(R.string.app_name));
        return getAppContext().getString(R.string.app_name);
    }

}

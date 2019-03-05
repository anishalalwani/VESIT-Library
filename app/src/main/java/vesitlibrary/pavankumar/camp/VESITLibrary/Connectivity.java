/*
 * Created By Pavankumar.camp.Vesit Library
 * Copyright(c) 2017
 * No Content can me modified or used without any permission
 * All Rights Reserved to VESIT LIBRARY AND DEVELOPERS
 *
 */

package vesitlibrary.pavankumar.camp.VESITLibrary;

/**
 * Created by Pavan on 12-01-2017 2017 07:13 PM.
 */

import android.app.Application;

public class Connectivity extends Application {
    private static Connectivity mInstance;
    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
    }
    public static synchronized Connectivity getInstance() {
        return mInstance;
    }
    public void setConnectivityListener(ConnectivityReceiver.ConnectivityReceiverListener listener) {
        ConnectivityReceiver.connectivityReceiverListener = listener;
    }
}
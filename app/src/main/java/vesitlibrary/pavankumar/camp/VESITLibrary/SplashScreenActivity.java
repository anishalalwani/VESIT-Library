/*
 * Created By Pavankumar.camp.Vesit Library
 * Copyright(c) 2017
 * No Content can me modified or used without any permission
 * All Rights Reserved to VESIT LIBRARY AND DEVELOPERS
 *
 */

package vesitlibrary.pavankumar.camp.VESITLibrary;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;


public class SplashScreenActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT <= 19) {
            setContentView(R.layout.activity_splash_screen_old);
        }else{
            setContentView(R.layout.activity_splash_screen);
        }

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashScreenActivity.this, LoginActivity.class));
            }
        }, 1700);
    }

}

package com.splashview;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.WindowManager;

public class Splash extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_SHOW_WHEN_LOCKED
                | WindowManager.LayoutParams.FLAG_DISMISS_KEYGUARD
                |WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON
                | WindowManager.LayoutParams.FLAG_TURN_SCREEN_ON);
        super.onCreate(savedInstanceState); 
        setContentView(R.layout.splash);
        
        Handler handler = new Handler () {
         @Override
         public void handleMessage(Message msg) {
          finish();
         }
        };
        
        handler.sendEmptyMessageDelayed(0, 3000);
    }
}
 


package com.uninorte.equipeprojeto.lfa;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by leandro.bm on 10/3/2016.
 */
public class SplashScreen extends Activity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);

        new Timer().schedule(new TimerTask() {

            @Override
            public void run() {
                finish();

                Intent intent = new Intent();
                intent.setClass(SplashScreen.this, MainActivity.class);
                startActivity(intent);
            }
        }, 3000);
    }





}

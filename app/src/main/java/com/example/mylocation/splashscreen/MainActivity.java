package com.example.mylocation.splashscreen;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView t1;
    ImageView i1;
    Animation TA,LA;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=findViewById(R.id.tv);
        i1=findViewById(R.id.logo);
        TA=AnimationUtils.loadAnimation(this,R.anim.text);
        LA=AnimationUtils.loadAnimation(this,R.anim.logo);
        t1.setAnimation(TA);
        i1.setAnimation(LA);

        final Intent i=new Intent(getApplicationContext(),Main2Activity.class);
        Thread timer=new Thread(){
            public void run(){
                try {
                    sleep(4000);
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
                finally {
                    startActivity(i);
                    finish();
                }
            }
        };timer.start();
    }
}

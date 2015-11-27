package com.auxgroup.progressbardemo;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
private ImageView iv_pg;
    private AnimationDrawable ad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv_pg= (ImageView) findViewById(R.id.iv);
        ad= (AnimationDrawable) iv_pg.getDrawable();
        iv_pg.postDelayed(new Runnable() {
            @Override
            public void run() {
                ad.start();
            }
        },100);
    }
}

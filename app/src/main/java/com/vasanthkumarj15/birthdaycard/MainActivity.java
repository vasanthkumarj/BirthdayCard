package com.vasanthkumarj15.birthdaycard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView zoom = (ImageView) findViewById(R.id.birthday_card);

        final Animation zoomAnimation = AnimationUtils.loadAnimation(this, R.anim.zoom);
        zoom.startAnimation(zoomAnimation);
    }
}

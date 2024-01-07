package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Animatable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView bottle;
    int current;
    int next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottle=findViewById(R.id.bottle);

        bottle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                letspin();
            }
        });
    }
    void letspin(){
        next = new Random().nextInt(5000);

        int px= bottle.getWidth()/2;
        int py= bottle.getHeight()/2;

        Animation rotate=new RotateAnimation(current,next,px,py);
        rotate.setDuration(3000);
        rotate.setFillAfter(true);

        current=next;
        bottle.startAnimation(rotate);
    }
}
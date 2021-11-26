package com.aaaa.findarea;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
Animation animation,animation2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView=findViewById(R.id.textView);
        TextView textView2=findViewById(R.id.textView2);
       animation= AnimationUtils.loadAnimation(MainActivity.this, R.anim.animation1);
      animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }@Override
            public void onAnimationEnd(Animation animation) {
              Intent intent=new Intent(MainActivity.this,MainActivity2.class);
              startActivity(intent);
            }
            @Override
            public void onAnimationRepeat(Animation animation) { }});
      textView.startAnimation(animation);

        animation2= AnimationUtils.loadAnimation(MainActivity.this, R.anim.anim2);
        animation2.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }@Override
            public void onAnimationEnd(Animation animation) {
            }
            @Override
            public void onAnimationRepeat(Animation animation) { }});
        textView2.startAnimation(animation2);
    }
}
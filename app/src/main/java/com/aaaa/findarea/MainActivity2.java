package com.aaaa.findarea;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void one(View view) {
        Intent intent=new Intent(this,rectA.class);
        startActivity(intent);
    }
    public void two(View view) {
        Intent intent=new Intent(this,SquareA.class);
        startActivity(intent);
    }
    public void three(View view) {
        Intent intent=new Intent(this,TriA.class);
        startActivity(intent);
    }
    public void four(View view) {
        Intent intent=new Intent(this,CircA.class);
        startActivity(intent);
    }
}
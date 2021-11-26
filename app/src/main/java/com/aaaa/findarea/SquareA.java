package com.aaaa.findarea;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SquareA extends AppCompatActivity {
    int n,n1,n2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_square);

        EditText squreside = findViewById(R.id.editTextNumber);


        Button button2 = findViewById(R.id.button);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = squreside.getText().toString();
                n = Integer.parseInt(number);
                int ans = n * n;

                TextView textView = findViewById(R.id.textView4);
                textView.setText(String.valueOf(ans));
            }
        });

        Button button = findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n = 0;
                squreside.setText("");
            }
        });


    }}
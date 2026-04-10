package com.example.background_change;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    LinearLayout mainLayout;
    Button btnImage1, btnImage2, btnImage3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainLayout = findViewById(R.id.mainLayout);
        btnImage1 = findViewById(R.id.btnImage1);
        btnImage2 = findViewById(R.id.btnImage2);
        btnImage3 = findViewById(R.id.btnImage3);

        btnImage1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainLayout.setBackgroundResource(R.drawable.bg1);
            }
        });

        btnImage2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainLayout.setBackgroundResource(R.drawable.bg2);
            }
        });

        btnImage3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainLayout.setBackgroundResource(R.drawable.bg3);
            }
        });
    }
}

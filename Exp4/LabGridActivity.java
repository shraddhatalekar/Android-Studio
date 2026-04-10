package com.example.explicit_intent2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class LabGridActivity extends AppCompatActivity {

    ImageView lab1,lab2,lab3,lab4,lab5,lab6,lab7,lab8,lab9,lab10,lab11,lab12;
    Button backBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab_grid);

        lab1=findViewById(R.id.lab1);
        lab2=findViewById(R.id.lab2);
        lab3=findViewById(R.id.lab3);
        lab4=findViewById(R.id.lab4);
        lab5=findViewById(R.id.lab5);
        lab6=findViewById(R.id.lab6);
        lab7=findViewById(R.id.lab7);
        lab8=findViewById(R.id.lab8);
        lab9=findViewById(R.id.lab9);
        lab10=findViewById(R.id.lab10);
        lab11=findViewById(R.id.lab11);
        lab12=findViewById(R.id.lab12);

        backBtn=findViewById(R.id.backBtn);

        backBtn.setOnClickListener(v -> finish());

        lab1.setOnClickListener(v -> openLab("Programming Lab"));
        lab2.setOnClickListener(v -> openLab("Networking Lab"));
        lab3.setOnClickListener(v -> openLab("Database Lab"));
        lab4.setOnClickListener(v -> openLab("AI Lab"));
        lab5.setOnClickListener(v -> openLab("Machine Learning Lab"));
        lab6.setOnClickListener(v -> openLab("Cyber Security Lab"));
        lab7.setOnClickListener(v -> openLab("Software Engineering Lab"));
        lab8.setOnClickListener(v -> openLab("Cloud Computing Lab"));
        lab9.setOnClickListener(v -> openLab("Mobile Development Lab"));
        lab10.setOnClickListener(v -> openLab("Data Science Lab"));
        lab11.setOnClickListener(v -> openLab("IoT Lab"));
        lab12.setOnClickListener(v -> openLab("Hardware Lab"));
    }

    void openLab(String labname){
        Intent i = new Intent(LabGridActivity.this, LabDetailActivity.class);
        i.putExtra("labname",labname);
        startActivity(i);
    }
}
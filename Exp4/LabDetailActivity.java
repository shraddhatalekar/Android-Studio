package com.example.explicit_intent2;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class LabDetailActivity extends AppCompatActivity {

    TextView labDesc;
    Button backBtn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab_detail);

        labDesc = findViewById(R.id.labDesc);
        backBtn2 = findViewById(R.id.backBtn2);

        String lab = getIntent().getStringExtra("labname");

        if(lab!=null){

            if(lab.equals("Programming Lab"))
                labDesc.setText("PCs have Intel Core i3/i5 processor, 8 GB RAM and 500 GB storage.\n" +
                        "They run C, C++, Java compilers and programming software..");

            else if(lab.equals("Networking Lab"))
                labDesc.setText("PCs have Intel Core i3/i5 processor, 8 GB RAM and 500 GB storage.\n" +
                        "They run C, C++, Java compilers and programming software..");

            else if(lab.equals("Database Lab"))
                labDesc.setText("PCs have Intel Core i3/i5 processor, 8 GB RAM and 500 GB storage.\n" +
                        "They run C, C++, Java compilers and programming software..");

            else if(lab.equals("AI Lab"))
                labDesc.setText("PCs have Intel Core i3/i5 processor, 8 GB RAM and 500 GB storage.\n" +
                        "They run C, C++, Java compilers and programming software..");

            else if(lab.equals("Machine Learning Lab"))
                labDesc.setText("PCs have Intel Core i3/i5 processor, 8 GB RAM and 500 GB storage.\n" +
                        "They run C, C++, Java compilers and programming software..");

            else if(lab.equals("Cyber Security Lab"))
                labDesc.setText("PCs have Intel Core i3/i5 processor, 8 GB RAM and 500 GB storage.\n" +
                        "They run C, C++, Java compilers and programming software..");

            else if(lab.equals("Software Engineering Lab"))
                labDesc.setText("PCs have Intel Core i3/i5 processor, 8 GB RAM and 500 GB storage.\n" +
                        "They run C, C++, Java compilers and programming software..");

            else if(lab.equals("Cloud Computing Lab"))
                labDesc.setText("PCs have Intel Core i3/i5 processor, 8 GB RAM and 500 GB storage.\n" +
                        "They run C, C++, Java compilers and programming software..");

            else if(lab.equals("Mobile Development Lab"))
                labDesc.setText("PCs have Intel Core i3/i5 processor, 8 GB RAM and 500 GB storage.\n" +
                        "They run C, C++, Java compilers and programming software..");

            else if(lab.equals("Data Science Lab"))
                labDesc.setText("PCs have Intel Core i3/i5 processor, 8 GB RAM and 500 GB storage.\n" +
                        "They run C, C++, Java compilers and programming software..");

            else if(lab.equals("IoT Lab"))
                labDesc.setText("PCs have Intel Core i3/i5 processor, 8 GB RAM and 500 GB storage.\n" +
                        "They run C, C++, Java compilers and programming software..");

            else if(lab.equals("Hardware Lab"))
                labDesc.setText("PCs have Intel Core i3/i5 processor, 8 GB RAM and 500 GB storage.\n" +
                        "They run C, C++, Java compilers and programming software.");
        }

        backBtn2.setOnClickListener(v -> finish());
    }
}
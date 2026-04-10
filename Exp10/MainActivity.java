package com.example.file_handling;

import android.os.Bundle;
import android.view.View;
import android.widget.*;

import androidx.appcompat.app.AppCompatActivity;

import java.io.*;

public class MainActivity extends AppCompatActivity {

    EditText editTextData;
    Button btnSave, btnRead;
    TextView textViewData;

    String fileName = "myFile.txt";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextData = findViewById(R.id.editTextData);
        btnSave = findViewById(R.id.btnSave);
        btnRead = findViewById(R.id.btnRead);
        textViewData = findViewById(R.id.textViewData);

        // 🔹 Save Data (Write File)
        btnSave.setOnClickListener(v -> {
            String data = editTextData.getText().toString();

            try {
                FileOutputStream fos = openFileOutput(fileName, MODE_PRIVATE);
                fos.write(data.getBytes());
                fos.close();

                Toast.makeText(this, "Data Saved", Toast.LENGTH_SHORT).show();

            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        // 🔹 Retrieve Data (Read File)
        btnRead.setOnClickListener(v -> {

            try {
                FileInputStream fis = openFileInput(fileName);
                BufferedReader reader = new BufferedReader(new InputStreamReader(fis));

                String line;
                StringBuilder data = new StringBuilder();

                while ((line = reader.readLine()) != null) {
                    data.append(line).append("\n");
                }

                fis.close();

                textViewData.setText(data.toString());

            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}
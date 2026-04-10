package com.example.exp6_input_controls;

import android.os.Bundle;
import android.view.View;
import android.widget.*;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText editTextName;
    CheckBox checkPizza, checkBurger;
    RadioGroup radioGroup;
    ToggleButton toggleButton;
    Button buttonSubmit;
    TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        editTextName = findViewById(R.id.editTextName);
        checkPizza = findViewById(R.id.checkPizza);
        checkBurger = findViewById(R.id.checkBurger);
        radioGroup = findViewById(R.id.radioGroup);
        toggleButton = findViewById(R.id.toggleButton);
        buttonSubmit = findViewById(R.id.buttonSubmit);
        textViewResult = findViewById(R.id.textViewResult);


        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = editTextName.getText().toString();


                String food = "";
                if (checkPizza.isChecked()) {
                    food += "Pizza ";
                }
                if (checkBurger.isChecked()) {
                    food += "Burger ";
                }


                int selectedId = radioGroup.getCheckedRadioButtonId();
                RadioButton selectedRadio = findViewById(selectedId);
                String gender = "";
                if (selectedRadio != null) {
                    gender = selectedRadio.getText().toString();
                }


                String toggleStatus;
                if (toggleButton.isChecked()) {
                    toggleStatus = "ON";
                } else {
                    toggleStatus = "OFF";
                }


                String result = "Name: " + name +
                        "\nFood: " + food +
                        "\nGender: " + gender +
                        "\nToggle: " + toggleStatus;

                textViewResult.setText(result);


                Toast.makeText(MainActivity.this, "Data Submitted", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
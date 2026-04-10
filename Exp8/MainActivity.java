package com.example.exp8_menus;

import android.os.Bundle;
import android.view.*;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button btnPopup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        btnPopup = findViewById(R.id.btnPopup);

        // Register Context Menu
        registerForContextMenu(textView);

        // Popup Menu Event
        btnPopup.setOnClickListener(v -> {
            PopupMenu popupMenu = new PopupMenu(MainActivity.this, btnPopup);
            popupMenu.getMenuInflater().inflate(R.menu.menu_popup, popupMenu.getMenu());

            popupMenu.setOnMenuItemClickListener(item -> {
                Toast.makeText(MainActivity.this,
                        item.getTitle() + " clicked",
                        Toast.LENGTH_SHORT).show();
                return true;
            });

            popupMenu.show();
        });
    }

    // 🔹 Options Menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_options, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Toast.makeText(this,
                item.getTitle() + " selected",
                Toast.LENGTH_SHORT).show();
        return true;
    }

    // 🔹 Context Menu
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.menu_context, menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        Toast.makeText(this,
                item.getTitle() + " selected",
                Toast.LENGTH_SHORT).show();
        return true;
    }
}
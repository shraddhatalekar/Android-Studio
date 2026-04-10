package com.example.exp9_notification;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

public class MainActivity extends AppCompatActivity {

    Button btnNotify;
    String CHANNEL_ID = "my_channel_id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNotify = findViewById(R.id.btnNotify);

        // Create Notification Channel (for Android 8+)
        createNotificationChannel();

        btnNotify.setOnClickListener(v -> showNotification());
    }

    // Method to show notification
    private void showNotification() {

        NotificationCompat.Builder builder =
                new NotificationCompat.Builder(this, CHANNEL_ID)
                        .setSmallIcon(android.R.drawable.ic_dialog_info)
                        .setContentTitle("My Notification")
                        .setContentText("Hello! This is a notification.")
                        .setPriority(NotificationCompat.PRIORITY_DEFAULT);

        NotificationManager manager =
                (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

        manager.notify(1, builder.build());
    }

    // Create channel (important)
    private void createNotificationChannel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {

            NotificationChannel channel =
                    new NotificationChannel(
                            CHANNEL_ID,
                            "My Channel",
                            NotificationManager.IMPORTANCE_DEFAULT
                    );

            NotificationManager manager =
                    getSystemService(NotificationManager.class);

            manager.createNotificationChannel(channel);
        }
    }
}
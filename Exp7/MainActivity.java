package com.example.exp7_ratingbar_progressbar;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.*;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    RatingBar ratingBar;
    Button btnRate, btnStart, btnLoad;
    TextView txtRating, txtProgress;
    ProgressBar progressBar, circularProgress;

    int progressStatus = 0;
    Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Linking
        ratingBar = findViewById(R.id.ratingBar);
        btnRate = findViewById(R.id.btnRate);
        txtRating = findViewById(R.id.txtRating);

        progressBar = findViewById(R.id.progressBar);
        txtProgress = findViewById(R.id.txtProgress);
        btnStart = findViewById(R.id.btnStart);

        circularProgress = findViewById(R.id.circularProgress);
        btnLoad = findViewById(R.id.btnLoad);

        // ⭐ Rating Event
        btnRate.setOnClickListener(v -> {
            float rating = ratingBar.getRating();
            txtRating.setText("You Rated: " + rating);
            Toast.makeText(this, "Rating Submitted", Toast.LENGTH_SHORT).show();
        });

        // ⏳ Determinate Progress (0-100)
        btnStart.setOnClickListener(v -> {
            progressStatus = 0;

            new Thread(() -> {
                while (progressStatus < 100) {
                    progressStatus += 10;

                    handler.post(() -> {
                        progressBar.setProgress(progressStatus);
                        txtProgress.setText("Progress: " + progressStatus + "%");
                    });

                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        });

        // 🔄 Indeterminate Circular Progress
        btnLoad.setOnClickListener(v -> {

            circularProgress.setVisibility(View.VISIBLE);

            // Simulate loading for 3 seconds
            handler.postDelayed(() -> {
                circularProgress.setVisibility(View.GONE);
                Toast.makeText(this, "Loading Complete", Toast.LENGTH_SHORT).show();
            }, 3000);
        });
    }
}
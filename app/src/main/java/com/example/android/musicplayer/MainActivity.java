package com.example.android.musicplayer;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {
    private MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mp = MediaPlayer.create(this, R.raw.heroes);

        View playButton = findViewById(R.id.play_button);
        assert playButton != null;
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackbar = Snackbar
                        .make(findViewById(android.R.id.content), "Playing song", Snackbar.LENGTH_SHORT);

                snackbar.show();
                mp.start();
            }
        });

        View pauseButton = findViewById(R.id.pause_button);
        assert pauseButton != null;
        pauseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackbar = Snackbar
                        .make(findViewById(android.R.id.content), "Pausing song", Snackbar.LENGTH_SHORT);

                snackbar.show();
                mp.pause();
            }
        });
    }
}

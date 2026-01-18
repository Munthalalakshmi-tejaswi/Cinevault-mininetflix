package com.example.mininetflix;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;
import androidx.appcompat.app.AppCompatActivity;

public class MovieDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 1. MUST set the layout first
        setContentView(R.layout.activity_movie_detail);

        // 2. Now find the views
        VideoView videoView = findViewById(R.id.videoPlayer);
        TextView titleTxt = findViewById(R.id.detailTitle);
        TextView descTxt = findViewById(R.id.detailDesc);

        // 3. Get the data from Intent
        Movie movie = (Movie) getIntent().getSerializableExtra("movie_data");

        if (movie != null) {
            titleTxt.setText(movie.getTitle());
            descTxt.setText(movie.getDescription());

            // 4. Setup Video Path from res/raw
            String videoPath = "android.resource://" + getPackageName() + "/" + movie.getVideoRes();
            videoView.setVideoURI(Uri.parse(videoPath));

            // 5. Add Play/Pause Controls
            MediaController mediaController = new MediaController(this);
            videoView.setMediaController(mediaController);
            mediaController.setAnchorView(videoView);

            // 6. Play on Click
            videoView.setOnClickListener(v -> {
                if (!videoView.isPlaying()) {
                    videoView.start();
                } else {
                    videoView.pause();
                }
            });
        }
    }
}

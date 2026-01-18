package com.example.mininetflix;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1. Initialize the RecyclerView from your activity_main.xml
        RecyclerView rvTrending = findViewById(R.id.rvTrending);

        // 2. Set LayoutManager (Vertical list for 5 movies)
        rvTrending.setLayoutManager(new LinearLayoutManager(this));

        // 3. Create the data list for 5 movies
        // Note: Ensure images are in res/drawable and videos are in res/raw
        List<Movie> movieList = new ArrayList<>();
        movieList.add(new Movie("Bahubali", "The beginning of a legend.", R.drawable.bahubali, R.raw.bahubali));
        movieList.add(new Movie("Pushpa", "The rise of a smuggler.", R.drawable.pushpa, R.raw.pushpa));
        movieList.add(new Movie("Jersey", "A cricketer's second chance.", R.drawable.jersey, R.raw.jersey));
        movieList.add(new Movie("Manam", "A beautiful family story.", R.drawable.manam, R.raw.manam));
        movieList.add(new Movie("RRR", "A high-stakes action drama.", R.drawable.rrr, R.raw.rrr));

        // 4. Initialize Adapter with Click Listener
        MovieAdapter adapter = new MovieAdapter(movieList, movie -> {
            // When a movie is clicked, open MovieDetailActivity
            Intent intent = new Intent(MainActivity.this, MovieDetailActivity.class);
            intent.putExtra("movie_data", movie); // Passing the serializable Movie object
            startActivity(intent);
        });

        // 5. Set the adapter to the RecyclerView
        rvTrending.setAdapter(adapter);
    }
}

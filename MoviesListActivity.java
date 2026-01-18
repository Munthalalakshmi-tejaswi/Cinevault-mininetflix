package com.example.mininetflix;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MoviesListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Ensure this layout file name exists in res/layout
        setContentView(R.layout.activity_movies_list);

        // Link the RecyclerView
        RecyclerView recyclerView = findViewById(R.id.rvMoviesList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Create the list of 5 movies
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Bahubali", "The beginning of a legend.", R.drawable.bahubali, R.raw.bahubali));
        movies.add(new Movie("Pushpa", "The rise of a smuggler.", R.drawable.pushpa, R.raw.pushpa));
        movies.add(new Movie("Jersey", "A cricketer's second chance.", R.drawable.jersey, R.raw.jersey));
        movies.add(new Movie("Manam", "A beautiful family story.", R.drawable.manam, R.raw.manam));
        movies.add(new Movie("RRR", "A fierce revolutionary tale.", R.drawable.rrr, R.raw.rrr));

        // Initialize Adapter with the Click Listener
        MovieAdapter adapter = new MovieAdapter(movies, movie -> {
            // Navigate to Detail Screen when a movie is clicked
            Intent intent = new Intent(MoviesListActivity.this, MovieDetailActivity.class);
            intent.putExtra("movie_data", movie);
            startActivity(intent);
        });

        recyclerView.setAdapter(adapter);
    }
}

package com.kekiel.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /**
     * Triggers a toast message onClick.
     * Will be applied to any button in this view.
     */
    private View.OnClickListener anyClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String toastText = getString(R.string.message_this_will_start_app) + ((Button) v).getText().toString();
            Toast.makeText(getApplicationContext(),toastText, Toast.LENGTH_SHORT).show();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Let the buttons do some action.
        Button popMoviesButton = (Button) findViewById(R.id.button_popular_movies);
        popMoviesButton.setOnClickListener(anyClickListener);
        Button footballAppButton = (Button) findViewById(R.id.button_football_scores);
        footballAppButton.setOnClickListener(anyClickListener);
        Button libraryAppButton = (Button) findViewById(R.id.button_library_app);
        libraryAppButton.setOnClickListener(anyClickListener);
        Button buildBiggerAppButton = (Button) findViewById(R.id.button_build_it_bigger);
        buildBiggerAppButton.setOnClickListener(anyClickListener);
        Button xyzAppButton = (Button) findViewById(R.id.button_xyz_reader);
        xyzAppButton.setOnClickListener(anyClickListener);
        Button capstoneAppButton = (Button) findViewById(R.id.button_capstone);
        capstoneAppButton.setOnClickListener(anyClickListener);

    }

}
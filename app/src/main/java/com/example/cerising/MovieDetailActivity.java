package com.example.cerising;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MovieDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detail);

        // Inisialisasi views
        ImageView imageMovieDetail = findViewById(R.id.imageMovieDetail);
        TextView titleMovieDetail = findViewById(R.id.titleMovieDetail);
        TextView descMovieDetail = findViewById(R.id.descMovieDetail);
        Button btnBack = findViewById(R.id.btnBack);

        // Mengambil data dari intent
        String movieId = getIntent().getStringExtra("movie_id");
        String movieTitle = getIntent().getStringExtra("movie_title");
        String movieDesc = getIntent().getStringExtra("movie_desc");

        // Set judul dan deskripsi
        titleMovieDetail.setText(movieTitle);
        descMovieDetail.setText(movieDesc);

        // Set gambar berdasarkan movie ID
        switch (movieId) {
            case "spiderman":
                imageMovieDetail.setImageResource(R.drawable.spiderman_thumbnail);
                break;
            case "ironman":
                imageMovieDetail.setImageResource(R.drawable.ironman_thumbnail);
                break;
            case "hulk":
                imageMovieDetail.setImageResource(R.drawable.hulk_thumbnail);
                break;
            case "thor":
                imageMovieDetail.setImageResource(R.drawable.thor_thumbnail);
                break;
            case "captain_america":
                imageMovieDetail.setImageResource(R.drawable.captain_america_thumbnail);
                break;
            case "black_widow":
                imageMovieDetail.setImageResource(R.drawable.black_widow_thumbnail);
                break;
        }

        // Set onclick listener untuk tombol kembali
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // Kembali ke activity sebelumnya
            }
        });
    }
}
package com.example.cerising;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btnSpiderman = findViewById(R.id.btnSpiderman);
        Button btnIronMan = findViewById(R.id.btnIronMan);
        Button btnHulk = findViewById(R.id.btnHulk);
        Button btnThor = findViewById(R.id.btnThor);
        Button btnCaptainAmerica = findViewById(R.id.btnCaptainAmerica);
        Button btnBlackWidow = findViewById(R.id.btnBlackWidow);

        // OnClickListener untuk Spiderman
        btnSpiderman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MovieDetailActivity.class);
                intent.putExtra("movie_id", "spiderman");
                intent.putExtra("movie_title", "Spider-Man (2002)");
                intent.putExtra("movie_desc", "Spider-Man (2002) adalah film superhero yang disutradarai oleh Sam Raimi dan merupakan adaptasi dari karakter Marvel Comics, Spider-Man. Film ini mengisahkan asal-usul Peter Parker (diperankan oleh Tobey Maguire), seorang remaja biasa yang berubah menjadi superhero setelah mendapatkan kekuatan super.\n\n" +
                        "Cerita dimulai dengan Peter Parker, seorang siswa SMA yang cerdas namun sering dibuli. Ia tinggal bersama paman dan bibinya, Ben dan May Parker. Peter jatuh cinta pada teman masa kecilnya, Mary Jane Watson, namun ia merasa tidak cukup berani untuk mengungkapkan perasaannya.\n\n" +
                        "Suatu hari, saat mengikuti kunjungan ilmiah ke sebuah laboratorium, Peter digigit oleh seekor laba-laba yang terpapar sinar radiasi. Akibat gigitan tersebut, Peter mulai merasakan perubahan aneh pada tubuhnya dan mendapatkan kekuatan super.");
                startActivity(intent);
            }
        });

        // OnClickListener untuk Iron Man
        btnIronMan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MovieDetailActivity.class);
                intent.putExtra("movie_id", "ironman");
                intent.putExtra("movie_title", "Iron Man (2008)");
                intent.putExtra("movie_desc", "Film Iron Man (2008) mengisahkan tentang Tony Stark (diperankan oleh Robert Downey Jr.), seorang miliarder, jenius, dan playboy yang mengelola perusahaan senjata terkemuka Stark Industries. Tony dikenal sebagai sosok yang sangat percaya diri, namun kurang peduli terhadap dampak dari senjata yang diproduksi oleh perusahaannya.\n\n" +
                        "Suatu ketika, saat dalam perjalanan ke Afghanistan untuk memperkenalkan senjata terbaru dari Stark Industries, Tony diculik oleh kelompok teroris. Selama dalam tahanan, ia menciptakan baju zirah canggih yang memungkinkannya melarikan diri.\n\n" +
                        "Setelah kembali ke Amerika, Tony memutuskan untuk mengubah arah perusahaannya dan menggunakan teknologinya untuk kebaikan manusia sebagai Iron Man.");
                startActivity(intent);
            }
        });

        // OnClickListener untuk Hulk
        btnHulk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MovieDetailActivity.class);
                intent.putExtra("movie_id", "hulk");
                intent.putExtra("movie_title", "The Incredible Hulk (2008)");
                intent.putExtra("movie_desc", "The Incredible Hulk (2008) mengisahkan tentang Dr. Bruce Banner (diperankan oleh Edward Norton), seorang ilmuwan brilian yang terkena radiasi gamma dalam sebuah kecelakaan laboratorium. Akibatnya, setiap kali ia marah atau stres, ia berubah menjadi monster hijau raksasa yang dikenal sebagai Hulk.\n\n" +
                        "Bruce melarikan diri dari kejaran militer yang ingin menggunakan kekuatannya sebagai senjata. Dalam pelariannya, ia mencoba mencari obat untuk menyembuhkan kondisinya sambil menghindari konfrontasi yang bisa memicu transformasinya.\n\n" +
                        "Situasi menjadi lebih rumit ketika Emil Blonsky, seorang tentara, berubah menjadi monster yang lebih kuat yang dikenal sebagai Abomination.");
                startActivity(intent);
            }
        });

        // OnClickListener untuk Thor
        btnThor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MovieDetailActivity.class);
                intent.putExtra("movie_id", "thor");
                intent.putExtra("movie_title", "Thor (2011)");
                intent.putExtra("movie_desc", "Thor (2011) mengisahkan tentang Thor (diperankan oleh Chris Hemsworth), pangeran yang sombong dari Asgard, sebuah kerajaan dewa Norse. Karena tindakannya yang ceroboh hampir memicu perang, ayahnya Odin menghukumnya dengan mengasingkannya ke Bumi dan mencabut kekuatannya.\n\n" +
                        "Di Bumi, Thor bertemu dengan Jane Foster (Natalie Portman), seorang ilmuwan astrofisika, yang membantunya beradaptasi dengan kehidupan manusia. Sementara itu, saudara angkatnya Loki mengambil alih tahta Asgard dan mengirim Destroyer untuk membunuh Thor.\n\n" +
                        "Thor harus belajar tentang kerendahan hati dan pengorbanan untuk membuktikan bahwa dia layak mendapatkan kembali kekuatannya dan melindungi kedua dunia yang dia cintai.");
                startActivity(intent);
            }
        });

        // OnClickListener untuk Captain America
        btnCaptainAmerica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MovieDetailActivity.class);
                intent.putExtra("movie_id", "captain_america");
                intent.putExtra("movie_title", "Captain America: The First Avenger (2011)");
                intent.putExtra("movie_desc", "Captain America: The First Avenger (2011) mengisahkan tentang Steve Rogers (Chris Evans), seorang pemuda lemah dari Brooklyn yang berkali-kali ditolak untuk mendaftar militer selama Perang Dunia II. Kesempatannya datang ketika ia dipilih untuk program super-soldier rahasia.\n\n" +
                        "Setelah transformasi fisiknya menjadi super-soldier sempurna, Rogers bergabung dengan pasukan sekutu untuk melawan HYDRA, organisasi ilmiah Nazi yang dipimpin oleh Red Skull. Dalam misinya, ia dibantu oleh Peggy Carter dan sahabatnya Bucky Barnes.\n\n" +
                        "Film ini menceritakan bagaimana seorang pria biasa dengan hati yang besar menjadi simbol harapan dan keberanian bagi seluruh dunia.");
                startActivity(intent);
            }
        });

        // OnClickListener untuk Black Widow
        btnBlackWidow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MovieDetailActivity.class);
                intent.putExtra("movie_id", "black_widow");
                intent.putExtra("movie_title", "Black Widow (2021)");
                intent.putExtra("movie_desc", "Black Widow (2021) mengisahkan masa lalu Natasha Romanoff (Scarlett Johansson) yang selama ini tersembunyi. Berlatar waktu antara Captain America: Civil War dan Avengers: Infinity War, film ini mengungkap rahasia kelam dari masa lalu Natasha sebagai mata-mata.\n\n" +
                        "Ketika sebuah konspirasi berbahaya yang terkait dengan masa lalunya muncul, Natasha harus menghadapi sejarah gelapnya sebagai agen Red Room dan hubungan yang rusak yang ditinggalkannya sebelum menjadi Avenger.\n\n" +
                        "Dipertemukan kembali dengan keluarga lamanya - Yelena Belova, Melina Vostokoff, dan Alexei Shostakov - Natasha harus bekerja sama dengan mereka untuk menghancurkan program Red Room yang berbahaya dan menghadapi musuh mematikan bernama Taskmaster.");
                startActivity(intent);
            }
        });
    }
}
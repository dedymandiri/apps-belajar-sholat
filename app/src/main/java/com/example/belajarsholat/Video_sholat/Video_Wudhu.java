package com.example.belajarsholat.Video_sholat;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.belajarsholat.R;

public class Video_Wudhu extends AppCompatActivity {
    private VideoView videoView;
    private MediaController mediaController;
    private Button playVideo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_wudhu);

        //Inisialisasi VideoView, MediaController dan Button
        videoView = findViewById(R.id.videowudhu);
        playVideo = findViewById(R.id.playwudhu);
        mediaController = new MediaController(this);


        //Menjalankan Video saat tombol Play di Klik
        playVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Variable Uri untuk menentukan lokasi Resource Video yang akan ditampilkan
                Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.berwudhu);

                videoView.setVideoURI(uri);

                //Memasang MediaController untuk menampilkan tombol play, pause, dsb
                videoView.setMediaController(mediaController);
                mediaController.setAnchorView(videoView);

                //Menjalankan Video
                videoView.start();
            }
        });
    }
}
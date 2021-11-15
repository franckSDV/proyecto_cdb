package com.example.proyectocdb;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;

public class Home_act extends AppCompatActivity {

    private VideoView video;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        video = findViewById(R.id.vwvideo);

        //obtengo ruta del video
        String ruta ="android.resource://"+getPackageName()+"/"+R.raw.videocdb;
        Uri uri = Uri.parse(ruta);
        video.setVideoURI(uri);

        video.start();
    }
}
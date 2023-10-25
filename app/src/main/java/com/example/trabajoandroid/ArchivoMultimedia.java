package com.example.trabajoandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.VideoView;

public class ArchivoMultimedia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_archivo_multimedia);
        VideoView MiVideito = findViewById(R.id.videoView);

        String videito = "android.resourse://"+getPackageName()+"/"+R.raw.nyancat;
        Uri uri = Uri.parse(videito);
        MiVideito.setVideoURI(uri);
    }

}
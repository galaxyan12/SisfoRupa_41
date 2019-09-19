package com.praktikum.sisforupa_41;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void GoToSimulasi(View view){
        Intent intent = new Intent(this, simulasi.class);
        startActivity(intent);
    }

    public void GoToCuaca(View view){
        Intent intent = new Intent(this, cuaca.class);
        startActivity(intent);
    }

    public void GoToProfile(View view){
        Intent intent = new Intent(this, profile.class);
        startActivity(intent);
    }

    public void GoToNilai(View view){
        Intent intent = new Intent(this, nilai.class);
        startActivity(intent);
    }

    public void GoToMusic(View view){
        Intent intent = new Intent(this, music.class);
        startActivity(intent);
    }

    public void GoToTranscript(View view){
        Intent intent = new Intent(this, transcript.class);
        startActivity(intent);
    }

    public void GoToSaran(View view){
        Intent intent = new Intent(this, saran.class);
        startActivity(intent);
    }

    public void GoToSetting(View view){
        Intent intent = new Intent(this, setting.class);
        startActivity(intent);
    }

    public void GoToAbout(View view){
        Intent intent = new Intent(this, about.class);
        startActivity(intent);
    }
}

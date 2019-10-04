package com.praktikum.sisforupa_41;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
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

    public void bukaMaps(View view){
        String ordinat = "-0.0568216,109.3448434";
        Uri gmmIntentUri = Uri.parse("geo:"+ordinat);
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);
    }

    public void telponNomor(View view){
        Uri uri = Uri.parse("tel:082256006914");
        Intent it = new Intent(Intent.ACTION_DIAL,uri);
        startActivity(it);
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

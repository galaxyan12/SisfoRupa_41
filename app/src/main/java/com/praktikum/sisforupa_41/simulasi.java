package com.praktikum.sisforupa_41;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class simulasi extends AppCompatActivity {

    EditText txtkehadiran, txttugas, txtuts, txtuas;
    Button btnhitung;
    TextView txthasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simulasi);

        txtkehadiran=findViewById(R.id.kehadiran);
        txttugas=findViewById(R.id.tugas);
        txtuts=findViewById(R.id.uts);
        txtuas=findViewById(R.id.uas);
        btnhitung=findViewById(R.id.hitung);
        txthasil=findViewById(R.id.hasil);

        btnhitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int nk, nt, nuts, nuas, mutu;

                if (txtkehadiran.getText().toString().isEmpty()) {
                    txtkehadiran.setError("harap diisi dahulu");
                    return;
                }
                if (txttugas.getText().toString().isEmpty()) {
                    txttugas.setError("harap diisi dahulu");
                    return;
                }
                if (txtuts.getText().toString().isEmpty()) {
                    txtuts.setError("harap diisi dahulu");
                    return;
                }
                if (txtuas.getText().toString().isEmpty()) {
                    txtuas.setError("harap diisi dahulu");
                    return;
                }

                nk = Integer.parseInt(txtkehadiran.getText().toString());
                nt = Integer.parseInt(txttugas.getText().toString());
                nuts = Integer.parseInt(txtuts.getText().toString());
                nuas = Integer.parseInt(txtuts.getText().toString());

                if (nk < 12){
                    nuts = 0;
                    nuas = 0;
                } else if (nk > 16) {
                    nk = 16;
                } else {
                    nk = nk;
                }

                mutu = (int) (nk*0.625 + nt*0.2 + nuts*0.3 + nuas*0.4);

                if (mutu >= 80){
                    txthasil.setText("A");
                } else if (mutu >= 75) {
                    txthasil.setText("B+");
                } else if (mutu >= 70) {
                    txthasil.setText("B");
                } else if (mutu >= 65) {
                    txthasil.setText("C+");
                } else if (mutu >= 60) {
                    txthasil.setText("C");
                } else if (mutu >= 55) {
                    txthasil.setText("D+");
                } else if (mutu >= 50) {
                    txthasil.setText("D");
                } else {
                    txthasil.setText("E");
                }

            }
        });
    }
}

package com.example.listviewpresiden;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DataPresiden extends AppCompatActivity {


    private TextView Getnama, Gettempattanggallahir, Getmasajabatan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_presiden);
        getSupportActionBar().setTitle("Data Presiden");
        Getnama = findViewById(R.id.getnama);
        Gettempattanggallahir = findViewById(R.id.tempattanggallahir);
        Getmasajabatan = findViewById(R.id.getmasajabatan);
        showData();
    }

    @SuppressLint("SetTextI18n")
    private void showData(){

        String nama = getIntent().getExtras().getString("MyName");


        switch (nama){
            case "Soekarno":
                Getnama.setText("Nama: Soekarno");
                Gettempattanggallahir.setText(": Blitar 6 Juni 1901");
                Getmasajabatan.setText("Masa Jabatan: 1945-1966");
                break;

            case "Soeharto":
                Getnama.setText("Nama: Soeharto");
                Gettempattanggallahir.setText(": Yogyakarta 8 Juni 1921");
                Getmasajabatan.setText("Masa Jabatan: 1966-1980");
                break;

            case "B.J Habibie":
                Getnama.setText("Nama: B.J Habibie");
                Gettempattanggallahir.setText(": Sulsel 25 Juni 1936");
                Getmasajabatan.setText("Masa Jabatan: 1998-1999");
                break;

            case "Abdurrahman Wahid":
                Getnama.setText("Nama: Abdurrahman Wahid");
                Gettempattanggallahir.setText(": Jombang 4 Agustus 1940");
                Getmasajabatan.setText("Masa Jabatan: 1999-2001");
                break;
            case "Megawati Soekarno":
                Getnama.setText("Nama: Megawati Soekarno");
                Gettempattanggallahir.setText(": Yogyakarta 23 Januari 1947");
                Getmasajabatan.setText("Masa Jabatan: 2001-2004");
                break;
            case "Susilo Bambang Yudhoyono":
                Getnama.setText("Nama: Susilo Bambang Yudhoyono");
                Gettempattanggallahir.setText(": Pacitan 9 September 1949");
                Getmasajabatan.setText("Masa Jabatan: 2004-2014");
                break;
            case "Joko Widodo":
                Getnama.setText("Nama: Joko Widodo");
                Gettempattanggallahir.setText(": Surakarta 21 Juni 1961");
                Getmasajabatan.setText("Masa Jabatan: 2014-sekarang");
                break;
        }
    }
}

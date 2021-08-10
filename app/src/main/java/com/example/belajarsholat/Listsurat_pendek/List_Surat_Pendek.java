package com.example.belajarsholat.Listsurat_pendek;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.belajarsholat.R;

public class List_Surat_Pendek extends AppCompatActivity {
    ListView listView;
    ArrayAdapter<String> adapter;
    Intent intent;
    ListView listview;

    String e [] = {
            "Surat Al-Fatihah", "Surat An-Nas", "Surat Al-Falaq", "Surat Al-Ikhlas", "Surat Al-Lahab",
            "Surat An-Nasr", "Surat Al-Kafirun", "Surat Al-Kausar", "Surat Al-Ma’un", "Surat Quraisy",
            "Surat Al-Fil", "Surat Al-Humazah", "Surat Al-‘Asr", "Surat At-Takasur", "Surat Al-Qari’ah",

            "Surat Al-‘Adiyat", "Surat  Al-Zalzalah", "Surat Al-Bayyinah", "Surat Al-Qadr", "Surat Al-‘Alaq",
            "Surat At-Tin", "Surat Al-Insyirah", "Surat Ad-Dhuha", "Surat Al-Lail", "Surat Asy-Syams",
            "Surat Al-Balad", "Surat Al-Fajr", "Surat Al-Ghasyiyah", "Surat Al-A’la", "Surat Ath-Thariq",

            "Surat Al-Buruj", "Surat Al-Insyiqaq", "Surat Al-Muthaffifin", "Surat Al-Infithar", "Surat At-Takwir",
            "Surat ‘Abasa", "Surat An-Nazi’at ", "Surat An-Naba’"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_surat_pendek);


        listView = (ListView) findViewById(R.id.listview);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, e);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) {
                    intent = new Intent(List_Surat_Pendek.this, Alfatihah.class);
                    startActivity(intent);
                } else if (position == 1) {
                    intent = new Intent(List_Surat_Pendek.this, Annas.class);
                    startActivity(intent);
                } else if (position == 2) {
                    intent = new Intent(List_Surat_Pendek.this, Alfalaq.class);
                    startActivity(intent);
                } else if (position == 3) {
                    intent = new Intent(List_Surat_Pendek.this, Alikhlas.class);
                    startActivity(intent);
                } else if (position == 4) {
                    intent = new Intent(List_Surat_Pendek.this, Allahab.class);
                    startActivity(intent);
                } else if (position == 5) {
                    intent = new Intent(List_Surat_Pendek.this, Annasr.class);
                    startActivity(intent);
                } else if (position == 6) {
                    intent = new Intent(List_Surat_Pendek.this, Alkafirun.class);
                    startActivity(intent);
                } else if (position == 7) {
                    intent = new Intent(List_Surat_Pendek.this, Alkausar.class);
                    startActivity(intent);
                } else if (position == 8) {
                    intent = new Intent(List_Surat_Pendek.this, Almaun.class);
                    startActivity(intent);
                } else if (position == 9) {
                    intent = new Intent(List_Surat_Pendek.this, Quraisy.class);
                    startActivity(intent);
                } else if (position == 10) {
                    intent = new Intent(List_Surat_Pendek.this, Alfiil.class);
                    startActivity(intent);
                } else if (position == 11) {
                    intent = new Intent(List_Surat_Pendek.this, Alhumazah.class);
                    startActivity(intent);
                } else if (position == 12) {
                    intent = new Intent(List_Surat_Pendek.this, Alasr.class);
                    startActivity(intent);
                } else if (position == 13) {
                    intent = new Intent(List_Surat_Pendek.this, Attakasur.class);
                    startActivity(intent);
                } else if (position == 14) {
                    intent = new Intent(List_Surat_Pendek.this, Alqoriah.class);
                    startActivity(intent);
                } else if (position == 15) {
                    intent = new Intent(List_Surat_Pendek.this, Alaadiyat.class);
                    startActivity(intent);
                } else if (position == 16) {
                    intent = new Intent(List_Surat_Pendek.this, Alzalzalah.class);
                    startActivity(intent);
                } else if (position == 17) {
                    intent = new Intent(List_Surat_Pendek.this, Albayyinah.class);
                    startActivity(intent);
                } else if (position == 18) {
                    intent = new Intent(List_Surat_Pendek.this, Alqodr.class);
                    startActivity(intent);
                } else if (position == 19) {
                    intent = new Intent(List_Surat_Pendek.this, Alalaq.class);
                    startActivity(intent);
                } else if (position == 20) {
                    intent = new Intent(List_Surat_Pendek.this, Attiin.class);
                    startActivity(intent);
                } else if (position == 21) {
                    intent = new Intent(List_Surat_Pendek.this, Alinsyirah.class);
                    startActivity(intent);
                } else if (position == 22) {
                    intent = new Intent(List_Surat_Pendek.this, Adduha.class);
                    startActivity(intent);
                } else if (position == 23) {
                    intent = new Intent(List_Surat_Pendek.this, Allail.class);
                    startActivity(intent);
                } else if (position == 24) {
                    intent = new Intent(List_Surat_Pendek.this, Assyams.class);
                    startActivity(intent);
                } else if (position == 25) {
                    intent = new Intent(List_Surat_Pendek.this, Albalad.class);
                    startActivity(intent);
                } else if (position == 26) {
                    intent = new Intent(List_Surat_Pendek.this, Alfajr.class);
                    startActivity(intent);
                } else if (position == 27) {
                    intent = new Intent(List_Surat_Pendek.this, Alghasiyah.class);
                    startActivity(intent);
                } else if (position == 28) {
                    intent = new Intent(List_Surat_Pendek.this, Alalaa.class);
                    startActivity(intent);
                } else if (position == 29) {
                    intent = new Intent(List_Surat_Pendek.this, Atthoriq.class);
                    startActivity(intent);
                } else if (position == 30) {
                    intent = new Intent(List_Surat_Pendek.this, Alburuj.class);
                    startActivity(intent);
                } else if (position == 31) {
                    intent = new Intent(List_Surat_Pendek.this, Alinsyiqiq.class);
                    startActivity(intent);
                } else if (position == 32) {
                    intent = new Intent(List_Surat_Pendek.this, Almutaffifin.class);
                    startActivity(intent);
                } else if (position == 33) {
                    intent = new Intent(List_Surat_Pendek.this, Alinfithar.class);
                    startActivity(intent);
                } else if (position == 34) {
                    intent = new Intent(List_Surat_Pendek.this, Attakwir.class);
                    startActivity(intent);
                } else if (position == 33) {
                    intent = new Intent(List_Surat_Pendek.this, Abasaa.class);
                    startActivity(intent);
                } else if (position == 34) {
                    intent = new Intent(List_Surat_Pendek.this, Annaziat.class);
                    startActivity(intent);
                } else if (position == 35) {
                    intent = new Intent(List_Surat_Pendek.this, Annaba.class);
                    startActivity(intent);
                } else {
                    Toast t = Toast.makeText(List_Surat_Pendek.this, e[position], Toast.LENGTH_SHORT);
                    t.setGravity(Gravity.CENTER | Gravity.CENTER, 0, 0);
                    t.show();
                }
            }
        });

    }
}

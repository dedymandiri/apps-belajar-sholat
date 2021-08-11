package com.example.belajarsholat.Fitur_latihan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.belajarsholat.R;
import com.example.belajarsholat.Session.SessionManager;
import com.example.belajarsholat.api.ApiClient;
import com.example.belajarsholat.api.ApiInterface;

public class Quiz extends AppCompatActivity {

    TextView kuis;
    RadioGroup rg;
    RadioButton PilihanA, PilihanB, PilihanC, PilihanD;
    int nomor = 0;
    public static int hasil, benar, salah;
    ApiInterface apiInterface;
    SessionManager sessionManager;
    String soal;
    ApiClient apiClient;

    //pertanyaan
    String[] pertanyaan_kuis = new String[]{
            "1. Sebutkan berapa rakaat pada waktu shalat Shubuh?",
            "2. Sebutkan berapa rakaat pada waktu shalat Dzuhur?",
            "3. Selama sehari kita melaksanakan ..... rakaat pada lima waktu!",
            "4. Sebutkan hikmah shalat fardu bagi kehidupan kehidupan sehari-hari, kecuali?",
            "5. Sebutkan berapa rakaat pada waktu shalat ashar?",
            "6. Sebutkan berapa rakaat pada waktu shalat maghrib?",
            "7. Dalam melaksanakan sholat membaca surat Al-fatihah hukumnya?",
            "8. Sebutkan berapa rakaat pada waktu shalat Isya?",
            "9. Ketika takbiratulihram melakukan gerakan mengangkat kedua telapak tangan keatas?",
            "10.Sholat fardu dalam sehari ada ..... waktu!"
    };

    //pilihan jawaban a, b, c, d
    String[] pilihan_jawaban = new String[]{
            "1 Rakaat", "2 Rakaat", "3 Rakaat", "4 Rakaat",
            "2 Rakaat", "3 Rakaat", "4 Rakaat", "5 Rakaat",
            "13 Rakaat", "14 Rakaat", "15 Rakaat", "16 Rakaat",
            "Membiasakan hidup disiplin","Membiasakan hidup bersosial", "Hikmah membaca do’a iftitah, kejujuran dalam tindakan", "Sarana pembentukan kepribadian muslim",
            "4 Rakaat", "5 Rakaat", "6 Rakaat", "7 Rakaat",
            "1 Rakaat", "2 Rakaat", "3 Rakaat", "4 Rakaat",
            "Sunnah", "Wajib", "Makruh", "Mubah",
            "2 Rakaat", "4 Rakaat", "6 Rakaat", "8 Rakaat",
            "Kepala", "Dada", "Perut", "Bahu",
            "3 (Tiga)", "5 (Lima)", "7 (Tujuh)", "8 (Delapan)"
    };

    //kunci jawaban benar
    String[] jawaban_benar = new String[]{
            "2 Rakaat",
            "4 Rakaat",
            "16 Rakaat",
            "Membiasakan hidup bersosial",
            "4 Rakaat",
            "3 Rakaat",
            "Wajib",
            "4 Rakaat",
            "Bahu",
            "5 (Lima)"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        kuis = (TextView) findViewById(R.id.kuis);
        rg = (RadioGroup) findViewById(R.id.pilihan);
        PilihanA = (RadioButton) findViewById(R.id.pilihanA);
        PilihanB = (RadioButton) findViewById(R.id.pilihanB);
        PilihanC = (RadioButton) findViewById(R.id.pilihanC);
        PilihanD = (RadioButton) findViewById(R.id.pilihanD);

        kuis.setText(pertanyaan_kuis[nomor]);
        PilihanA.setText(pilihan_jawaban[0]);
        PilihanB.setText(pilihan_jawaban[1]);
        PilihanC.setText(pilihan_jawaban[2]);
        PilihanD.setText(pilihan_jawaban[3]);

        rg.check(0);
        benar = 0;
        salah = 0;
    }

    public void next(View view) {
        if (PilihanA.isChecked() || PilihanB.isChecked() || PilihanC.isChecked() || PilihanD.isChecked()) {

            RadioButton jawaban_user = (RadioButton) findViewById( rg.getCheckedRadioButtonId() );
            String ambil_jawaban_user = jawaban_user.getText().toString();
            rg.check( 0 );
            if (ambil_jawaban_user.equalsIgnoreCase( jawaban_benar[nomor] )) benar++;
            else salah++;
            nomor++;
            if (nomor < pertanyaan_kuis.length) {
                kuis.setText( pertanyaan_kuis[nomor] );
                PilihanA.setText( pilihan_jawaban[(nomor * 4) + 0] );
                PilihanB.setText( pilihan_jawaban[(nomor * 4) + 1] );
                PilihanC.setText( pilihan_jawaban[(nomor * 4) + 2] );
                PilihanD.setText( pilihan_jawaban[(nomor * 4) + 3] );

            } else {
                hasil = benar * 20;
                Intent selesai = new Intent( getApplicationContext(), Hasilquiz.class );
                startActivity( selesai );
            }
        } else {
            Toast.makeText( this, "Kamu Jawab Dulu", Toast.LENGTH_LONG ).show();
        }

    }
}
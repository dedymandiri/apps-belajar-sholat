package com.example.belajarsholat.Fitur_latihan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.belajarsholat.Adapter.latihanquiz.quizpresenter;
import com.example.belajarsholat.R;
import com.example.belajarsholat.Session.SessionManager;
import com.example.belajarsholat.api.ApiClient;
import com.example.belajarsholat.api.ApiInterface;

public class Quiz extends AppCompatActivity {

    TextView kuis;
    RadioGroup rg;
    String status;
    RadioButton PilihanA, PilihanB, PilihanC, PilihanD;
    int nomor = 0;
    public static int hasil, benar, salah;
    ApiInterface apiInterface;
    SessionManager sessionManager;
    String soal;
    ApiClient apiClient;

    quizpresenter presenter;
    //pertanyaan
    String[] pertanyaan_kuis = new String[]{
            "1. Wudhu adalah salah satu cara untuk menghilangkan hadast kecil yang secara secara umum dilaksanakan?",
            "2. Dibawah ini yang termasuk kedalam syarat sah wudhu, kecuali?",
            "3. Yang termasuk dalam rukun berwudhu adalah?",
            "4. Dalam tahapan cara berwudhu setelah membasuh kedua tangan yaitu membasuh?",

            "5. Berapakah jumlah rakaat dalam sholat subuh?",
            "6. Ushalli fardhaz-shubhi rak'ataini mustaqbilal qiblati adaa’an lilaahi ta’aalaa. merupakan bacaan dalam sholat?",
            "7. Dibawah ini yang didalam sholatnya terdapat doa qunut adalah?",
            "8. Dibawah ini adalah keutamaan dalam sholat subuh, kecuali?",

            "9. Berapakah jumlah rakaat yang ada pada sholat dzuhur?",
            "10.Dibawah adalah dimulainya waktu melaksanakan sholat dzuhur sekitar, kecuali?",
            "11.Ushallii fardhazh-Zhuhri arba’a raka’aatin mustaqbilal qiblati adaa’an lilaahi ta’aalaa. adalah bacaan niat dalam sholat?",
            "12.Dibawah ini adalah salah satu keutamaan dalam sholat dzuhur?",

            "13. Berapakah jumlah rakaat yang  ada pada sholat ashar?",
            "14. Ushalli fardhaz'asri arba'a raka'atin mustaqbilal qiblati adaa’an lilaahi ta’aalaa. merupakan bacaan dalam sholat?",
            "15. Dibawah ini yang yang termasuk hukum sholat ashar adalah?",
            "16. Termasuk kedalam waktu sholat ashar adalah?",

            "17. Berapakah jumlah rakaat yang ada pada sholat maghrib?",
            "18. Ushalli fardhaz'maghribi salasa raka'atin mustaqbilal qiblati adaa’an lilaahi ta’aalaaa. merupakan bacaan dalam sholat?",
            "19. Dibawah ini yang yang termasuk hukum sholat maghrib adalah, kecuali?",
            "20. Dalam cara sholat tahapan pertama dalam sholat adalah?",

            "21. Berapakah jumlah rakaat yang ada pada sholat isya?",
            "22. Ushalli fardhaz'isyai arba'a raka'atin mustaqbilal qiblati adaa’an lilaahi ta’aalaaa. merupakan bacaan dalam sholat?",
            "23. Dibawah ini adalah yang termasuk keutamaan dalam sholat isya, kecuali?",
            "24. Dalam cara sholat tahapan setelah Takbiratul ikhrom dalam sholat adalah?",
            "24. Sholat isya merupakan sholat yang dikerjakan setelah sholat?"

    };

    //pilihan jawaban a, b, c, d
    String[] pilihan_jawaban = new String[]{
            "Sebelum ibadah sholat", "Ketika ibadah sholat", "Sesudah ibadah sholat ",
            "Islam", "Berhadast besar", "Menggunakan air yang suci dan menyucikan",
            "Membasuh kedua tangan", "Membasuh muka", "Niat",
            "Kepala dan rambut", "Kedua kaki", "Kepala dan wajah",

            "1 Rakaat", "2 Rakaat", "3 Rakaat",
            "Subuh", "Maghrib", "Dzuhur",
            "Sholat subuh", "Sholat dzuhur", "Sholat ashar",
            "Pahala Setara dengan Sholat Semalam Suntuk", "Mendapatkan dosa", "Dilapangkan Rezekinya",

            "4 Rakaat", "3 Rakaat", "2 Rakaat",
            "Pukul 09.15", "Pukul 10.05", "Pukul 11.50",
            "Sholat dzuhur", "Sholat ashar", "Sholat maghrib",
            "Mendapatkan dosa besar", "Waktu dimana pintu langit terbuka", "Dapat menghilangkan rasa kantuk",

            "1 Rakaat", "2 Rakaat", "3 Rakaat",
            "Dzuhur", "Ashar", "Maghrib",
            "Wajib", "Sunnah", "Mubah",
            "Pukul 07.00", "Pukul 15.20", "c. Pukul 17.50",

            "2 Rakaat", "b. 3 Rakaat", "4 Rakaat",
            "Maghrib", "b. Isya", "c. Subuh",
            "Wajib", "b. Sunnah", "Mubah",
            "Takbiratul ikhrom", "Pukul 15.20", "Pukul 17.50",

            "4 Rakaat", "6 Rakaat", "8 Rakaat",
            "Maghrib", "Isya", "Subuh",
            "Mendapatkan Pahala Setara Dengan Melaksanakan Sholat Malam.", "Melaksanakan Sholat Isya Dapat Menghapus Dosa!", "Badan jadi sehat",
            "Niat", "Membaca iftitah", "Qunut",
            "Dzuhur", "Ashar", "Maghrib"


    };

    //kunci jawaban benar
    String[] jawaban_benar = new String[]{
            "Sebelum ibadah sholat",
            "Berhadast besar",
            "Niat",
            "Kepala dan wajah",

            "2 Rakaat",
            "3 Rakaat",
            "Subuh",
            "Mendapatkan dosa",

            "4 Rakaat",
            "ukul 09.15",
            "sholat dzuhur",
            "Waktu dimana pintu langit terbuka",

            "4 Rakaat",
            "Ashar",
            "Wajib",
            "Pukul 13.20",

            "4 Rakaat",
            "Maghrib",
            "Wajib",
            "Takbiratul ikhrom",

            "4 Rakaat",
            "isya",
            "Badan jadi sehat",
            "Membaca iftitah",
            "Maghrib"




    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_quiz );

//        getDataLatihan();

        kuis = (TextView) findViewById( R.id.kuis );
        rg = (RadioGroup) findViewById( R.id.pilihan );
        PilihanA = (RadioButton) findViewById( R.id.pilihanA );
        PilihanB = (RadioButton) findViewById( R.id.pilihanB );
        PilihanC = (RadioButton) findViewById( R.id.pilihanC );

        kuis.setText( pertanyaan_kuis[nomor] );
        PilihanA.setText( pilihan_jawaban[0] );
        PilihanB.setText( pilihan_jawaban[1] );
        PilihanC.setText( pilihan_jawaban[2] );

        rg.check( 0 );
        benar = 0;
        salah = 0;
    }

//    private void getDataLatihan() {
//        pertanyaan_kuis = new String[]{};
//        pilihan_jawaban = new String[]{};
//        jawaban_benar = new String[]{};
//    }

    public void next(View view) {
        if (PilihanA.isChecked() || PilihanB.isChecked() || PilihanC.isChecked() ) {

            RadioButton jawaban_user = (RadioButton) findViewById( rg.getCheckedRadioButtonId() );
            String ambil_jawaban_user = jawaban_user.getText().toString();
            rg.check( 0 );
            if (ambil_jawaban_user.equalsIgnoreCase( jawaban_benar[nomor] )) benar++;
            else salah++;
            nomor++;
            if (nomor < pertanyaan_kuis.length) {
                kuis.setText( pertanyaan_kuis[nomor] );
                PilihanA.setText( pilihan_jawaban[(nomor * 3) + 0] );
                PilihanB.setText( pilihan_jawaban[(nomor * 3) + 1] );
                PilihanC.setText( pilihan_jawaban[(nomor * 3) + 2] );

            } else {
                hasil = benar * 4;
                Intent intent = new Intent(Quiz.this, Hasilquiz.class);
                intent.putExtra("status", status);
                startActivity(intent);
            }

        }
    }
}
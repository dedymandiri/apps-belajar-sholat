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
    private static final String TAG = "Testing: ";
    int nomor = 0;
    public static int hasil;
    public static int benar;
    public static int salah;
    public static int materi;
    public static int materi1;
    public static int materi2;
    public static int materi3;
    public static int materi4;
    public static int materi5;
    public static int materi6;
    ApiInterface apiInterface;
    SessionManager sessionManager;
    String soal;

    ApiClient apiClient;

    quizpresenter presenter;
    //pertanyaan
    String[] pertanyaan_kuis = new String[]{
            //Berwudhu
            "1. Wudhu adalah salah satu cara untuk menghilangkan hadast kecil yang secara secara umum dilaksanakan?",
            "2. Dibawah ini yang termasuk kedalam syarat sah berwudhu, kecuali?",
            "3. Yang termasuk dalam rukun berwudhu adalah?",
            "4. Dalam tahapan cara berwudhu setelah membasuh kedua tangan yaitu?",

            //Sholatsubuh
            "5. Berapakah jumlah rakaat dalam sholat subuh?",
            "6. Ushalli fardhaz shubhi rak'ataini mustaqbilal qiblati adaa’an lilaahi ta’aalaa merupakan bacaan dalam sholat?",
            "7. Yang termasuk keutamaan dalam sholat subuh, kecuali?",
            "8. Dibawah ini yang didalamnya terdapat bacaan qunut adalah?",

            //Sholatdzuhur
            "9. Berapakah jumlah rakaat yang ada pada sholat dzuhur?",
            "10.Dibawah ini adalah dimulainya waktu melaksanakan sholat dzuhur yaitu sekitar?",
            "11.Ushallii fardhazh zhuhri arba’a raka’aatin mustaqbilal qiblati adaa’an lilaahi ta’aalaa. adalah bacaan niat dalam sholat?",
            "12.Dibawah ini adalah salah satu keutamaan dalam sholat dzuhur, kecuali?",

            //Sholatashar
            "13. Berapakah jumlah rakaat yang  ada pada sholat ashar?",
            "14. Ushalli fardhaz 'asri arba'a raka'atin mustaqbilal qiblati adaa’an lilaahi ta’aalaa. merupakan bacaan dalam sholat?",
            "15. Dibawah ini yang yang termasuk hukum dalam sholat ashar adalah?",
            "16. Yang termasuk kedalam waktu sholat ashar adalah?",

            //Sholatmaghrib
            "17. Berapakah jumlah rakaat yang ada pada sholat maghrib?",
            "18. Ushalli fardhaz maghribi salasa raka'atin mustaqbilal qiblati adaa’an lilaahi ta’aalaaa. merupakan bacaan dalam sholat?",
            "19. Dalam cara sholat fardhu hal pertama yang dilakukan dalam sholat mahgrib yaitu?",
            "20. Sholat maghrib dilakukan itu setelah  sholat?",

            //Sholatisya
            "21. Berapakah jumlah rakaat yang ada pada sholat isya?",
            "22. Ushalli fardhaz 'isyai arba'a raka'atin mustaqbilal qiblati adaa’an lilaahi ta’aalaaa. merupakan bacaan dalam sholat?",
            "23. Dibawah ini adalah yang termasuk keutamaan dalam sholat isya, kecuali?",
            "24. Dalam cara sholat tahapan setelah Takbiratul ikhrom dalam sholat adalah?"
    };

    //pilihan jawaban a, b, c, d
    String[] pilihan_jawaban = new String[]{
            //Berwudhu
            "Sebelum ibadah sholat", "Ketika ibadah sholat", "Sesudah ibadah sholat ",
            "Beragama islam", "Berhadast besar", "Menggunakan air yang suci dan menyucikan",
            "Membasuh kedua tangan", "Membasuh kepala dan wajah", "Membaca niat",
            "Kepala dan rambut", "Membasuh telinga", "Membasuh Kedua kaki",

            //Sholatsubuh
            "1 Rakaat", "2 Rakaat", "3 Rakaat",
            "Sholat ashar", "Sholat dzuhur", "Sholat subuh",
            "Pahala Setara dengan Sholat Semalam Suntuk", "Mendapatkan dosa besar", "Dilapangkan Rezekinya",
            "Sholat subuh", "Sholat dzuhur", "Sholat ashar",

            //Sholatdzuhur
            "4 Rakaat", "3 Rakaat", "2 Rakaat",
            "Pukul 09.15", "Pukul 10.05", "Pukul 11.50",
            "Sholat dzuhur", "Sholat ashar", "Sholat maghrib",
            "Mendapatkan dosa besar", "Waktu dimana pintu langit terbuka", "Dapat menghilangkan rasa kantuk",

            //Sholatashar
            "2 Rakaat", "4 Rakaat", "6 Rakaat",
            "Sholat dzuhur", "Sholat ashar", "Sholat maghrib",
            "Makruh", "Sunnah", "Wajib",
            "Pukul 07.00", "Pukul 15.20", "Pukul 17.50",

            //Sholatmaghrib
            "1 Rakaat", "5 Rakaat", "7 Rakaat",
            "Sholat maghrib", "Sholat isya", "Sholat subuh",
            "Membaca al-fatiha", "Takbiratul ikhrom", "Membaca doa qunut",
            "Sholat maghrib", "Sholat isya", "Sholat subuh",

            //Sholatmaghrib
            "4 Rakaat", "6 Rakaat", "8 Rakaat",
            "Sholat maghrib", "Sholat isya", "Sholat subuh",
            "Mendapatkan pahala setara melaksanakan sholat malam.", "Melaksanakan sholat isya dapat menghapus dosa", "Badan jadi lebih sehat",
            "Membaca niat", "Membaca doa iftitah", "Membaca doa qunut"


    };

    //kunci jawaban benar
    String[] jawaban_benar = new String[]{
            //Berwudhu
            "Sebelum ibadah sholat",
            "Berhadast besar",
            "Membaca niat",
            "Kepala dan rambut",

            //Sholatsubuh
            "2 Rakaat",
            "Sholat subuh",
            "Mendapatkan dosa besar",
            "Sholat subuh",

            //Sholatdzuhur
            "4 Rakaat",
            "Pukul 11.50",
            "Sholat dzuhur",
            "Mendapatkan dosa besar",

            //Sholatashar
            "4 Rakaat",
            "Sholat ashar",
            "Wajib",
            "Pukul 15.20",

            //Sholatmaghrib
            "4 Rakaat",
            "Maghrib",
            "Wajib",
            "Takbiratul ikhrom",

            //Sholatisya
            "4 Rakaat",
            "isya",
            "Badan jadi lebih sehat",
            "Membaca doa iftitah"


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
        materi1=0;
        materi2=0;
        materi3=0;
        materi4=0;
        materi5=0;
        materi6=0;
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
            if (ambil_jawaban_user.equalsIgnoreCase( jawaban_benar[nomor] )){ benar++;}
            else{salah++;
            if(nomor==1||nomor==2||nomor==3||nomor==4){
              materi1++;
            }
            else if(nomor==5||nomor==6||nomor==7||nomor==8){
                materi2++;
            }
            else if(nomor==9||nomor==10||nomor==11||nomor==12){
                materi3++;
            }
            else if(nomor==13||nomor==14||nomor==15||nomor==16){
                materi4++;
            }
            else if(nomor==17||nomor==18||nomor==19||nomor==20){
                materi5++;
            }
            else{
                materi6++;
            }
            }
            nomor++;
            if(materi1>=materi2&&materi1>=materi3&&materi1>=materi4&&materi1>=materi5&&materi1>=materi6){
                materi = 1;
            }
            else if(materi2>=materi1&&materi2>=materi3&&materi2>=materi4&&materi2>=materi5&&materi2>=materi6){
                materi = 2;
            }
            else if(materi3>=materi1&&materi3>=materi2&&materi3>=materi4&&materi3>=materi5&&materi3>=materi6){
                materi = 3;
            }
            else if(materi4>=materi1&&materi4>=materi2&&materi4>=materi3&&materi4>=materi5&&materi4>=materi6){
                materi = 4;
            }
            else if(materi5>=materi1&&materi5>=materi2&&materi5>=materi3&&materi5>=materi4&&materi5>=materi6) {
                materi = 5;
            }
            else{
                materi = 6;
            }
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
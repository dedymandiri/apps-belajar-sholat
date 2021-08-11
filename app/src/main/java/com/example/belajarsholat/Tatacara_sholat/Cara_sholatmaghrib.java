package com.example.belajarsholat.Tatacara_sholat;

import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import androidx.appcompat.app.AppCompatActivity;

import com.example.belajarsholat.R;

import java.util.ArrayList;
import java.util.HashMap;

public class Cara_sholatmaghrib extends AppCompatActivity {
    protected ListView lv;
    protected ListAdapter adapter;
    SimpleAdapter Adapter;
    HashMap<String, String> map;
    ArrayList<HashMap<String, String>> mylist;
    String[] Pil;
    String[] Ltn;
    String[] Gbr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cara_sholatmaghrib);

        lv = (ListView) findViewById(R.id.lv);

        Pil = new String[] {"1. Takbiratul Ihram",
                "2. Doa Iftitah",
                "3. Membaca Surat Al-Fatihah",
                "4. Membaca Surat Al-Qur’an",
                "5. Ruku",
                "6. I’tidal",
                "7. Sujud",
                "8. Iftirasy (Duduk Diantara Dua Sujud)",
                "9. Sujud",
                "10. Rakaat Kedua",
                "11. Membaca Surat Al-Fatihah",
                "12. Membaca Surat Al-Qur’an",
                "13. Ruku",
                "14. I’tidal",
                "15. Doa Qunut",
                "16. Sujud",
                "17. Iftirasy (Duduk Diantara Dua Sujud)",
                "18. Sujud",
                "19. Tasyahhud Akhir",
                "20. Salam",
        };


        Ltn = new String[] {"Melakukan takbiratul ihram, yaitu semua jari-jari dirapatkan dihadapkan kedepan dan mengangkat kedua tangan ujung jarinya sejajar dengan Pundak atau Telinga (Kuping) dan Menyedekapkan kedua tangan dengan posisi tangan kanan diatas tangan kiri seraya mengembangkan jari-jari tangan kanan.",
                "Allaahu Akbaru kabiiraw-walhamdu lillaahi katsiiran, wa subhaanallaahi bukrataw-wa’ashiila.",
                "Membaca Surat Al-Fatihah dengan diawali membaca bismillah",
                "Kemudian membaca surat atau ayat-ayat tertentu dari al-Qur’an setelah selesai membaca surat al-Fatihah. Contohnya Bismillahir-rahmanir-rahim. Qul huwallahu ahad. Allahus-samad. Lam yalid wa lam yulad. Wa lam yakul lahu kufuwan ahad.",
                "Setelah selesai membaca Surat atau Ayat dalam Al-Quran Kemudian melakukan ruku’. Yakni dengan cara mengangkat kedua tangan setinggi telinga seraya membaca “Allahu Akbar”",
                "Kemudian melakukan i’tidal, yakni bangun dari ruku’ untuk berdiri tegak, dengan mengangkat kedua tangan sejajar dengan telinga, seraya mengucapkan : sami’allahu liman hamidah",
                "Dengan kedua lutut terlebih dulu, yakni meletakkan Dahi dan Hidung, Kedua Telapak Tangan, kedua lutut dan Kedua Kaki menempel di lantai (Tempat Sholat), kemudian membaca doa : Subhaana rabbiyal a’la wa bi hamdihi. 3x",
                "kemudian melakukan duduk di antara dua sujud. Pada saat sudah duduk dengan sempurna [menduduki kaki kiri, dengan telapak kaki kanan berdiri dan jarinya terletak di alas (lantai/tanah) menghadap kiblat] dengan membaca doa : Rabbighfirlii warhamnii wajburnii warfa’nii warzuqnii wahdinii wa ‘aafinii wa’fu ‘annii.",
                "Meletakkan Dahi, Hidung, Kedua Telapak Tangan dan Kedua Kaki menempel di lantai (Tempat Sholat), kemudian membaca doa : Subhaana rabbiyal a’la wa bi hamdihi. 3x",
                "Dari posisi sujud kemudian Berdiri tegak sambil mengucapkan “Allahu Akbar” , kemudian bersedakap dan Pandangan mata melihat kearah tempat sujud.",
                "Membaca Surat Al-Fatihah kembali dengan diawali membaca bismillah",
                "Kemudian membaca surat atau ayat-ayat tertentu dari al-Qur’an setelah selesai membaca surat al-Fatihah. Contohnya Bismillahir-rahmanir-rahim. Wal ‘ashr(i) Innal insaana lafii khusr(in) Illal-ladziina aamanuu wa ‘amiluush-shalihaati wa tawaashau bilhaqqi wa tawaashaubish-shabr(i).",
                "Setelah selesai membaca Surat atau Ayat dalam Al-Quran Kemudian melakukan ruku’. Yakni dengan cara mengangkat kedua tangan setinggi telinga seraya membaca “Allahu Akbar”",
                "Kemudian melakukan i’tidal, yakni bangun dari ruku’ untuk berdiri tegak, dengan mengangkat kedua tangan sejajar dengan telinga, seraya mengucapkan : sami’allahu liman hamidah",
                "Masih dalam keadaan berdiri i’tidal disunnahkan mengucapkan doa qunut sebagai berikut : Allaahummahdinii fii man hadaiit, wa aafinii fii man aafaiit, wa tawallanii fi man tawallaiit, wa baarik lii fiimaa a’thaiit. Wa qinii syarra maa qadhaiit. Fa innaka taqdhii wa laa yuqdhaa ‘alaiik. Innahu laa yadzillu maw waalaiit. Wa laa ya’izzu man ‘aadaiit. Tabaarakta rabbanaa wa ta’aalait. Fa lakal-hamdu ‘alaa maa qadhaiit, Astaghfiruka wa atuubu ilaik wa shallallahu ‘ala sayyidina muhammadin nabiyyil ummuyyi wa ‘alaa aalihii wa shahbihii wa sallam.",
                "Dengan kedua lutut terlebih dulu, yakni meletakkan Dahi dan Hidung, Kedua Telapak Tangan, kedua lutut dan Kedua Kaki menempel di lantai (Tempat Sholat), kemudian membaca doa : Subhaana rabbiyal a’la wa bi hamdihi. 3x",
                "kemudian melakukan duduk di antara dua sujud. Pada saat sudah duduk dengan sempurna [menduduki kaki kiri, dengan telapak kaki kanan berdiri dan jarinya terletak di alas (lantai/tanah) menghadap kiblat] dengan membaca doa : Rabbighfirlii warhamnii wajburnii warfa’nii warzuqnii wahdinii wa ‘aafinii wa’fu ‘annii.",
                "Meletakkan Dahi, Hidung, Kedua Telapak Tangan dan Kedua Kaki menempel di lantai (Tempat Sholat), kemudian membaca doa : Subhaana rabbiyal a’la wa bi hamdihi. 3x",
                "Setelah sujud yang ke dua kemudian melakukan Doa Tahiyat Akhir dengan cara duduk tasyahhud (tahiyat) akhir dengan membaca doa : At-tahiyyaatul mubaarakatush-shalawaatuth-thayyibaatulillaahi. Assalaamu ‘alaika ayyuhan-nabiyyu wa rahmatullaahi wa barakaatuhu. Assalaamu ‘alainaa wa ‘alaa ‘ibaadillaahish-shaalihiina. Asyhadu an laa ilaaha illallaahu wa asyhadu anna Muhammadar Rasuulullaahi.",
                "Kemudian dilanjutkan dengan mengucapkan salam (assalaamu’alaikum wa rahmatullaah), yang diikuti dengan menengokkan wajah ke kanan pada saat mengucapkan salam yang pertama dan menengokkan wajah ke kiri pada saat mengucapkan salam yang kedua.",

        };


        Gbr = new String[] {Integer.toString(R.drawable.sholat_1),
                Integer.toString(R.drawable.sholat_2),
                Integer.toString(R.drawable.sholat_3),
                Integer.toString(R.drawable.sholat_4),
                Integer.toString(R.drawable.sholat_5),
                Integer.toString(R.drawable.sholat_2),
                Integer.toString(R.drawable.sholat_3),
                Integer.toString(R.drawable.sholat_4),
                Integer.toString(R.drawable.sholat_5),
                Integer.toString(R.drawable.back_putih),
                Integer.toString(R.drawable.sholat_3),
                Integer.toString(R.drawable.sholat_4),
                Integer.toString(R.drawable.sholat_5),
                Integer.toString(R.drawable.sholat_2),
                Integer.toString(R.drawable.sholat_3),
                Integer.toString(R.drawable.sholat_4),
                Integer.toString(R.drawable.sholat_5),
                Integer.toString(R.drawable.sholat_2),
                Integer.toString(R.drawable.sholat_3),
                Integer.toString(R.drawable.sholat_4)};

        mylist = new ArrayList<HashMap<String,String>>();

        for (int i = 0; i < Pil.length; i++){
            map = new HashMap<String, String>();
            map.put("list", Pil[i]);
            map.put("latin", Ltn[i]);
            map.put("gbr", Gbr[i]);
            mylist.add(map);
        }

        Adapter = new SimpleAdapter(this, mylist, R.layout.layout_isi,
                new String[] {"list", "latin", "gbr"}, new int[] {R.id.tv_nama, R.id.tv_ltn, R.id.imV});
        lv.setAdapter(Adapter);
    }
}
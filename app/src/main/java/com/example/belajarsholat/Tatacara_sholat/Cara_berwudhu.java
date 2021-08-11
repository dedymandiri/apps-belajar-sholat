package com.example.belajarsholat.Tatacara_sholat;

import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import androidx.appcompat.app.AppCompatActivity;

import com.example.belajarsholat.R;

import java.util.ArrayList;
import java.util.HashMap;

public class Cara_berwudhu extends AppCompatActivity {
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
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_cara_berwudhu );
        lv = (ListView) findViewById(R.id.lv);

        Pil = new String[] {"1. Membaca basmalah",
                "2. Membasuh tangan",
                "3. Berkumur-kumur",
                "4. Membasuh hidung",
                "5. Membaca niat",
                "6. Mebasuh tangan",
                "7. Membasuh kepala",
                "8. Membasuh telinga",
                "9. Membasuh kaki"

        };

        Ltn = new String[] {
                "Sebelum berwudhu diawali dengan membaca basmaalah dan ketika melihat air membaca doa اَلْحَمْدُ ِللهِ الَّذِي جَعَلَ اْلمَاءَ طَهُوْرًا",
                "Membasuh kedua telapak tangan sampai pada pergelangan sebanyak tiga kali dengan membaca اللّٰهُمَّ احْفَظْ يَدَيَّ مِنْ مَعَاصِكَ كُلِّهَا",
                "Berkumur-kumur sebanyak tiga kali dengan membaca اللّهُمَّ أَعِنِّي عَلَى ذِكْرِكَ وَشُكْرِكَ وَحُسْنِ عِبَادَتِكَ",
                "Memasukkan air ke lubang hidung sebanyak tiga kali dengan membaca اَللّٰهُمَّ أَرِحْنِي رَائِحَةَ الجَـنَّةِ وَاَنْتَ عَنِّي رَاضٍ",
                "Membaca niat dan membasuh wajah sebanyak tiga kali dengan membaca اللّٰهُمَّ بَيِّضْ وَجْهِى يَوْمَ تَبْيَضُّ وُجُوْهٌ وَتَسْوَدُّ وُجُوْهٌ",
                "Mebasuh kedua tangan kanan dan kiri hingga siku sebanyak tiga kali dengan membaca اَللّٰهُمَّ اَعْطِنِى كِتاَبِى بِيَمِيْنِى وَحَاسِبْنِى حِسَاباً يَسِيْرً",
                "Membasuh kepala dan rambut sebanyak tiga kali dengan membaca اللّٰهُمَّ حَرِّمْ شَعْرِيْ وَبَشَرِيْ عَلَى النَّارِ",
                "Membasuh kedua telinga luar dan dalam dengan membaca اَللَّهُمَّ اجْعَلْنِي مِنَ الَّذِيْنَ يَسْتَمِعُوْنَ اْلقَوْلَ فَيَتَّبِعُوْنَ أَحْسَنَهُ",
                "Membasuh kaki kanan dan kiri hingga mata kaki dengan membaca اللّٰهُمَّ اِجْعَلْهُ سَعْيًا مَشْكُوْرًا وَذَنْبًا مَغْفُوْرًا وَعَمَلًا مُتَقَبَّلًا.اَللّٰهُمَّ ثَبِّتْ قَدَمِيْ عَلَى الصِّرَاطِ يَوْمَ تَزِلُّ فِيْهِ الْأَقْدَامُ" };



        Gbr = new String[] {Integer.toString(R.drawable.wudhu_1),
                Integer.toString(R.drawable.wudhu_2),
                Integer.toString(R.drawable.wudhu_3),
                Integer.toString(R.drawable.wudhu_4),
                Integer.toString(R.drawable.wudhu_5),
                Integer.toString(R.drawable.wudhu_7),
                Integer.toString(R.drawable.wudhu_8),
                Integer.toString(R.drawable.wudhu_9),
                Integer.toString(R.drawable.wudhu_11),
               };

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
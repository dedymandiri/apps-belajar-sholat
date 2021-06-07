package com.example.belajarsholat;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.os.Bundle;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;


public class List_Surat_Pendek extends AppCompatActivity {
    protected ListView lv;
    protected ListAdapter adapter;
    SimpleAdapter Adapter;
    HashMap<String, String> map;
    ArrayList<HashMap<String, String>> mylist;
    String[] Pil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_surat_pendek);

        lv = (ListView) findViewById(R.id.lv);

        Pil = new String[] {
                "Surat Al-Fatihah","Surat An-Nas","Surat Al-Falaq" ,"Surat Al-Ikhlas", "Surat Al-Lahab",
                "Surat An-Nasr", "Surat Al-Kafirun","Surat Al-Kausar","Surat Al-Ma’un","Surat Quraisy",
                "Surat Al-Fil", "Surat Al-Humazah","Surat Al-‘Asr","Surat At-Takasur","Surat Al-Qari’ah",

                "Surat Al-Fatihah","Surat An-Nas","Surat Al-Falaq" ,"Surat Al-Ikhlas", "Surat Al-Lahab",
                "Surat An-Nasr", "Surat Al-Kafirun","Surat Al-Kausar","Surat Al-Ma’un","Surat Quraisy",
                "Surat Al-Fil", "Surat Al-Humazah","Surat Al-‘Asr","Surat At-Takasur","Surat Al-Qari’ah",

                "Surat Al-Fatihah","Surat An-Nas","Surat Al-Falaq" ,"Surat Al-Ikhlas", "Surat Al-Lahab",
                "Surat An-Nasr", "Surat Al-Kafirun","Surat Al-Kausar","Surat Al-Ma’un","Surat Quraisy",
                "Surat Al-Fil", "Surat Al-Humazah","Surat Al-‘Asr","Surat At-Takasur","Surat Al-Qari’ah"
                };

        mylist = new ArrayList<HashMap<String,String>>();

        for (int i = 0; i < Pil.length; i++){
            map = new HashMap<String, String>();
            map.put("list", Pil[i]);
            mylist.add(map);
        }

        Adapter = new SimpleAdapter(this, mylist, R.layout.layout_suratpendek,
                new String[] {"list"}, new int[] {R.id.tv_nama, R.id.iml});
        lv.setAdapter(Adapter);
    }

}

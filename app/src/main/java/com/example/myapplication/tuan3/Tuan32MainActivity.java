package com.example.myapplication.tuan3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.myapplication.R;

import java.util.ArrayList;

public class Tuan32MainActivity extends AppCompatActivity {
    ListView lv;
    T32Adaprer adaprer;
    ArrayList<T32Contact> ls=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan32_main);
        lv=findViewById(R.id.tuan32Lv);
        //tạo nguồn dữ liệu
        ls.add(new T32Contact("nguyenvanA", "18",R.drawable.ic_launcher_background));
        ls.add(new T32Contact("tranvanB", "19",R.drawable.ic_launcher_background));
        ls.add(new T32Contact("nguyenvanE", "12",R.drawable.ic_launcher_background));
        ls.add(new T32Contact("nguyenvducR", "11",R.drawable.ic_launcher_background));
        ls.add(new T32Contact("nguyenvanE", "20",R.drawable.ic_launcher_background));
        ls.add(new T32Contact("tranvanT", "21",R.drawable.ic_launcher_background));
        //tạo addapter
        adaprer=new T32Adaprer(ls,this);
        lv.setAdapter(adaprer);


    }
}
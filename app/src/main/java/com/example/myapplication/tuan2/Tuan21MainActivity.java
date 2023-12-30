package com.example.myapplication.tuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.myapplication.R;

public class Tuan21MainActivity extends AppCompatActivity {
    EditText txt1,txt2;
    Button btn1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan21_main);
        txt1=findViewById(R.id.tuan21txt1);
        txt2=findViewById(R.id.tuan21txt2);
        btn1=findViewById(R.id.tuan21Btn1);
        //tạo sự kiện khi click button
        btn1.setOnClickListener(v->{
            //định hướng di chuyển
            Intent i=new Intent(Tuan21MainActivity.this,Tuan21SecondActivity.class);
            //đưa dữ liệu vào
            i.putExtra("so1",txt1.getText().toString());
            i.putExtra("so2",txt2.getText().toString());
            //khởi hành
            startActivity(i);

        });
    }
}

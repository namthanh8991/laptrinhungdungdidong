package com.example.myapplication.tuan1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.myapplication.R;

public class Tuan11MainActivity extends AppCompatActivity {
    //khai báo các control;
    EditText txt1,txt2;
    Button btn1;
    TextView tv1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan11_main);
        // ánh xạ các control
        txt1= findViewById(R.id.demo11txt1);
        txt2=findViewById(R.id.demo11txt2);
        btn1= findViewById(R.id.demo11Btn1);
        tv1= findViewById(R.id.demo11Tv1);
        // suwr lí sự kiện
        btn1.setOnClickListener(v -> {
            // gọi hàm tính tổng
            tinhtong();
        });
    }
// định nghĩa hàm tính tổng
    private void tinhtong() {
        //lay du lieu nhap vao tu edittext1
        String str1= txt1.getText().toString();
        float so1= Float.parseFloat(str1);//chuyển dữ liệu sangh số
        //lấy dữ liệu nập bào từ edit text 2
        String str2= txt2.getText().toString();
        float so2=Float.parseFloat(str2);
        //tinh tong
        float tong= so1+so2;
        //in ket qua ra man hinh
        tv1.setText(String.valueOf(tong));

    }
}
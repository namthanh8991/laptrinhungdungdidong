package com.example.myapplication.tuan3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myapplication.R;

import java.util.ArrayList;

public class T32Adaprer extends BaseAdapter {
    private ArrayList<T32Contact> ls;
    private Context context;

    public T32Adaprer(ArrayList<T32Contact> ls,Context context) {
        this.ls = ls;
        this.context=context;
    }
//lấy về số lượng item
    @Override
    public int getCount() {
        return ls.size();
    }
//lấy về item
    @Override
    public Object getItem(int position) {
        return ls.get(position);
    }
//lấy về id
    @Override
    public long getItemId(int position) {
        return position;
    }
//tạo view
    //gán dữu liệu
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //b1: tạo view
        ViewAX vax;
        //nếu chưua có view thì tạo view mới
        if(convertView==null)
        {
            vax= new ViewAX();//tạo view mới
            //ánh xạ layout
            convertView= LayoutInflater.from(context).inflate(R.layout.tuan32_listview_item,null);
            //ánh xạ từng thành phần trong layout
            vax.img_hinh=convertView.findViewById(R.id.t32ItiemHinh);
            vax.tv_ten= convertView.findViewById(R.id.t32ItiemTen);
            vax.tv_tuoi=convertView.findViewById(R.id.t32ItiemTuoi);
            //taok template để lần sau sử dụng
            convertView.setTag(vax);
        }

        //nếu đã có view sử dụng lại view cũ
        else
        {
            vax=(ViewAX) convertView.getTag();//lấy view cũ
        }
        //gán dữ liệu cho layout
        vax.img_hinh.setImageResource(ls.get(position).getHinh());
        vax.tv_ten.setText(ls.get(position).getTen());
        vax.tv_tuoi.setText(ls.get(position).getTuoi());
        return convertView;// trả về kết quả
    }
    //định nghĩa view
    class ViewAX{
        ImageView img_hinh;
        TextView tv_ten,tv_tuoi;
    }
}

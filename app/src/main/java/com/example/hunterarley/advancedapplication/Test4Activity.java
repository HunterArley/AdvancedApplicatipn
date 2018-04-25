package com.example.hunterarley.advancedapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

public class Test4Activity extends AppCompatActivity {
    //定义GridView对象
    private GridView Gv;
    //定义字符序列数组用来存储GridView的数据源
    ArrayAdapter<CharSequence> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test4);
        findView();
        setGv();
    }

    private void findView(){
        Gv = (GridView) findViewById(R.id.Gv);
    }

    private void setGv(){
        //将可选内容与ArrayAdapter连接起来
        adapter = ArrayAdapter.createFromResource(
                this, R.array.seat, android.R.layout.simple_gallery_item);
        //设置Gv的adapter
        Gv.setAdapter(adapter);
    }
}

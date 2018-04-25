package com.example.hunterarley.advancedapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class Test3Activity extends AppCompatActivity {
    //定义TextView对象
    private TextView Tv;
    //定义Spinner对象
    private Spinner Sp;
    //定义字符序列数组用来存储Spinner的数据源
    ArrayAdapter<CharSequence> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test3);
        findView();
        setSp();
    }

    private void findView(){
        Tv = (TextView) findViewById(R.id.Tv);
        Sp = (Spinner) findViewById(R.id.Sp);
    }

    private void setSp(){
        //将可选内容与ArrayAdapter连接起来
        adapter=ArrayAdapter.createFromResource(
                this,R.array.System,android.R.layout.simple_spinner_item);
        //设置下拉列表的风格
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //设置Sp的adapter
        Sp.setAdapter(adapter);
        //添加事件Sp的选择事件监听
        Sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //当用户选择了某项的时候，Tv显示用户的选项
                Tv.setText(adapter.getItem(position).toString());
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                //当用户没有选择任何选项的时候，Tv显示selected Nothing
                Tv.setText("selected Nothing");
            }
        });
    }
}

package com.example.hunterarley.advancedapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class Test1Activity extends AppCompatActivity  {
    private AutoCompleteTextView actv;

    //定义单词查询库
    private static final String[] words={"abbreviation","action","ally","art","ball","bask"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test1);

        //获取AutoCompleteTextView对象
        actv = (AutoCompleteTextView) findViewById(R.id.actv);
        //自定义ArrayAdapter，设置了simpleitem样式
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, words);
        //给AutoCompleteTextView对象设置adapter
        actv.setAdapter(adapter);

    }


}

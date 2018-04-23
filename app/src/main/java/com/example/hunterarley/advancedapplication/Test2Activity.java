package com.example.hunterarley.advancedapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.MultiAutoCompleteTextView;

public class Test2Activity extends AppCompatActivity {
    private MultiAutoCompleteTextView Mactv;

    //定义收件人查询库
    private static final String[] names = {"zhangsan", "zhangshi", "lisi", "liliu",
            "liushasha", "wangli", "wangzhengsan"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test2);

        //获取MultiAutoCompleteTextView对象
        Mactv = (MultiAutoCompleteTextView) findViewById(R.id.Mactv);
        //自定义ArrayAdapter，设置了simpleitem样式
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, names);
        //给MultiAutoCompleteTextView对象设置adapter
        Mactv.setAdapter(adapter);
        //给MultiAutoCompleteTextView对象设置分隔符号
        Mactv.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
    }
}

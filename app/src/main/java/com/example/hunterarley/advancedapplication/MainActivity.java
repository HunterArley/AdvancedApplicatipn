package com.example.hunterarley.advancedapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btn1, btn2, btn3,btn4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findView();
    }

    private void findView() {
        btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(this);
        btn2 = (Button) findViewById(R.id.btn2);
        btn2.setOnClickListener(this);
        btn3 = (Button) findViewById(R.id.btn3);
        btn3.setOnClickListener(this);
        btn4 = (Button) findViewById(R.id.btn4);
        btn4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn1:
                Intent intent1 = new Intent(this, Test1Activity.class);
                startActivity(intent1);
                break;
            case R.id.btn2:
                Intent intent2 = new Intent(this, Test2Activity.class);
                startActivity(intent2);
                break;
            case R.id.btn3:
                Intent intent3 = new Intent(this, Test3Activity.class);
                startActivity(intent3);
                break;
            case R.id.btn4:
                Intent intent4 = new Intent(this, Test4Activity.class);
                startActivity(intent4);
                break;
        }
    }
}

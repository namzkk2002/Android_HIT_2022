package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {
    TextView textView1,textView2,textView3,textView4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        Intent intent = getIntent();
        String str1 = intent.getStringExtra("HO");
        String str2 = intent.getStringExtra("TEN");
        String str3 = intent.getStringExtra("TK");
        String str4 = intent.getStringExtra("MK");

        textView1 = findViewById(R.id.tv1);
        textView2 = findViewById(R.id.tv2);
        textView3 = findViewById(R.id.tv3);
        textView4 = findViewById(R.id.tv4);

        textView1.setText("Họ :  " + str1);
        textView2.setText("Tên : " + str2);
        textView3.setText("Tài khoản :  " + str3);
        textView4.setText("Mật khẩu : " + str4);

    }
}
package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView textView1,textView2,textView3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        Acc acc = new Acc();
        acc = intent.getParcelableExtra("Acc");
//        String str1 = intent.getStringExtra("TK");

        String str1 = bundle.getString("TK");
        String str2 = intent.getStringExtra("MK");
        String str3 = intent.getStringExtra("CB");


        textView1 = findViewById(R.id.tv1);
        textView2 = findViewById(R.id.tv2);
        textView3 = findViewById(R.id.tv3);


        textView1.setText("Tài khoản :  " + acc.getTk());
        textView2.setText("Mật khẩu : " + acc.getPw());
        textView3.setText(str3);
    }
}
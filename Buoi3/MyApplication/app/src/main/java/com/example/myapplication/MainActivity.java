package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText editText1,editText2;
    CheckBox checkBox;
    Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layid();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);

                editText1 = findViewById(R.id.tk);
                editText2 = findViewById(R.id.pw);
                checkBox = findViewById(R.id.cb);

                Acc acc = new Acc();
                acc.setTk(editText1.getText().toString());
                acc.setPw( editText2.getText().toString());

                intent.putExtra("Acc",(Parcelable) acc);



                String str1 = editText1.getText().toString();
                String str2 = editText2.getText().toString();
                intent.putExtra("TK",str1);
                intent.putExtra("MK",str2);

                Bundle bundle = new Bundle();
                bundle.putString("TK",str1);
                intent.putExtras(bundle);


                if(checkBox.isChecked()){
                    intent.putExtra("CB","Lưu mật khẩu");
                }
                else {
                    intent.putExtra("CB", "Không lưu mật khẩu");
                }


                startActivity(intent);
            }
        });

        button1 = findViewById(R.id.setoff);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity3.class);
                startActivity(intent);
            }
        });


    }

    private void layid(){
        button = findViewById(R.id.bt);
    }


}
package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity3 extends AppCompatActivity {
    EditText editText1,editText2,editText3,editText4;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        button = findViewById(R.id.dk);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity3.this, MainActivity4.class);


                editText1 = findViewById(R.id.ho);
                editText2 = findViewById(R.id.ten);
                editText3 = findViewById(R.id.tk);
                editText4 = findViewById(R.id.mk);

                String str1 = editText1.getText().toString();
                String str2 = editText2.getText().toString();
                String str3 = editText3.getText().toString();
                String str4 = editText4.getText().toString();

                intent.putExtra("HO",str1);
                intent.putExtra("TEN",str2);
                intent.putExtra("TK",str3);
                intent.putExtra("MK",str4);


                startActivity(intent);
            }
        });




    }
}
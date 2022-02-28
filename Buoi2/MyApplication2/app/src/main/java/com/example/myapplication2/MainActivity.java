package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    double no1;
    double no2 = 1;
    double total;
    char operator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btn0 = (Button)findViewById(R.id.btn0);
        final Button btn1 = (Button)findViewById(R.id.btn1);
        final Button btn2 = (Button)findViewById(R.id.btn2);
        final Button btn3 = (Button)findViewById(R.id.btn3);
        final Button btn4 = (Button)findViewById(R.id.btn4);
        final Button btn5 = (Button)findViewById(R.id.btn5);
        final Button btn6 = (Button)findViewById(R.id.btn6);
        final Button btn7 = (Button)findViewById(R.id.btn7);
        final Button btn8 = (Button)findViewById(R.id.btn8);
        final Button btn9 = (Button)findViewById(R.id.btn9);
        final Button btnPlus = (Button)findViewById(R.id.btnPlus);
        final Button btnMinus = (Button)findViewById(R.id.btnMinus);
        final Button btnMultiply = (Button)findViewById(R.id.btnMultiply);
        final Button btnDivide = (Button)findViewById(R.id.btnDivide);
        final Button btnEquals = (Button)findViewById(R.id.btnEquals);
        final Button btnClear = (Button)findViewById(R.id.btnClear);
        final EditText editText = (EditText)findViewById(R.id.editText);
        final EditText editText2 = (EditText)findViewById(R.id.editText2);
        final Button btnps = (Button)findViewById(R.id.ps);
        final Button btnmu = (Button)findViewById(R.id.mu);


        btnps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = String.valueOf(editText.getText());
                double a = Double.parseDouble(str);
                a = 1.0/a;
                editText.setText(String.valueOf(a));
                editText2.setText(String.valueOf(a));
            }
        });

        btnmu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = String.valueOf(editText.getText());
                double a = Double.parseDouble(str);
                a = a*a;
                editText.setText(String.valueOf(a));
                editText2.setText(String.valueOf(a));
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String btn0Text = btn0.getText().toString();
                editText.setText(editText.getText() + btn0Text);
                editText2.setText(editText2.getText() + btn0Text);
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String btn1Text = btn1.getText().toString();
                editText.setText(editText.getText() + btn1Text);
                editText2.setText(editText2.getText() + btn1Text);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String btn2Text = btn2.getText().toString();
                editText.setText(editText.getText() + btn2Text);
                editText2.setText(editText2.getText() + btn2Text);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String btn3Text = btn3.getText().toString();
                editText.setText(editText.getText() + btn3Text);
                editText2.setText(editText2.getText() + btn3Text);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String btn4Text = btn4.getText().toString();
                editText.setText(editText.getText() + btn4Text);
                editText2.setText(editText2.getText() + btn4Text);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String btn5Text = btn5.getText().toString();
                editText.setText(editText.getText() + btn5Text);
                editText2.setText(editText2.getText() + btn5Text);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String btn6Text = btn6.getText().toString();
                editText.setText(editText.getText() + btn6Text);
                editText2.setText(editText2.getText() + btn6Text);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String btn7Text = btn7.getText().toString();
                editText.setText(editText.getText() + btn7Text);
                editText2.setText(editText2.getText() + btn7Text);
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String btn8Text = btn8.getText().toString();
                editText.setText(editText.getText() + btn8Text);
                editText2.setText(editText2.getText() + btn8Text);
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String btn9Text = btn9.getText().toString();
                editText.setText(editText.getText() + btn9Text);
                editText2.setText(editText2.getText() + btn9Text);
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText("");
                editText2.setText("");
            }
        });

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                no1 = Double.parseDouble(editText.getText().toString());
                operator = btnPlus.getText().charAt(0);
                editText2.setText(editText2.getText() + "+");
                editText.setText("");
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                no1 = Double.parseDouble(editText.getText().toString());
                operator = btnMinus.getText().charAt(0);
                editText2.setText(editText2.getText() + "-");
                editText.setText("");
            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                no1 = Double.parseDouble(editText.getText().toString());
                operator = btnMultiply.getText().charAt(0);
                editText2.setText(editText2.getText() + "x");
                editText.setText("");
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                no1 = Double.parseDouble(editText.getText().toString());
                operator = btnDivide.getText().charAt(0);
                editText2.setText(editText2.getText() + "÷");
                editText.setText("");
            }
        });

        btnEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                no2 = Double.parseDouble(editText.getText().toString());
                switch(operator) {
                    case '+':
                        total = no1 + no2;
                        break;
                    case '-':
                        total = no1 - no2;
                        break;
                    case 'x':
                        total = no1 * no2;
                        break;
                    case '÷':
                        total = no1 / no2;
                        break;
                }
                editText.setText(Double.toString(total));
                no1 = 0.0;
                no2 = 0.0;
            }
        });

    }
}
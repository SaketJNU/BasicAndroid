package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    EditText number1, number2;
    Button add_button, sub_button, mul_button, div_button;
    TextView result;
    int answer = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number1 = (EditText) findViewById(R.id.editText_first_no);
        number2 = (EditText) findViewById(R.id.editText_second_no);
        add_button = (Button) findViewById(R.id.add_button);
        sub_button = (Button) findViewById(R.id.sub_button);
        mul_button = (Button) findViewById(R.id.mul_button);
        div_button = (Button) findViewById(R.id.div_button);
        result = (TextView) findViewById(R.id.textView_answer);

        add_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                double num1 = Double.parseDouble(number1.getText().toString());
                double num2 = Double.parseDouble(number2.getText().toString());
                double answer = num1 + num2;
                result.setText(Double.toString(answer));
            }
            });

        sub_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                double num1 = Double.parseDouble(number1.getText().toString());
                double num2 = Double.parseDouble(number2.getText().toString());
                double answer = num1 - num2;
                result.setText(Double.toString(answer));
            }
        });
        mul_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                double num1 = Double.parseDouble(number1.getText().toString());
                double num2 = Double.parseDouble(number2.getText().toString());
                double answer = num1 * num2;
                result.setText(Double.toString(answer));
            }
        });

        div_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                double num1 = Double.parseDouble(number1.getText().toString());
                double num2 = Double.parseDouble(number2.getText().toString());
                double answer = num1 / num2;
                result.setText(Double.toString(answer));
            }
        });





        }
    }
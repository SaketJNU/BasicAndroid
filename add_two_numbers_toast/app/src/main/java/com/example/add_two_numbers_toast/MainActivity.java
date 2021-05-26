package com.example.add_two_numbers_toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    EditText number1, number2;
    Button add_button;
    TextView result;
    int answer = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number1 = (EditText) findViewById(R.id.editText_first_no);
        number2 = (EditText) findViewById(R.id.editText_second_no);
        add_button = (Button) findViewById(R.id.add_button);


        add_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                double num1 = Double.parseDouble(number1.getText().toString());
                double num2 = Double.parseDouble(number2.getText().toString());
                double sum = num1 + num2;
                // Displaying simple Toast message
                Toast.makeText(getApplicationContext(),
                        "The sum of " + num1 + " and " + num2 + " = " + sum,
                        Toast.LENGTH_LONG)
                        .show();
            }
        });
    }
}
package com.divakar.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText e1, e2;
    TextView t1;
    int num1, num2;
    String s1, s2;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

    }

    // a public method to get the input numbers
    public boolean getNumbers()
    {

        // defining the edit text 1 to e1
        e1 = (EditText)findViewById(R.id.num1);

        // defining the edit text 2 to e2
        e2 = (EditText)findViewById(R.id.num2);

        // defining the text view to t1
        t1 = (TextView)findViewById(R.id.result);

        // taking input from text box 1
        s1 = e1.getText().toString();

        // taking input from text box 2
        s2 = e2.getText().toString();

        // condition to check if box is not empty
        if ((s1.equals(null) && s2.equals(null))
                || (s1.equals("") && s2.equals(""))) {

            String result = "Please enter a value";
            t1.setText(result);

            return false;
        }
        else {
            // converting string to int.
            num1 = Integer.parseInt(e1.getText().toString());

            // converting string to int.
            num2 = Integer.parseInt(e2.getText().toString());
        }

        return true;
    }

    // a public method to perform addition
    public void doSum(View v)
    {

        // get the input numbers
        if (getNumbers()) {
            int sum = num1 + num2;
            t1.setText(Integer.toString(sum));
            Toast.makeText(getApplicationContext(),
                    "The difference of " + num1 + " and " + num2 + " = " + sum,
                    Toast.LENGTH_LONG)
                    .show();
        }
    }

    // a public method to perform power function
    public void doPow(View v)
    {

        // get the input numbers
        if (getNumbers()) {
            double sum = Math.pow(num1, num2);
            t1.setText(Double.toString(sum));
            Toast.makeText(getApplicationContext(),
                    "The power " + num1 + " raised to " + num2 + " = " + sum,
                    Toast.LENGTH_LONG)
                    .show();
        }
    }

    // a public method to perform subtraction
    public void doSub(View v)
    {

        // get the input numbers
        if (getNumbers()) {
            int sum = num1 - num2;
            t1.setText(Integer.toString(sum));
            Toast.makeText(getApplicationContext(),
                    "The difference of " + num1 + " and " + num2 + " = " + sum,
                    Toast.LENGTH_LONG)
                    .show();
        }
    }

    // a public method to perform multiplication
    public void doMul(View v)
    {

        // get the input numbers
        if (getNumbers()) {
            int sum = num1 * num2;
            t1.setText(Integer.toString(sum));
        }
    }
    // a public method to perform Division
    public void doDiv(View v)
    {

        // get the input numbers
        if (getNumbers()) {

            // displaying the text in text view assigned as t1
            double sum = num1 / (num2 * 1.0);
            t1.setText(Double.toString(sum));
        }
    }
    // a public method to perform modulus function
    public void doMod(View v)
    {

        // get the input numbers
        if (getNumbers()) {
            double sum = num1 % num2;
            t1.setText(Double.toString(sum));
        }
    }
}

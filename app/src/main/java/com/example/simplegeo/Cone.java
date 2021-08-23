package com.example.simplegeo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Cone extends AppCompatActivity {
EditText h;
EditText r;

TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cone);
        h= findViewById(R.id.editTextNumberDecimal);
        r= findViewById(R.id.editTextNumberDecimal2);

        textView=findViewById(R.id.textView4);

    }
    public void Calculate(View view) {
        if(h.getText().toString().matches("")||r.getText().toString().matches("")){


        }else {
            float number1=Float.parseFloat(h.getText().toString());
            float number2 =Float.parseFloat(r.getText().toString());
            float number3 =(float)  314/100;
            float area = (float) (number3*number2*(number2+Math.sqrt(number1*number1+number2*number2)));

            textView.setText("Area :"+area);
        }

    }
}
package com.example.simplegeo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Cube extends AppCompatActivity {
EditText A;
EditText B;
EditText C;
TextView Area;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cube);
        A=findViewById(R.id.editTextNumberDecimal3);
        B=findViewById(R.id.editTextNumberDecimal4);
        C=findViewById(R.id.editTextNumberDecimal5);
        Area=findViewById(R.id.textView6);
    }
    public void Calculate(View view) {
        if(A.getText().toString().matches("")||B.getText().toString().matches("")||C.getText().toString().matches("")){


        }else {
            float number1=Float.parseFloat(A.getText().toString());
            float number2 =Float.parseFloat(B.getText().toString());
            float number3=Float.parseFloat(C.getText().toString());
            float area =number1*number2*number3 ;
            Area.setText("Area :"+area);
        }

    }
}
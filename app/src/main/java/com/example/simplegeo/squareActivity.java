package com.example.simplegeo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class squareActivity extends AppCompatActivity {
EditText editTextNumber;
EditText editTextNumber2;
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_square);
        editTextNumber =findViewById(R.id.editTextNumber);
        editTextNumber2 = findViewById(R.id.editTextNumber2);
        textView=findViewById(R.id.textView);


    }
    public void Calculate(View view) {
        if(editTextNumber.getText().toString().matches("")||editTextNumber2.getText().toString().matches("")){


        }else {
            float number1=Integer.parseInt(editTextNumber.getText().toString());
            float number2 =Integer.parseInt(editTextNumber2.getText().toString());
            float area =number1*number2 ;
            textView.setText("Area :"+area);
        }

    }
}


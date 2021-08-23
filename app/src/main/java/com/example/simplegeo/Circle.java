package com.example.simplegeo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Circle extends AppCompatActivity {
    EditText r;
    TextView Area;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle);
        r=findViewById(R.id.editTextNumberDecimal8);
        Area=findViewById(R.id.textView11);
    }    public void Calculate(View view) {
        if(r.getText().toString().matches("")){


        }else {
            float R=Float.parseFloat(r.getText().toString());

            float pi=(float)314/100;
            float area =pi*R*R ;
            Area.setText("Area :"+area);
        }

    }
}
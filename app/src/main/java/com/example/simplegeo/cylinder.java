package com.example.simplegeo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class cylinder extends AppCompatActivity {
EditText r;
EditText h;
TextView Area;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cylinder);
        r=findViewById(R.id.editTextNumberDecimal6);
        h=findViewById(R.id.editTextNumberDecimal7);
        Area=findViewById(R.id.textView9);
    }
    public void Calculate(View view) {
        if(r.getText().toString().matches("")||h.getText().toString().matches("")){


        }else {
            float R=Float.parseFloat(r.getText().toString());
            float H =Float.parseFloat(h.getText().toString());
            float pi=(float)314/100;
            float area =2*pi*R*(R+H);
            Area.setText("Area :"+area);
        }

    }
}
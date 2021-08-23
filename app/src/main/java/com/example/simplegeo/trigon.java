package com.example.simplegeo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class trigon extends AppCompatActivity {
EditText A ;
EditText B ;
TextView Area ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trigon);
        A=findViewById(R.id.aEditText);
        B=findViewById(R.id.bEditText);
        Area=findViewById(R.id.answerText);}
  public void Calculate(View view) {
      if(A.getText().toString().matches("")||B.getText().toString().matches("")){


        }else {
          float number1=Integer.parseInt(A.getText().toString());
          float number2 =Integer.parseInt(B.getText().toString());
          float area =number1*number2/2 ;
          Area.setText("Area :"+area);
      }

    }
}
package com.example.simplegeo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void trigon(View view){
        Intent intent = new Intent(getApplicationContext(),trigon.class);
        startActivity(intent);
    }
    public void square(View view){
        Intent intent= new Intent(getApplicationContext(),squareActivity.class);
        startActivity(intent);

    }
    public  void Cone(View view){
        Intent intent= new Intent(getApplicationContext(),Cone.class);
        startActivity(intent);    }
        public void cube(View view){
            Intent intent= new Intent(getApplicationContext(),Cube.class);
            startActivity(intent);
        }
        public  void cylinder(View view){
            Intent intent= new Intent(getApplicationContext(),cylinder.class);
            startActivity(intent);
        }
        public void  Circle(View view){
            Intent intent= new Intent(getApplicationContext(),Circle.class);
            startActivity(intent);

        }
}
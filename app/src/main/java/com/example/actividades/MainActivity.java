package com.example.actividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadComponents();

    }

    private void loadComponents(){
        Button btn1 = findViewById(R.id.btn1);
        Button btn2 = findViewById(R.id.btn2);
        Button btn3 = findViewById(R.id.btn3);
        Button btn4 = findViewById(R.id.btn4);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn1:{
                Intent actividad1 = new Intent(this,Actividad1.class);
                actividad1.putExtra("msn", "vamos a la actividad1");
                startActivity(actividad1);
                break;
            }
        }
        switch (v.getId()){
            case R.id.btn2:{
                Intent actividad2 = new Intent(this,Actividad2.class);
                actividad2.putExtra("msn", "vamos a la actividad2");
                startActivity(actividad2);
                break;
            }
        }
        switch (v.getId()){
            case R.id.btn3:{
                Intent actividad3 = new Intent(this,Actividad3.class);
                actividad3.putExtra("msn", "vamos a la actividad3");
                startActivity(actividad3);
                break;
            }
        }
        switch (v.getId()){
            case R.id.btn4:{
                Intent actividad4 = new Intent(this,Actividad4.class);
                actividad4.putExtra("msn", "vamos a la actividad4");
                startActivity(actividad4);
                break;
            }
        }
    }
}

package com.example.amst_primeraevalpractica_g3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class perdedor extends AppCompatActivity {

    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perdedor);
        context=getApplicationContext();
    }

    public  void salir(View view){
        Intent intent=new Intent(context,MainActivity.class);
        startActivity(intent);
    }

    public  void jugar(View view){
        Intent intent=new Intent(context,PreguntasActivity.class);
        startActivity(intent);
    }

}
package com.example.amst_primeraevalpractica_g3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class perdedor extends AppCompatActivity {

    private Context context;

    private TextView txt_respondidas;
    String newString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perdedor);
        context=getApplicationContext();
        txt_respondidas= (TextView) findViewById(R.id.txt_respondidas);

        Bundle extras = getIntent().getExtras();
        if(extras!=null)
        {
            int j =(int) extras.get("contestadas");
            txt_respondidas.setText("Ha respondido "+Integer.toString(j)+" preguntas");

        }







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
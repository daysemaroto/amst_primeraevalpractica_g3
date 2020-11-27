package com.example.amst_primeraevalpractica_g3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PreguntasActivity extends AppCompatActivity {


    public List<Trivia> trivias;
    public int errores;
    public int contestadas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preguntas);

        this.errores=0;
        this.contestadas=0;


        this.trivias = new ArrayList<>();

        ////////////////////////////
        List<Pregunta> preguntas1=new ArrayList<>();
        preguntas1.add(new Pregunta("En 1965",false));
        preguntas1.add(new Pregunta("En 1968",false));
        preguntas1.add(new Pregunta("En 1977",true));
        preguntas1.add(new Pregunta("En 1979",false));

        Trivia trivia1=new Trivia("p1.png","¿En qué año se estrenó la primera película de la saga?",preguntas1);

        this.trivias.add(trivia1);
        ///////////////////////////

        List<Pregunta> preguntas2=new ArrayList<>();
        preguntas2.add(new Pregunta("Su falta de fe me resulta perturbadora",true));
        preguntas2.add(new Pregunta("Me ha fallado por última vez, almirante",false));
        preguntas2.add(new Pregunta("Ese nombre ya no significa nada para mí",false));
        preguntas2.add(new Pregunta("No conoces el poder del lado oscuro",false));

        Trivia trivia2=new Trivia("p2.png","¿Cuál es la frase más famosa del personaje de Darth Vader?",preguntas2);

        this.trivias.add(trivia2);
        ///////////////////////////

        List<Pregunta> preguntas3=new ArrayList<>();
        preguntas3.add(new Pregunta("Hoth",false));
        preguntas3.add(new Pregunta("Dagobah",true));
        preguntas3.add(new Pregunta("Tatooine",false));
        preguntas3.add(new Pregunta("Naboo",false));

        Trivia trivia3=new Trivia("p3.png","¿Cómo se llama el planeta de origen del maestro Yoda?",preguntas3);

        this.trivias.add(trivia3);

        ///////////////////////////

        List<Pregunta> preguntas4=new ArrayList<>();
        preguntas4.add(new Pregunta("BB-8",false));
        preguntas4.add(new Pregunta("C-3PO",false));
        preguntas4.add(new Pregunta("D-0",false));
        preguntas4.add(new Pregunta("T-800",true));

        Trivia trivia4=new Trivia("p4.png","Uno de estos robots no pertenece a la saga de Star Wars. ¿Cuál?",preguntas4);

        this.trivias.add(trivia4);
        ///////////////////////////

        List<Pregunta> preguntas5=new ArrayList<>();
        preguntas5.add(new Pregunta("Los enemigos de Yoda",false));
        preguntas5.add(new Pregunta("Los principales villanos de Star Wars",true));
        preguntas5.add(new Pregunta("Los héroes de Coruscant",false));
        preguntas5.add(new Pregunta("Los máximos representantes de los Rebeldes",false));


        Trivia trivia5=new Trivia("p5.png","¿Quiénes son los Sith?",preguntas5);

        this.trivias.add(trivia5);
        ///////////////////////////


    }
}
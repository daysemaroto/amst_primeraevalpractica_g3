package com.example.amst_primeraevalpractica_g3;

import java.util.List;

public class Trivia {

    private int id;
    private int imagen;
    private String pregunta;
    private List<Pregunta> preguntas;

    public Trivia(int id,int imagen, String pregunta, List<Pregunta> preguntas) {
        this.imagen = imagen;
        this.pregunta = pregunta;
        this.preguntas = preguntas;
        this.id=id;
    }

    public int getImagen() {
        return imagen;
    }


    public String getPregunta() {
        return pregunta;
    }


    public int getId(){
        return id;
    }

    public List<Pregunta> getPreguntas() {
        return preguntas;
    }


}

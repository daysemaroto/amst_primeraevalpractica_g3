package com.example.amst_primeraevalpractica_g3;

import java.util.List;

public class Trivia {

    private String imagen;
    private String pregunta;
    private List<Pregunta> preguntas;

    public Trivia(String imagen, String pregunta, List<Pregunta> preguntas) {
        this.imagen = imagen;
        this.pregunta = pregunta;
        this.preguntas = preguntas;
    }

    public String getImagen() {
        return imagen;
    }


    public String getPregunta() {
        return pregunta;
    }


    public List<Pregunta> getPreguntas() {
        return preguntas;
    }


}

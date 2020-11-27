package com.example.amst_primeraevalpractica_g3;

public class Pregunta {

    private String contenido;
    private  boolean correcta;

    public Pregunta(String contenido, boolean correcta) {
        this.contenido = contenido;
        this.correcta = correcta;
    }

    public boolean isCorrecta() {
        return correcta;
    }
}

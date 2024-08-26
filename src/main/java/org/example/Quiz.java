package org.example;

import org.example.Quiz;

import java.util.ArrayList;
import java.util.List;

public class Quiz {
    private List<Preguntas> questionario;
    private int puntaje;

    public Quiz() {
        questionario = new ArrayList<Preguntas>();
        puntaje = 0;
    }

    public void agregarPregunta (Preguntas pregunta) {
        questionario.add(pregunta);
    }

    public void evaluarPregunta(int indicePregunta, int respuestaUsuario) {
        if(questionario.get(indicePregunta).getRespuestaCorrecta() == respuestaUsuario) {
            puntaje++;
        }
    }

    public void mostrarPuntaje () {
        System.out.println("Su puntaje es: " + puntaje);
    }

}

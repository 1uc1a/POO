package org.example;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();
        List<String> respuesta1 = new ArrayList<String>();
        respuesta1.add("1");
        respuesta1.add("2");
        respuesta1.add("Todos");
        respuesta1.add("Ninguno");
        Preguntas pregunta1 =
                new Preguntas("Cuántos meses tienen 28 días?",
                        respuesta1, 3);
        quiz.agregarPregunta(pregunta1);

        pregunta1.mostrarPregunta();

    }
}
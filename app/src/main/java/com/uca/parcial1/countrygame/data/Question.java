package com.uca.parcial1.countrygame.data;

/**
 * Created by alejandro on 6/7/17.
 */

public class Question {
    private String pregunta;
    private Integer paisCorrecto;

    public Question(String pregunta, Integer paisCorrecto) {
        this.pregunta = pregunta;
        this.paisCorrecto = paisCorrecto;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public Integer getPaisCorrecto() {
        return paisCorrecto;
    }

    public void setPaisCorrecto(Integer paisCorrecto) {
        this.paisCorrecto = paisCorrecto;
    }
}

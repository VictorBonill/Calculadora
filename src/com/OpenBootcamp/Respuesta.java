package com.OpenBootcamp;

/**
 * vBonilla@ 10/03/2022 - Implemento la clase Respuesta para dar solución al problema de devolver dos tipos de respuesta,
 * además del double, es necesario devolver un null cuando el operador no es llamado.
 */
public class Respuesta {
    public static Respuesta respuesta;
    double respuestaCorrecta;
    String respuestaInvalida = null;

    private Respuesta() {}
    public Respuesta(double respuestaCorrecta) {
        this.respuestaCorrecta = respuestaCorrecta;
    }
    public static Respuesta getInstance(){
        if (respuesta==null){
            respuesta = new Respuesta();
        }
        return respuesta;
    }

    public double getRespuestaCorrecta() {
        return respuestaCorrecta;
    }

    public void setRespuestaCorrecta(double respuestaCorrecta) {
        this.respuestaCorrecta = respuestaCorrecta;
    }

    public String getRespuestaInvalida() {
        return respuestaInvalida;
    }

    public void setRespuestaInvalida(String respuestaInvalida) {
        this.respuestaInvalida = respuestaInvalida;
    }
}

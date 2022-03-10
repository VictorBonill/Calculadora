package com.OpenBootcamp;

/**
 * Implemento la clase Respuesta para dar solución al problema de devolver dos tipos de respuesta,
 * además del double, es necesario devolver un null cuando el operador no es llamado.
 * @author vbonilla.77@
 * @since 10/03/2022
 */
public class Respuesta {
    public static Respuesta respuesta;
    double respuestaCorrecta;
    boolean respuestaInvalida = false;

    private Respuesta() {}

    /**
     *
     * @return una instancia, si ya existe, devuelve la que ya se había creado anteriormente
     */
    public static Respuesta getInstance(){
        if (respuesta==null){
            respuesta = new Respuesta();
        }
        return respuesta;
    }

    /**
     *
     * @return devuelve un valor tipo double
     */
    public double getRespuestaCorrecta() {
        return respuestaCorrecta;
    }

    /**
     *
     * @param respuestaCorrecta requiere un valor tipo double
     */
    public void setRespuestaCorrecta(double respuestaCorrecta) {
        this.respuestaCorrecta = respuestaCorrecta;
    }

    /**
     *
     * @return devuelve un valor tipo String
     */
    public boolean getRespuestaInvalida() {
        return respuestaInvalida;
    }

    /**
     *
     * @param respuestaInvalida requiere un valor tipo String
     */
    public void setRespuestaInvalida(boolean respuestaInvalida) {
        this.respuestaInvalida = respuestaInvalida;
    }
}

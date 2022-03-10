package com.OpenBootcamp.operaciones;

import com.OpenBootcamp.Respuesta;

public class Resta implements Operador{
    /**
     * Debido a que dos números negativos pueden ser introducidos al mismo tiempo,
     * es preciso identificar el primer operando y procesarlo de manera diferente.
     * @param datosRecibidos valor tipo String recibido por linea de comandos
     * @return valor tipo Respuesta
     */
    @Override
    public Respuesta hagaCalculo(String datosRecibidos) {
        Respuesta respuesta = Respuesta.getInstance();
        String sinSignoNegativo;

        if(datosRecibidos.contains("-") && !datosRecibidos.contains("+") && !datosRecibidos.contains("*") && !datosRecibidos.contains("/")) {
            sinSignoNegativo = datosRecibidos.startsWith("-") ? datosRecibidos.substring(1) : datosRecibidos;
            ObtenerOperandos numbers = new ObtenerOperandos(sinSignoNegativo, "-");
            boolean PrimeroNegativo = datosRecibidos.startsWith("-");

            if(PrimeroNegativo) respuesta.setRespuestaCorrecta((numbers.getNumberOne()*-1 - numbers.getNumberTwo()));
            else respuesta.setRespuestaCorrecta((numbers.getNumberOne() - numbers.getNumberTwo()));
        }
        return respuesta;

    }
}

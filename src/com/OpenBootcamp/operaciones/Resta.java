package com.OpenBootcamp.operaciones;

import com.OpenBootcamp.Respuesta;

public class Resta implements Operador{

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

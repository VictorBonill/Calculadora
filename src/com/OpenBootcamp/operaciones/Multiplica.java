package com.OpenBootcamp.operaciones;

import com.OpenBootcamp.Respuesta;

public class Multiplica implements Operador{
    /**
     *
     * @param datosRecibidos valor tipo String recibido por linea de comandos
     * @return valor tipo Respuesta
     */
    @Override
    public Respuesta hagaCalculo(String datosRecibidos) {
        Respuesta respuesta = Respuesta.getInstance();
        if (datosRecibidos.contains("*")){
            ObtenerOperandos numbers = new ObtenerOperandos(datosRecibidos, "\\*");
            respuesta.setRespuestaCorrecta(numbers.getNumberOne() * numbers.getNumberTwo());
        }
        return respuesta;
    }
}
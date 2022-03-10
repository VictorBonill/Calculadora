package com.OpenBootcamp.operaciones;

import com.OpenBootcamp.Respuesta;

public class Suma implements Operador{

    @Override
    public Respuesta hagaCalculo(String datosRecibidos) {
        Respuesta respuesta = Respuesta.getInstance();
        if (datosRecibidos.contains("+")){
            ObtenerOperandos numbers = new ObtenerOperandos(datosRecibidos, "\\+");
            respuesta.setRespuestaCorrecta(numbers.getNumberOne() + numbers.getNumberTwo());
        }
        return respuesta;
    }
}

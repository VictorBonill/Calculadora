package com.OpenBootcamp.operaciones;

public class Divide implements Operador{

    @Override
    public void hagaCalculo(String datosRecibidos) {
        if (datosRecibidos.contains("/")){
            ObtenerOperandos numbers = new ObtenerOperandos(datosRecibidos, "/");
            System.out.println(numbers.getNumberOne() / numbers.getNumberTwo());
        }
    }
}

package com.OpenBootcamp.operaciones;

public class Resta implements Operador{

    @Override
    public void hagaCalculo(String datosRecibidos) {
        String sinSignoNegativo;
        if(datosRecibidos.contains("-") && !datosRecibidos.contains("+") && !datosRecibidos.contains("*") && !datosRecibidos.contains("/")) {
            sinSignoNegativo = datosRecibidos.startsWith("-") ? datosRecibidos.substring(1) : datosRecibidos;
            ObtenerOperandos numbers = new ObtenerOperandos(sinSignoNegativo, "-");
            boolean PrimeroNegativo = datosRecibidos.startsWith("-");
            if(PrimeroNegativo) System.out.println(numbers.getNumberOne()*-1 - numbers.getNumberTwo());
                else System.out.println(numbers.getNumberOne() - numbers.getNumberTwo());
        }

    }
}

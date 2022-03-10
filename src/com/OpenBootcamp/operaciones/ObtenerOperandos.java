package com.OpenBootcamp.operaciones;

/**
 * Esta clase devuelve dos números tipo double, dependiendo de la entrada tipo String
 */
public class ObtenerOperandos {
    private double numberOne;
    private double numberTwo;

    /**
     *
     * @param datosRecibidos valor tipo String
     * @param operador carácter que identifica la operación a realizar
     */
    public ObtenerOperandos(String datosRecibidos, String operador) {
        try{
            String[] parts = datosRecibidos.split(operador);
            numberOne = Double.parseDouble(parts[0]);
            numberTwo = Double.parseDouble(parts[1]);
        }catch (Exception e){
            System.out.println("Ha ocurrido un problema: " + e.getMessage());
        }
    }

    public double getNumberOne() {
        return numberOne;
    }

    public double getNumberTwo() {
        return numberTwo;
    }
}

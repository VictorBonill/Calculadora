package com.OpenBootcamp;

public class Apagada extends Estado{


    public Apagada(Calculadora calculadora) {
        super(calculadora);
    }

    @Override
    public void encender() {

        System.out.println("_____________ CALCULADORA MUY MONA!! ________________________");
        System.out.println("Ingrese la operación que desea realizar, ejemplo: '5+8'");
        System.out.println("Presiona Enter para ver el resultado!!");
        //System.out.println("Para ver todo el historial de operaciones escriba: h");
        System.out.println("Para terminar de usar la calculadora escriba: fin");
        System.out.println("_____________________________________________________________");
        calculadora.cambiarEstado(new Operativa(calculadora));
    }

    @Override
    public void operar() {
        System.out.println("No se ha encendido la calculadora");
    }

    @Override
    public void apagar() {
        System.out.println("Ya esta apagada!!");
    }
}

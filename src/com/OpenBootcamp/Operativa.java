package com.OpenBootcamp;

import com.OpenBootcamp.operaciones.RecibeDatos;

public class Operativa extends Estado{

    public Operativa(Calculadora calculadora) {
        super(calculadora);
    }

    @Override
    public void encender() {
        System.out.println("Ya esta encendida!!");
    }

    @Override
    public void operar() {
        RecibeDatos in = new RecibeDatos();
        in.getDatos();
    }

    @Override
    public void apagar() {
        calculadora.cambiarEstado(new Apagada(calculadora));
        System.out.println("Se ha apagado exitosamente!!");
    }
}

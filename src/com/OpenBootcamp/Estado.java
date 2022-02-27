package com.OpenBootcamp;

abstract public class Estado {
    public Calculadora calculadora;

    public Estado(Calculadora calculadora) {
        this. calculadora = calculadora;
    }

    abstract public void encender();
    abstract public void operar();
    abstract public void apagar();
}

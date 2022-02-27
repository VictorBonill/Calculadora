package com.OpenBootcamp;

public class Calculadora {
    public Estado estado;

    public Calculadora() {
        estado = new Apagada(this);
    }

    public void cambiarEstado(Estado estado){
        this.estado = estado;
    }

    public Estado getEstado(){
        return estado;
    }
}

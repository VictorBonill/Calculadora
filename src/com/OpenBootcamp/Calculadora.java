package com.OpenBootcamp;

public class Calculadora {
    public Estado estado;

    /**
     * Constructor: inicialmente la calculadora debe estar apagada.
     */
    public Calculadora() {
        estado = new Apagada(this);
    }

    /**
     *
     * @param estado recibe un nuevo valor tipo Estado y lo asigna
     */
    public void cambiarEstado(Estado estado){
        this.estado = estado;
    }

    /**
     *
     * @return estado actual
     */
    public Estado getEstado(){
        return estado;
    }
}

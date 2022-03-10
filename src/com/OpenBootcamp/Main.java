package com.OpenBootcamp;

/**
 * Código original: vbonilla.77@
 */
public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.estado.apagar();
        calculadora.estado.encender();
        calculadora.estado.operar();
        calculadora.estado.apagar();
    }
    //TODO: Deberíamos crear una clase para manejar las excepciones y errores.
}

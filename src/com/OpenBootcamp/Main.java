package com.OpenBootcamp;

/**
 * @author vbonilla.77@
 * @see <a href="https://github.com/VictorBonill/Calculadora">Visita el repositorio</a>
 * @since 10/03/2022
 */
public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.estado.encender();
        calculadora.estado.operar();
        calculadora.estado.apagar();
    }
    //TODO: Deberíamos crear una clase para manejar las excepciones y errores.
}

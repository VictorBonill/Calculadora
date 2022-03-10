package com.OpenBootcamp;

/**
 * La clase Calculadora implementa diversos métodos que permiten la
 * gestión del uso de la app calculadora, está implementando un patron de diseño Singleton.
 *
 * El objetivo de esta implementación era sustituir a la vieja clase "main", que estaba sobrecargada con
 * el código apiñado.
 *
 * Al utilizar el patron State, hemos permitido que la app calculadora sea más fácil de mantener,
 * y pueda ser más escalable.
 */
abstract public class Estado {
    public Calculadora calculadora;

    public Estado(Calculadora calculadora) {
        this. calculadora = calculadora;
    }

    abstract public void encender();
    abstract public void operar();
    abstract public void apagar();
}

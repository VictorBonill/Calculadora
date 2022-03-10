package com.OpenBootcamp.operaciones;

import com.OpenBootcamp.Respuesta;

/**
 *Por medio de la interface Operador y siguiendo un patron state, lo que hacemos
 * es suscribir las operaciones que nuestra calculadora podrá realizar
 * Como consecuencia cada operación debera implementar el método "hagaCalculo"
 */
public interface Operador {
    Respuesta hagaCalculo(String datosrecibidos);
}

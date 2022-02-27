package com.OpenBootcamp;
/* Aplica a uno de los proyectos anteriores un patrón de comportamiento de los vistos durante la sesión 9
 * y explica por qué has escogido ese patrón en concreto.*/

// R/. He usado dos patrones de diseño comportamental: El patron status y el patron observer.
// Use inicialmente el patron status, porque deseaba que la calculadora siguiera un flujo de pasos para su funcionamiento.
// Luego observe que para hacer más clean code la app, era necesario usar el patron observer, ya que el comportamiento de la app
// depende de en gran medida de la entrada de datos y dependiendo de estos la app debe hacer una u otra operación.

/* Aplica refactoring a cualquiera de los proyectos que se han ido tratando en el curso,
 * recuerda hacerte valer de las técnicas vistas en clase incluidos los patrones de diseño.*/

// R/. Aplique refactoring a esta app, aunque si me gustaría recibir cualquier tipo de feedback.


public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.estado.apagar();
        calculadora.estado.encender();
        calculadora.estado.operar();
        calculadora.estado.apagar();
    }
    }

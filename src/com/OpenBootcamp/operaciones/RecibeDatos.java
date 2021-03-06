package com.OpenBootcamp.operaciones;

import com.OpenBootcamp.Respuesta;
import com.OpenBootcamp.historial.Historial;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *Además de recibir el valor de entrada, realiza la suscripción de las operaciones en la calculadora de manera
 * predeterminada mediante el constructor, y recupera el historial del archivo txt
 */
public class RecibeDatos {
    Historial historial = new Historial();
    HashMap<String, Double> calculosRealizados;
    private final ArrayList<Operador> operadores = new ArrayList<>();
    String datosRecibidos;

    public RecibeDatos(){
        Suma suma = new Suma();
        Resta resta = new Resta();
        Multiplica multiplica = new Multiplica();
        Divide divide = new Divide();
        agregarOperador(suma);
        agregarOperador(resta);
        agregarOperador(multiplica);
        agregarOperador(divide);
        calculosRealizados = this.historial.recuperarHistorial();
    }

    public void obtenerDatos(){
        Scanner scanner = new Scanner(System.in);
        do {
            datosRecibidos = scanner.next();
            if (datosRecibidos.contains("h")) {
                System.out.println(calculosRealizados);
            } else {
                buscarOperador(datosRecibidos);
            }
        } while(!datosRecibidos.contains("fin"));
    }
    public void agregarOperador(Operador operador){
        operadores.add(operador);
    }

    public void buscarOperador(String datosRecibidos){
        Respuesta respuesta = Respuesta.getInstance();
        for (Operador operador : operadores){
            respuesta = operador.hagaCalculo(datosRecibidos);
        }
        System.out.println(respuesta.getRespuestaCorrecta());
        calculosRealizados.put(datosRecibidos, respuesta.getRespuestaCorrecta());
        this.historial.guardarEnArchivoTxt(calculosRealizados);
    }
}
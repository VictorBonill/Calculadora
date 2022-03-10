package com.OpenBootcamp.operaciones;

import com.OpenBootcamp.Respuesta;
import com.OpenBootcamp.historial.Historial;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
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
            buscarOperador(datosRecibidos);
            if(datosRecibidos.contains("h")){
                System.out.println(calculosRealizados);
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
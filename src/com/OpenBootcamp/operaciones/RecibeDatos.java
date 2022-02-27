package com.OpenBootcamp.operaciones;

import java.util.ArrayList;
import java.util.Scanner;

public class RecibeDatos {
    private ArrayList<Operador> operadores = new ArrayList();
    double x, y;
    String datosRecibidos;

    public RecibeDatos(){
        Suma suma = new Suma();
        Resta resta = new Resta();
        Multiplica multiplica = new Multiplica();
        Divide divide = new Divide();
        addOperador(suma);
        addOperador(resta);
        addOperador(multiplica);
        addOperador(divide);
    }

    public void getDatos(){
        Scanner scanner = new Scanner(System.in);
        do {
            datosRecibidos = scanner.next();
            buscarOperador(datosRecibidos);
        } while(!datosRecibidos.contains("fin"));
    }
    public void addOperador(Operador operador){
        operadores.add(operador);
    }

    public void buscarOperador(String datosRecibidos){
        for (Operador operador : operadores){
            operador.hagaCalculo(datosRecibidos);
        }
    }
}
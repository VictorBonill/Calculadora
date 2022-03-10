package com.OpenBootcamp.historial;

import java.io.*;
import java.util.HashMap;

/**
 * La clase Historial implementa dos métodos: para guardar las operaciones realizadas, y
 * otro para recuperar el historial completo.
 * @author vbonilla.77@
 * @since 10/03/2022
 *
 */
public class Historial {
    /**
     *
     * @param historial recibe un valor tipo Hashmap y lo guarda en un archivo txt
     */
    public void guardarEnArchivoTxt(HashMap<String, Double> historial){
        try{
            PrintStream archivoAGuardar = new PrintStream("C:\\Users\\vboni\\Desktop\\history.txt");
            archivoAGuardar.println(historial);
            archivoAGuardar.close();
        }
        catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }

    /**
     *
     * @return un valor tipo Hashmap con el listado completo de operaciones recuperadas del archivo txt
     */
    public static HashMap<String, Double> recuperarHistorial(){
        try{
            BufferedReader archivoALeer = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\vboni\\Desktop\\history.txt")));
            HashMap<String, Double> historialRecuperado = new HashMap<>();
            String cadenaRecibida;
            try{
                cadenaRecibida = archivoALeer.readLine();
                cadenaRecibida = cadenaRecibida.substring(1);
                cadenaRecibida = cadenaRecibida.substring(0, cadenaRecibida.length()-1);
                String[] operacionesCargadas = cadenaRecibida.split(",");
                for (String operacion : operacionesCargadas){
                    String[] temp = operacion.split("=");
                    String clave = temp[0].trim();
                    Double valor = Double.valueOf(temp[1].trim());
                    historialRecuperado.put(clave, valor);

                }
                return historialRecuperado;
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
        catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        return null;
    }

}

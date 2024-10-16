
/*
 * AÑADIR A calendario.java LA PARTE DEL CODIGO QUE LE LEE EL ARCHIVO 
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Escritura {
    public static void main(String[] args) {
        String rutaArchivo = "../tareas.txt";
        StringBuilder contenido = new StringBuilder();
        StringBuilder archivoContent = new StringBuilder();

        // Leer el contenido existente del archivo
        try (BufferedReader leer = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = leer.readLine()) != null) {
                String[] parts = linea.split(",");
                if (parts.length >= 3) { // Asegurarse de que hay al menos 3 partes
                    String date = parts[0];
                    String month = parts[1];
                    String task = parts[2];
                    if (date.equals("10")) {
                        System.out.println("Dia 10");
                    } else {
                        System.out.printf("-%s%n", linea);
                    }
                    archivoContent.append(linea).append("\n");
                } else {
                    System.out.println("Línea malformada: " + linea);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Pedir al usuario que introduzca la fecha
        try (Scanner sc = new Scanner(System.in)) {
            System.out.printf("Introduce el mes: %n");
            int dia = sc.nextInt();
            System.out.printf("Introduce el dia: %n");
            int mes = sc.nextInt();
            System.out.printf("Introduce el titulo: %n");
            String tarea = sc.next();
            contenido.append("\n").append(mes).append(",").append(dia).append(",").append(tarea);
        }

        // Escribir el nuevo contenido en el archivo
        try (FileWriter escritor = new FileWriter(rutaArchivo, true)) {
            escritor.write(contenido.toString());
            System.out.println("Contenido escrito exitosamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

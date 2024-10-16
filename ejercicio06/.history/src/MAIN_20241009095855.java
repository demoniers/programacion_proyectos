import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MAIN {
    public static void limpiar() {
        // Método que imprime líneas en blanco
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
    public static void main(String[] args) throws Exception {
        // Nivel y categoria
        Nivel level = new Nivel(001,"Facil");
        Categoria categoria = new Categoria(001,"Programacion");

        // contenidos 
        Contenido content1 = new Contenido(001,"Java 1", "Este es un ejercicio de java sencillo en le que debes hacer un 'Hellow World'.");
        Contenido content2 = new Contenido(002,"Java 2", "Este es un ejercicio de java intermidio.");
        Contenido content3 = new Contenido(003,"Java 3", "Este es un ejercicio de java complejo.");
        

        List<Contenido> contenidos = Arrays.asList(content1, content2, content3);

        Ejercicio ejercicio = new Ejercicio(001, "Ejercicio 1", level, categoria, contenidos);
        
        // Ahora puedes acceder a las propiedades del ejercicio
        System.out.printf("%s%n",ejercicio);
        
        // Recorriendo contenidos
        for (Contenido contenido : contenidos) {
            System.out.println(contenido);
        }
        parts.length >= 3) // Asegurarse de que hay al menos 3 partes
            String date = parts[0];
            String month = parts[1];
            String task = parts[2];
    }
}
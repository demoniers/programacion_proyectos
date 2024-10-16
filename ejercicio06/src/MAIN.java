import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MAIN {
    public static void main(String[] args) throws Exception {
        // Nivel y categoria
        Nivel levelF = new Nivel(001,"Facil");
        Nivel levelM = new Nivel(002,"Medio");
        Nivel levelD = new Nivel(003,"Dificil");
        Categoria categoria = new Categoria(001,"Programacion");
        Categoria cocina = new Categoria(002,"cocina");

        // contenidos 
        Contenido content1 = new Contenido(001,"Java 1", "Este es un ejercicio de java sencillo en le que debes hacer un 'Hellow World'.");
        Contenido content2 = new Contenido(002,"Java 2", "Este es un ejercicio de java intermidio.");
        Contenido content3 = new Contenido(003,"Java 3", "Este es un ejercicio de java complejo.");
        

        List<Contenido> contenidos = Arrays.asList(content1, content2, content3);

        Ejercicio ejercicio = new Ejercicio(001, "Ejercicio 1", levelF, categoria, contenidos);
        Ejercicio ejercicio2 = new Ejercicio(001, "Ejercicio 2", levelF, categoria, contenidos);
        Ejercicio ejercicio3 = new Ejercicio(001, "Ejercicio 3", levelM, categoria, contenidos);
        
        // Ahora puedes acceder a las propiedades del ejercicio
        System.out.printf("%s%n",ejercicio);
        
        // Recorriendo contenidos
        for (Contenido contenido : contenidos) {
            System.out.println(contenido);
        }

        System.out.printf("%nHubo un error%n");

        ejercicio.setNivel(levelD);
        ejercicio.setCategoria(cocina);

        System.out.printf("%s%n",ejercicio);
        
        // Recorriendo contenidos
        for (Contenido contenido : contenidos) {
            System.out.println(contenido);
        }
    }
}
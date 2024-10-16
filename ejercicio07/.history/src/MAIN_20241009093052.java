import java.util.Arrays;
import java.util.List;

public class MAIN {
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
        System.out.printf("%s",ejercicio);
        
        // Recorriendo contenidos
        for (Contenido contenido : contenidos) {
            System.out.println(contenido);
        }
    }
}
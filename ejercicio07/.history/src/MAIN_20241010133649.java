import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MAIN {
    public static void limpiar() {
        // Método que imprime líneas en blanco
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
    public static void main(String[] args) throws Exception {
        // Nivel y categoria
        Nivel levelF = new Nivel(001,"Facil");
        Nivel levelM = new Nivel(002,"Medio");
        Nivel levelD = new Nivel(003,"Dificil");
        Ejercicio ejercicio = new Ejercicio(001, "Ejercicio 10","Quiero patatas",levelF);
        
        // Ahora puedes acceder a las propiedades del ejercicio
        limpiar();
        System.out.printf("%s%n",ejercicio);
        System.out.printf("%nHubo un error%n");
        limpiar();
        ejercicio.nivel = levelD;
        System.out.printf("%s%n",ejercicio);
        
    }
}
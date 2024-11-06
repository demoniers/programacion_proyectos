import java.util.List;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        // Creacion de personas
        Moviles m1 = new Moviles("Redmi Note 5", "Xiaomi", 4);
        Moviles m2 = new Moviles("Redmi Note 7", "Xiaomi", 8);
        Moviles m3 = new Moviles("Redmi Note P2", "Xiaomi", 4);
        Moviles m4 = new Moviles("Redmi Note Mt 59", "Xiaomi", 8);
        Moviles m5 = new Moviles("Redmi Note 9", "Xiaomi", 84);
        Moviles m6 = new Moviles("Redmi Note 10+", "Xiaomi", 8);
        Moviles m7 = new Moviles("Redmi Note 11+", "Xiaomi", 4);
        Moviles m8 = new Moviles("Redmi Note 12+", "Xiaomi", 8);
        Moviles m9 = new Moviles("Redmi Note 2 M1", "Xiaomi", 4);
        
        // Creaccion de lista ListaPersonas
        List<Moviles> listam = new ArrayList<>(List.of(m1, m2, m3, m4, m5, m6,m7,m8,m9));
        
        // Bucle recorre lista
        for (Moviles moviles : listam) {
            if (moviles.numRam() >= 8) { // Comprobar numRam()
                System.out.println(moviles);
            }
        }
    }
}
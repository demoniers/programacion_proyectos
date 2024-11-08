import java.util.List;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        // Creacion de botes
        Coche c1 = new Coche("CBS");

        // Creaccion de lista ListaBotes
        List<Botes> listac = new ArrayList<>(List.of(b1, b2, b3, b4));
        int i = 0;
       while (i < listac.size()) {
        Coche cochecito = listac.get(i);
        cochecito.modelo();
        
       }
        
        
    }
}
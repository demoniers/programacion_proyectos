import java.util.List;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        // Creacion de botes
        Coche c1 = new Coche("CBS");
        Coche c2 = new Coche("CBS");
        Coche c3 = new Coche("CBS");
        Coche c4 = new Coche("CBS");
        Coche c5 = new Coche("CBS");

        // Creaccion de lista ListaBotes
        List<Car> listac = new ArrayList<>(List.of(c1, c2, c3, c4, c5));
        int i = 0;
       while (i < listac.size()) {
        Coche cochecito = listac.get(i);
        cochecito.model();

       }
        
        
    }
}
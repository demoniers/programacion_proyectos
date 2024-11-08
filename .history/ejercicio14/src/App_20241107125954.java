import java.util.List;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        // Creacion de botes
        Car c1 = new Car("CBS-","","Negro");
        Car c2 = new Car("CBS-","","Negro");
        Car c3 = new Car("CBS-","","Negro");
        Car c4 = new Car("CBS-","","Negro");
        Car c5 = new Car("CBS-","","Negro");

        // Creaccion de lista ListaBotes
        List<Car> listac = new ArrayList<>(List.of(c1, c2, c3, c4, c5));
        int i = 0;
       while (i < listac.size()) {
        Car cochecito = listac.get(i);
        String modelo = cochecito.model();
        cochecito.setModel(modelo+i);
       }
        
        
    }
}
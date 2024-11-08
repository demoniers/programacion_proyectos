import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Creacion de botes
        Car c1 = new Car("CBS-",90,"Negro");
        Car c2 = new Car("CBS-",100,"Negro");
        Car c3 = new Car("CBS-",200,"Negro");
        Car c4 = new Car("CBS-",100,"Negro");
        Car c5 = new Car("CBS-",130,"Negro");

        // Creaccion de lista ListaBotes
        Scanner nm = new Scanner(System.in); 
        while (i < listac.size()) { 
            Car cochecito = listac.get(i); 
            String modelo = cochecito.getModel(); 
            System.out.print("Enter a suffix for model " + modelo + ": "); 
            int suffix = nm.nextInt(); 
            cochecito.setModel(modelo + suffix); i++;
        } 
        nm.close(); // Cerrar el Scanner después de su uso
        
        
    }
}
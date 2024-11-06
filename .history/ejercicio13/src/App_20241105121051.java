import java.util.List;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        // Creacion de personas
        Botes b1 = new Botes("Rojo", 4);
        Botes b2 = new Botes("Azul", 1);
        Botes b3 = new Botes("Blanco", 0.5);
        Botes b4 = new Botes("Verde", 1.9);
        
        // Creaccion de lista ListaPersonas
        List<Botes> listab = new ArrayList<>(List.of(b1, b2, b3, b4));
        
        // Bucle recorre lista
        for (Botes bote : listab) {
            if (bote.cantidad() >= 8) { // Comprobar numRam()
                System.out.println(moviles);
            }
        }
    }
    public static void ColorUtils(String color) {
        String coloris = color.toLowerCase();
        switch (coloris) {
            case "rojo":
                String hexadecimal = "#ff0000";
                break;
            case "azul":
                String hexadecimal = "#0000ff";
                break;    
            default:
                String hexadecimal = "No hay";
                break;
        }
    }
}
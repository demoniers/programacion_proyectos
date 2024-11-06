import java.util.List;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        // Creacion de personas
        Botes b1 = new Botes("Rojo", 4);
        Botes b2 = new Botes("Azul", 1);
        Botes b3 = new Botes("Blanco", 5);
        Botes b4 = new Botes("Verde", 1);
        
        
        // Creaccion de lista ListaPersonas
        List<Botes> listab = new ArrayList<>(List.of(b1, b2, b3, b4));
        
        // Bucle recorre lista
        for (Botes bote : listab) {
            String color = bote.color();
            String hexa = ColorUtils(color);
            String tamanio;
            if (bote.litros() >= 1) { // Comprobar cantidad()
                tamanio = "grande";
            } else {
                tamanio = "pequeño";
            }
            System.out.println("El bote de color "+bote.color()+"( "+hexa+" )"+" con una cantidad de "+bote.litros()+" es un bote "+tamanio+"\n");
        }
    }
    public static String ColorUtils(String color) {
        String coloris = color.toLowerCase();
        String hexadecimal;
        switch (coloris) {
            case "rojo":
                hexadecimal = "#ff0000";
                break;
            case "azul":
                hexadecimal = "#0000ff";
                break;
            case "blanco":
                hexadecimal = "#ffffff";
                break; 
            default:
                hexadecimal = "No hay";
                break;
        }
        return hexadecimal;
    }
}
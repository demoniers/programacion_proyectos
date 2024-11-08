import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Creaccion de lista
        List<Car> listac = new ArrayList<>();
        // while        
        Scanner scan = new Scanner(System.in); 
        int i = 0;
        int nc = -1;
        while (i != 1) {
            if (nc < 0) {
                System.out.println("\n\nIntroduce el numero de vehiculos a añadir");
                int ncoches = scan.nextInt();
                if (ncoches != 1) {
                    nc = ncoches-1;
                } else {
                    nc = ncoches;
                }
            } else {
                i = 1;
            }
        }
        i = 0;
        System.out.println(nc);
        while (i < nc) { 
            System.out.println("introduce el modelo \n SBC-");
            int suffix = scan.nextInt(); 
            String model = "CBS-"+suffix;

            System.out.println("introduce los caballos \n SBC-"+suffix+"\n caballos:");
            int caballosn = scan.nextInt(); 
            scan.nextLine();

            System.out.println("introduce los caballos \n SBC-"+suffix+"\n caballos: "+caballosn+"\n color ");
            String color = scan.nextLine(); 

            Car c = new Car(i,model,caballosn,color);
            listac.add(c);
            i++;
        } 
        scan.close(); // Cerrar el Scanner después de su uso
        
        
     // Bucle recorre listab
        for (Car car : listac) {
            String color = car.color(); //saco los colores
            String hexa = ColorUtils(color); // envio color y espero respuesta
            String tamanio; // inicializo tamaño 
            if (car.caballo() < 90) { // Comprobar tamaño
                tamanio = "el tamaño Ta chiquito";
            } else if (car.caballo() >= 200) {
                tamanio = "Mama cuanto me cueta";
            } else {
                tamanio = "el tamaño Ta bueno";
            }
            // imprimo pregunta 
            System.out.println("Buscando un coche de color "+car.color()
                                +"\n");
            String h = hexa.toLowerCase(); // paso a minusculas el hexadecimal
            if (!h.equals("no hay")) { // cumprueblo si exite color 
                System.out.println("El coche que buscae es el modelo "+car.model()+
                " con un codigo de color ("+hexa+
                ")\n estes seria un coche de "+car.caballo()+" caballos\n");
                System.out.println(tamanio);
            } else {
                System.out.println("El vehiculo que busca no esta disponible.");
            }
        }
    }
    public static String ColorUtils(String color) {
        String coloris = color.toLowerCase(); // recojo color
        String hexadecimal; // inicializo hexadecimal 
        switch (coloris) { // comparo colores
            case "rojo":
                hexadecimal = "#ff0000";
                break;
            case "azul":
                hexadecimal = "#0000ff";
                break;
            case "negro":
                hexadecimal = "#ffffff";
                break; 
            case "blanco":
                hexadecimal = "#ffffff";
                break; 
            case "verde":
                hexadecimal = "#00ff00";
            break; 
            default: // si no existe 
                hexadecimal = "No hay";
                break;
        }
        return hexadecimal; // devuelvo hexadecimal 
    }
}
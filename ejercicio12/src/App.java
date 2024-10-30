import java.util.List;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        // Creacion de personas
        Moviles p1 = new Moviles("anastasia", "fernandez", 8);
        Moviles p2 = new Moviles("Maria", "Agustula", 8);
        Moviles p3 = new Moviles("Ramon", "Ramos", 8);
        
        // Creaccion de lista ListaPersonas
        List<Persona> listap = new ArrayList<>();
        /*
         * List<Person> people;
         * people = new ArrayList<Person>;
         */
        listap.add(p1);
        listap.add(p2);
        listap.add(p3);
        
        // Bucle recorre lista
        for (Persona persona : listap) {
            if (persona.usaGafas() == true) { // Comprobar usaGafas()
                System.out.println(persona+" usa gafas de forma habiatual");
            } else {
                System.out.println(persona+" no usa gafas de forma habitual ");
            }
        }
    }
      
}
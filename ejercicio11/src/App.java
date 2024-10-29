import java.util.List;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        // Creacion de personas
        Persona p1 = new Persona("anastasia", "fernandez", true);
        Persona p2 = new Persona("Maria", "Agustula", false);
        Persona p3 = new Persona("Ramon", "Ramos", true);
        
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
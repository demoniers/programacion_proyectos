
/**
 * Persona
 */
class Persona {
    private String nombre;
    private String apellido;
    private boolean gafas;

    public Persona(String nombre, String apellido, boolean gafas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.gafas = gafas;
    }

    public boolean usaGafas() {
        return gafas;
    }

    public String toString() {
        return nombre+" "+apellido;
    }

    
}
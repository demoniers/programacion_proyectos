
/**
 * Persona
 */
class Botes {
    private String color;
    private int cantidad;

    public Botes(String color, int cantidad) {
        this.color = color;
        this.cantidad = cantidad;
    }

    public int litros() {
        return cantidad;
    }
    public String color() {
        return color;
    }

    
}

/**
 * Persona
 */
class Botes {
    private String color;
    private double cantidad;

    public Botes(String color, double cantidad) {
        this.color = color;
        this.cantidad = cantidad;
    }

    public double litros() {
        return cantidad;
    }
    public String color() {
        return color;
    }

    
}

/**
 * Persona
 */
class Car {
    private String model;
    private int caballo;
    private String color;

    public Car(String model, int caballo, String color) {
        this.model = model;
        this.caballo = caballo;
        this.color = color;
    }

    public String model() {
        return model;
    }
    public String color() {
        return color;
    }
    public int caballo() {
        return caballo;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setCaballo(int caballo) {
        this.caballo = caballo;
    }
    public void setColor(String color) {
        this.color = color;
    }

    
}
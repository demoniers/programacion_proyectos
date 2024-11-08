
/**
 * Persona
 */
class Car {
    private int id;
    private String model;
    private int caballo;
    private String color;

    public Car(int id, String model, int caballo, String color) {
        this.id = id;
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
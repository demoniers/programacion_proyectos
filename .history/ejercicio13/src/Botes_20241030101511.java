
/**
 * Persona
 */
class Moviles {
    private String model;
    private String brand;
    private int ram;

    public Moviles(String model, String brand, int ram) {
        this.model = model;
        this.brand = brand;
        this.ram = ram;
    }

    public int numRam() {
        return ram;
    }

    public String toString() {
        return brand+" | "+model+"  "+ram+" GB";
    }

    
}
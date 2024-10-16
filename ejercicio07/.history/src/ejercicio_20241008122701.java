class Ejercicio {
    private int id;
    private String nombre;

    public Ejercicio(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    public String toString() {
        return "El ejercico "+nombre+" tiene el id "+id;
    }
}
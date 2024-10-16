import java.util.List;

class Ejercicio {
    private int id;
    private String nombre;
    private Nivel nivel;

    public Ejercicio(int id, String nombre, Nivel nivel) {
        this.id = id;
        this.nombre = nombre;
        this.nivel = nivel;
    }
    public String toString() {
        return "El "+nombre+" el ID "+id+" y con un nivel "+nivel;
        //return nombre +","+ id +","+categoria+","+nivel;
    }
}
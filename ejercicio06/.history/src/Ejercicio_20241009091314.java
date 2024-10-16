import java.util.List;

class Ejercicio {
    private int id;
    private String nombre;
    private Nivel nivel;
    private Categoria categoria;
    private List<Contenido> contenidos;

    public Ejercicio(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    public String toString() {
        return "El ejercico '"+ nombre +"'' tiene el id "+ id;
    }
}
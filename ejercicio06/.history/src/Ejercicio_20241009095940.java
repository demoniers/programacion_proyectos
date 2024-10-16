import java.util.List;

class Ejercicio {
    private int id;
    private String nombre;
    private Nivel nivel;
    private Categoria categoria;

    public Ejercicio(int id, String nombre, Nivel nivel, Categoria categoria, List<Contenido> contenidos) {
        this.id = id;
        this.nombre = nombre;
        this.nivel = nivel;
        this.categoria = categoria;
    }
    public String toString() {
        return nombre +","+ id +","+categoria+","+nivel;
    }
}
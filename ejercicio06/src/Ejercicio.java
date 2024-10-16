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
        return "ID: "+id+" | "+nombre+" | Categoria "+categoria.getCategoria()+" | Nivel: "+nivel.getNivel()+"\n ";
    }

    public void setNivel(Nivel nivel) {
        this.nivel = nivel;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
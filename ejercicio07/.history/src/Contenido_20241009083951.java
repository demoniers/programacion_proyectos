
class Contenido {
    int id;
    String contenido;
    String informacion;

    public Contenido(int id, String contenido, String informacion) {
        this.id = id;
        this.contenido = contenido;
        this.informacion = informacion;
    }
    public String toString() {
        return contenido +", "+informacion;
    }
}

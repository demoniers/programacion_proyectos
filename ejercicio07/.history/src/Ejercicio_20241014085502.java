import java.util.List;

class Ejercicio {
    private int id;
    private String nombre;
    Nivel getNivel;
    private String enunciado;

    public Ejercicio(int id, String nombre, String enunciado, Nivel getNivel) {
        this.id = id;
        this.nombre = nombre;
        this.enunciado = enunciado;
        this.getNivel = getNivel;
    }
    public String toString() {
        return "El "+nombre+" | ID: "+id+" | Nivel: "+getNivel+"\n "+enunciado;
        //return nombre +","+ id +","+categoria+","+nivel;
    }
}
import java.util.List;

class Ejercicio {
    private int id;
    private String nombre;
    String nivel;
    private String enunciado;

    public String setNivel() {
        
    }

    public Ejercicio(int id, String nombre, String enunciado, String nivel) {
        this.id = id;
        this.nombre = nombre;
        this.enunciado = enunciado;
        this.nivel = nivel;
    }
    public String toString() {
        return "El "+nombre+" | ID: "+id+" | Nivel: "+getNivel()+"\n "+enunciado;
        //return nombre +","+ id +","+categoria+","+nivel;
    }
}
class Ejercicio {
    private int id;
    private String nombre;
    private Nivel nivel;
    private String enunciado;

    public Ejercicio(int id, String nombre, String enunciado, Nivel nivel) {
        this.id = id;
        this.nombre = nombre;
        this.enunciado = enunciado;
        this.nivel = nivel;
    }
    public String toString() {
        return "El "+nombre+" | ID: "+id+" | Nivel: "+nivel.getNivel()+"\n "+enunciado;
        //return nombre +","+ id +","+categoria+","+nivel;
    } 
    public void setNivel(Nivel nivel) {
        this.nivel = nivel;
    }
}
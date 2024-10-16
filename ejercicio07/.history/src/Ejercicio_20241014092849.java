class Ejercicio {
    private int id;
    private String nombre;
    private Nivel setNivel;
    private String enunciado;

    public Ejercicio(int id, String nombre, String enunciado, Nivel setNivel) {
        this.id = id;
        this.nombre = nombre;
        this.enunciado = enunciado;
        this.setNivel = setNivel;
    }
    public String toString() {
        return "El "+nombre+" | ID: "+id+" | Nivel: "+nivel+"\n "+enunciado;
        //return nombre +","+ id +","+categoria+","+nivel;
    }
}
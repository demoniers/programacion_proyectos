class Ejercicio {
    private int id;
    private String nombre;
    private String nivel;
    private String enunciado;

    public String getNivel() {
        return nivel;
    }
        
    // Setter method for 'name'
    public void setNivel(String nivel) {
        this.nivel = nivel;
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
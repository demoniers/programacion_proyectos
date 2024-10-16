class Nivel {
    int id;
    String nivel;

    public Nivel(int id, String nivel) {
        this.id = id;
        this.nivel = nivel;
    }
    
    public String toString() {
        return "el id es "+id+" pertenece a nivel "+nivel;
    }
    public String getNivel() {
        return nivel;
    }
    
    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
}

class Nivel {
    private int id;
    private String nivel;

    public Nivel(int id, String nivel) {
        this.id = id;
        this.nivel = nivel;
    }
    
    public String toString() {
        return "el id es "+id+" pertenece a nivel "+nivel;
    }
    public String getType() {
        return type;
    }
}

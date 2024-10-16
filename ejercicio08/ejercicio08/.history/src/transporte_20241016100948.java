class Transporte {
    private int id_trasnporte;
    private String tipo;

    public Transporte(int id_trasnporte, String tipo) {
        this.id_trasnporte = id_trasnporte;
        this.tipo = tipo;
    }

    public String getTipo() {
        return this.tipo;
    }
     
     public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
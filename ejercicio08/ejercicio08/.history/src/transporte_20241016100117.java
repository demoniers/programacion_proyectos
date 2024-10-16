class Transporte {
    int id_trasnporte;
    String tipo;
    /* String matricula;
     * String nom_conductor;
     * int entregado;
     */
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
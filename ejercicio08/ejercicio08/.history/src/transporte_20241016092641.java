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
     
     public void setTTipo(String tipo) {
        this.tipo = tipo;
    }
}
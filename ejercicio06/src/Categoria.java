class Categoria {
    int id;
    String categoria;

    public Categoria(int id, String categoria) {
        this.id = id;
        this.categoria = categoria;
    }

    public String toString() {
        return categoria;
    }
    public String getCategoria() {
        return categoria;
    }
    
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}

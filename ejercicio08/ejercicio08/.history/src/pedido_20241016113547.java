class Pedido {
    private int n_pedido;
    private String d_entrega;
    private Transporte tipo;

    public Pedido(int n_pedido, String d_entrega, Transporte tipo) {
        this.n_pedido = n_pedido;
        this.d_entrega = d_entrega;
        this.tipo = tipo;
    }
    // GETTERS

    public String getDpedido() {//dia pedido
        return this.d_entrega;
    }
    public Transporte getTipo() {//tipo
        return this.tipo;
    }
    public int getNpedido() {// numero de pedido
        return this.n_pedido;
    }


    // SETTERS
    public void setDpedido(String d_pedido) {
        this.d_entrega = d_pedido;
    }
    public void setNpedido(int n_pedido) {
        this.n_pedido = n_pedido;
    }
    public void setTipo(Transporte tipo) {
        this.tipo = tipo;
    }
}
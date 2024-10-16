class Pedido {
    int n_pedido;
    String d_entrega;
    Transporte tipo;

    public Pedido(int n_pedido, String d_entrega, Transporte tipo) {
        this.n_pedido = n_pedido;
        this.d_entrega = d_entrega;
        this.tipo = tipo;
    }
    public String toString() {
       // return "el pedido "+n_pedido+" tiene prevista la entrega el "+d_entrega+"\n se entregara en "+tipo;
    }
    // GETTERS

    public String getDpedido() {//dia pedido
        return this.d_pedido;
    }   
    public String getNpedido() {// numero de pedido
        return this.n_pedido;
    }   
    public String getTipo() {
        return this.tipo;
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
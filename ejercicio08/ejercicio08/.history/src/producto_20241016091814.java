class Producto {
    int id_producto;
    String producto;
    int precio;
    Pedido n_pedido;
    Transporte tipo;
    Pedido d_pedido;

    public Producto(int id_producto, String producto, int precio, Pedido n_pedido, Transporte tipo, Pedido d_pedido) {
        this.id_producto = id_producto;
        this.producto = producto;
    }


    public void setDpedido(Pedido d_pedido) {
        this.d_pedido = d_pedido;
    }
    public void setNpedido(Pedido n_pedido) {
        this.n_pn_pedido = n_pedido;
    }
    public void setTipo(Transporte tipo) {
        this.tipo = tipo;
    }

}
class Producto {
    int id_producto;
    String producto;
    int precio;
    Pedido n_pedido;
    Pedido tipo;
    Pedido d_pedido;

    public Producto(int id_producto, String producto, int precio, Pedido n_pedido, Pedido tipo, Pedido d_pedido) {
        this.id_producto = id_producto;
        this.producto = producto;
        this.precio = precio;
        this.n_pedido = n_pedido;
        this.tipo = tipo;
        this.d_pedido = d_pedido;
    }
    public String toString() {
        return "El producto "+id_producto+" en le pedido "+n_pedido+"\n "+producto+"--------"+precio+" €\n Sera enviado en "+tipo+" con una entrega prevista el "+d_pedido;
    }


    public void setDpedido(Pedido d_pedido) {
        this.d_pedido = d_pedido;
    }
    public void setNpedido(Pedido n_pedido) {
        this.n_pn_pedido = n_pedido;
    }
    public void setTipo(Pedido tipo) {
        this.tipo = tipo;
    }

}
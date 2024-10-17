class Producto {
    int id_producto;
    String producto;
    int precio;
    Pedido pedido;

    public Producto(int id_producto, String producto, int precio, Pedido pedido) {
        this.id_producto = id_producto;
        this.producto = producto;
        this.precio = precio;
        this.pedido = pedido;
    }
    public String toString() {
        return "El producto "+id_producto+" en le pedido "+pedido.getNpedido()+"\n "
                +producto+"--------"+precio+" €\n Sera enviado en "
                +pedido.getTipo().getTipo()+" con una entrega prevista el "+pedido.getDpedido();
    }

    // SETTERS
    public void setDpedido(String d_entrega) {
        this.pedido.setDpedido(d_entrega);
    }

    public void setNpedido(int n_pedido) {
        this.pedido.setNpedido(n_pedido);
    }

    public void setTipo(Transporte transporte) {
        this.pedido.setTipo(transporte);
    }

}
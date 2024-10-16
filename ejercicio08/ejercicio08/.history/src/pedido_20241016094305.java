import javax.net.ssl.TrustManagerFactorySpi;

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
        return "";
    }
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
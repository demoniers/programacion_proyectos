class Pedido {
    int n_pedido;
    String d_entrega;
    Transporte transporte;

    public Pedido(int n_pedido, String d_entrega, Transporte transporte) {
        this.n_pedido = n_pedido;
        this.d_entrega = d_entrega;
        this.transporte = transporte;
    }

    // GETTERS

    public String getDpedido() {//dia pedido
        return this.d_entrega;
    }
    public Transporte getTipo() { // tipo de transporte
        return this.transporte;
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

    public void setTipo(Transporte transporte) {
        this.transporte = transporte;
    }
}/*
class Pedido {
    int n_pedido;
    String d_entrega;
    Transporte transporte;

    public Pedido(int n_pedido, String d_entrega, Transporte transporte) {
        this.n_pedido = n_pedido;
        this.d_entrega = d_entrega;
        this.transporte = transporte;
    }

    // GETTERS
    public String getDpedido() { // día pedido
        return this.d_entrega;
    }

    public Transporte getTipo() { // tipo de transporte
        return this.transporte;
    }

    public int getNpedido() { // número de pedido
        return this.n_pedido;
    }

    // SETTERS
    public void setDpedido(String d_pedido) {
        this.d_entrega = d_pedido;
    }

    public void setNpedido(int n_pedido) {
        this.n_pedido = n_pedido;
    }

    public void setTipo(Transporte transporte) {
        this.transporte = transporte;
    }

     public String toString() {
        return n_pedido + d_entrega + transporte.getTipo();
    } 
}
*/
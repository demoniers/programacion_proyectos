import java.util.List;
import java.util.ArrayList;

public class Order {
    private String deliveryDate;
    private List<Product> productList;
    private Transport transport;

    // constructor
    public Order(String deliveryDate, Product product, Transport transport){
        this.deliveryDate = deliveryDate;
        // Creamos la lista de productos
        this.productList = new ArrayList<Product>();
        // Añadimos un producto a la lista
        this.productList.add(product);
        //
        this.transport = transport;
    }

    public void setTransporte(Transport transport) {
        this.transport = transport;
    }

    // AÑADIR A LISTA
    public void setNewProduct(Product product) {
        this.productList.add(product);
    }

    // toString
    public String toString() {
        String result = "El pedido llegara en fecha " + this.deliveryDate
            + " en el transporte " + this.transport.getType();

        // Recorremos la lista de productos desde la posición inicial 0 hasta el tamaño de la lista menos uno
        for(int i = 0; i < this.productList.size(); i++) {
            // Obtenemos el producto en la posición "i"
            Product product = this.productList.get(i);
            // Añadimos al resultado el producto en una nueva linea ("\n")
            result = result + "\n  - " + product.toStringForOrder();
        }
        return result;
    }
}
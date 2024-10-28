import java.util.List;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        // PRECIOS
        Price price = new Price(199);
        Price price2 = new Price(99);
        
        // PRODUCTOS
        Product product = new Product("keyboard", price);
        Product product2 = new Product("Mouse", price2);
        Product product3 = new Product("Altavoz", price2);
        
        // TRANSPORTES
        Transport transport = new Transport("van");
        Transport dron = new Transport("dron");
        Transport plane = new Transport("plane");
        Transport helicopter = new Transport("helicopter");
        Transport moto = new Transport("moto");

        // ORDER
        Order order = new Order("10/08/2456", product, transport);
       // System.out.println(newTransport);
        
       // AÑADIR A LISTA
       // order.setTransporte(newTransport);
       order.setNewProduct(product2);
       order.setNewProduct(product3);

       // IMPRIMIR
       System.out.println(order);

    }
}

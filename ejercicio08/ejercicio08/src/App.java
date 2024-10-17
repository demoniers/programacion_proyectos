public class App {
    public static void main(String[] args) throws Exception {
        Transporte camion = new Transporte(01,"Camion");
        Pedido pedido001 = new Pedido(001,"10-11-2024",camion);
        Producto caja = new Producto(01,"Caja de zapatos",5,pedido001);
 //     System.out.print(pedido001.toString());
        System.out.printf("%s",caja);
    }
}
/*
public class App
 {
    public static void main(String[] args) {
        Transporte camion = new Transporte(1, "Camion");
        Pedido pedido001 = new Pedido(1, "10-11-2024", camion);
        Producto caja = new Producto(1, "Caja de zapatos", 5, pedido001);

        // Imprime la información del producto
        System.out.println(caja.toString());
    }
}*/

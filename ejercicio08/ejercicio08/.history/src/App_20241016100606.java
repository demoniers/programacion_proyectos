public class App {
    public static void main(String[] args) throws Exception {
        Transporte camion = new Transporte(01,"Camion");
        Pedido pedido001 = new Pedido(001,"10-11-2024",camion);
        Producto caja = new Producto(01,"Caja de zapatos",5,pedido001,pedido001,pedido001);

        System.out.printf("%s",caja);
    }
}

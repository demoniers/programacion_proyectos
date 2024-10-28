public class App {
    public static void main(String[] args) throws Exception {
        int num1 = 1;
        int num2 = 5;
        controlif(num1, num2);
        controlswitch(num1, num2);
        controlTernario(num1, num2);
    }
    public static void controlif(int num1, int num2) {
        System.out.printf("IF\n");
        if (num1 < num2) {
            System.out.print("es menor");
        } else if (num1 > num2) {
            System.out.print("es mayor");
        } else {
            System.out.print("no existe");
        }
        System.out.printf("\n");
    }
    public static void controlswitch(int num1, int num2) {
        System.out.printf(" SWITCH:\n");
        switch (Integer.signum(num1 - num2)) {
            case 1:
                System.out.println("es mayor");
                break;
            case 0:
                System.out.println("es igual");
                break;
            case -1:
                System.out.println("es menor");
                break;
            default:
                break;
        }
        System.out.printf("\n");
        
    }
    public static void controlTernario(int num1, int num2) {
        System.out.printf(" Ternario:\n");
        String decision;
        decision = (num1 < num2) ? "Es menor" : "Es mayor";
        System.out.println(decision);
        System.out.printf("\n");
        
    }
}
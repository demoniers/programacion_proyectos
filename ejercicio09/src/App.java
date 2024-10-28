public class App {
    public static void main(String[] args) throws Exception {
        int max = 7;
        int min = -2;
        loopfor(max, min);
    }
    public static void loopfor(int max, int min) {
        for (int i = -2; i < max; i++) {
           System.out.println(i);
        }
    }
     /* 
        System.out.print("FOR\n");
       
        System.out.println("\n WHILE");
        while (min < 7) {
            System.out.println(min);
            min++;
        }
        System.out.println("\n DO WHILE");
        int i = -2;
        do {
            System.out.println(i);
            i++;
        } 
        while (i < 7);
        System.out.println("\n");
    */
}

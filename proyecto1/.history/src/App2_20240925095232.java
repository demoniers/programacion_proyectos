import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
		Scanner text = new Scanner(System.in);
		System.out.printf("Introuce tu nombre:%n");
		char nombre = text.nextLine();
		System.out.printf("Bienvenido %s !", nombre);

    }
}

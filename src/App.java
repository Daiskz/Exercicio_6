import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int raio;
        double pi = 3.14, área;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Digite o raio do círculo: ");
            raio = sc.nextInt();
        }
        área = pi * raio * raio;
        System.out.println("A área do círculo é: " + área);
    }
}

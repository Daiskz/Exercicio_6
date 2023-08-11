import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int raio;
        double pi = 3.14, área;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o raio do círculo: ");
        raio = entrada.nextInt();
        área = pi * raio * raio;
        System.out.println("A área do círculo é: " + área);
        entrada.close();
    }
}

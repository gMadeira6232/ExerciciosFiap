import java.util.Scanner;

public class DezenaNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int valor = sc.nextInt();

        System.out.println("A dezena do seu numero e: " + (valor / 10) % 10);

        sc.close();
    }
}

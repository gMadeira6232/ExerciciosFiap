import java.util.Scanner;

public class DezenaNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int valor = sc.nextInt();

        if (valor > 999 || valor < 99) {
            System.out.println("Favor inserir um numero de 3 digitos");
        } else {
            System.out.println("A dezena do seu numero e: " + (valor / 10) % 10);
        }

        sc.close();
    }
}

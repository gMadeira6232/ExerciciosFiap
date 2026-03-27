import java.util.Scanner;

public class InverterValor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor, valorInvertido;

        System.out.println("Digite um numero: ");
        valor = sc.nextInt();

        valorInvertido = inversorDeValor(valor);

        System.out.println("Seu valor invertido e: " + valorInvertido);

        sc.close();
    }
    public static int inversorDeValor (int valor) {
        int u = valor % 10;
        int d = (valor / 10) % 10;
        int c = valor / 100;
        return (u * 100) + (d * 10) + c;
    }
}

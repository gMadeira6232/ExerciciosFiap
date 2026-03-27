import java.util.Scanner;

public class InverterValor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor, unidade, dezena, centena, valorInvertido;

        System.out.println("Digite um numero: ");
        valor = sc.nextInt();

        unidade = valor % 10;
        dezena = (valor / 10) % 10;
        centena = valor / 100;
        valorInvertido = (unidade *100) + (dezena * 10) + centena;

        System.out.println("Seu valor invertido e: " + valorInvertido);

        sc.close();
    }
}

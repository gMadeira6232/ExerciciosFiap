import java.util.Scanner;

public class Expressao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x, y;

        System.out.println("Digite o valor de X: ");
        x = sc.nextDouble();

        y = Math.pow(x - 0.5, 1.0 / 6.0);
        System.out.printf("Valor de Y: %.3f", y);
    }
}

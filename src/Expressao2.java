import java.util.Scanner;

public class Expressao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x, y, xQuadrado, termoCentral;

        System.out.println("Digite o valor de X: ");
        x = sc.nextDouble();

        if (x == 0) {
            System.out.println("0 nao e um valor valido, favor escolher outro valor");
        } else {
            xQuadrado = x * x;

            termoCentral = (xQuadrado * xQuadrado - 1) / (xQuadrado * 2);

            y = Math.sqrt(termoCentral * termoCentral + 1) - (xQuadrado / 2.0);

            System.out.printf("Valor de Y: %.3f", y);
        }
        sc.close();
    }
}
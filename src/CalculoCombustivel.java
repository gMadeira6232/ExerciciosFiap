import java.util.Scanner;

public class CalculoCombustivel {
    public static void main(String[] args) {
        int tempo;
        double velocidade, distancia, consumo;
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o tempo da viagem (horas): ");
        tempo = sc.nextInt();

        System.out.println("Informe a velocidade media (km/h): ");
        velocidade = sc.nextDouble();

        sc.close();

        distancia = calculadoraDistancia(velocidade, tempo);
        consumo = calculadoraConsumo(distancia);

        System.out.println("A quantidade de combustível gasta sera de: " + consumo + " Litros");
    }

    // METODO 1
    public static double calculadoraDistancia(double velocidade, int tempo) {
        return velocidade * tempo;
    }

    // METODO 2
    public static double calculadoraConsumo(double distancia) {
        return distancia / 10.5;
    }
}
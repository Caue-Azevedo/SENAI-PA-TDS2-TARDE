import java.util.Scanner;

public class ExercicioQuatro {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double valorEmDolares, real;


        System.out.println("Digite, em dólares, o valor a ser convertido: ");
        valorEmDolares = scan.nextDouble();

        real = valorEmDolares * 4.94;

        System.out.printf("O valor em reais é: %.2f", real);

        scan.close();

    }
}

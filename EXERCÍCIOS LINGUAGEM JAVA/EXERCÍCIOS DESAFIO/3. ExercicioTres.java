import java.util.Scanner;

public class ExercicioTres {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double precoProduto, total;
        int quantidade;

        System.out.print("Digite o preço do produto desejado: ");
        precoProduto = scan.nextDouble();

        System.out.print("Por fim, digite a quantidade desejada: ");
        quantidade = scan.nextInt();

        total = precoProduto * quantidade;

        System.out.println("O preço a ser pago é: " + total);

        scan.close();
    }
}

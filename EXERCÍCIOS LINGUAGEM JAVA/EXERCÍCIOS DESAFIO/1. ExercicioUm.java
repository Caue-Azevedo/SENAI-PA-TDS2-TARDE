import java.util.Scanner;

public class ExercicioUm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float nota1, nota2, media;

        System.out.print("Digite a primeira nota: ");
        nota1 = scan.nextFloat();
        System.out.print("Digite a segunda nota: ");
        nota2 = scan.nextFloat();

        media = (nota1 + nota2) / 2;

        System.out.println("A média das notas é: " + media);

        scan.close();
    }
}

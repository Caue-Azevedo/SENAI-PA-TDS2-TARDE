import java.util.Scanner;

public class ExercicioUm {
    public static void lerNome() {
        Scanner scan = new Scanner(System.in);

        System.out.println("|=============================|");
        System.out.print("| Digite seu nome: ");
        String nome = scan.nextLine();
        System.out.println("|==============================|");
        System.out.print("\n\n\n\n");
        System.out.println("|==============================|");
        System.out.println("| Seu nome é: " + nome );
        System.out.println("|==============================|");
    }

    public static void main(String[] args) {
        lerNome();
    }
}

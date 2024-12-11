import java.util.Scanner;

public class ExercicioDois {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char a;
        String b;

        System.out.print("Digite seu caractere: ");
        a = scan.next().charAt(0);

        System.out.print("Digite sua palavra: ");
        scan.nextLine();
        b = scan.nextLine();

        System.out.println("Sua concatenação é: " + a + b);

        scan.close();
    }
}

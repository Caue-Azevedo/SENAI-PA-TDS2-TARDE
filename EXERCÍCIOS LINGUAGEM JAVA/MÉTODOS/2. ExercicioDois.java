import java.util.Scanner;

public class ExercicioDois {
    public static float multiplicador() {
        Scanner scan = new Scanner(System.in);

        System.out.println("|=============================|");
        System.out.print("| Digite um número: ");
        float num = scan.nextFloat();
        System.out.println("|==============================|");
        System.out.print("\n\n\n\n");

        return num * 10;
    }

    public static void main(String[] args) {
        float resultado = multiplicador();
        System.out.println("|==============================|");
        System.out.println("| Número retornado: " + resultado);
        System.out.println("|==============================|");
    }
}

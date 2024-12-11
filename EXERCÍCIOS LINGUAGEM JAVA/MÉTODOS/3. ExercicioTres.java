import java.util.Scanner;

public class ExercicioTres {
    public static float somador(float num1, float num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("|=============================|");
        System.out.print("| Digite o primeiro número: ");
        float num1 = scan.nextFloat();
        System.out.print("| Digite o segundo número: ");
        float num2 = scan.nextFloat();
        System.out.println("|==============================|");
        System.out.print("\n\n\n\n");

        float resultado = somador(num1, num2);
        System.out.println("|==============================|");
        System.out.println("| Números somados: " + resultado);
        System.out.println("|==============================|");
        
        scan.close();
    }
}

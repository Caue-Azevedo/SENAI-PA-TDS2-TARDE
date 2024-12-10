package exercicioPOO;

import java.util.Scanner;

public class ExercicioUm_Calculadora {
    // - Método 'dobrar' para dobrar o número - //
    public static void dobrar(float numero) {
        numero = numero * 2;
        System.out.println("O dobro é " + numero);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float numero;

        System.out.println("Digite o número a ser dobrado: ");
        numero = scan.nextFloat();

        // - Chama o método 'dobrar' - //
        dobrar(numero);
    }
}

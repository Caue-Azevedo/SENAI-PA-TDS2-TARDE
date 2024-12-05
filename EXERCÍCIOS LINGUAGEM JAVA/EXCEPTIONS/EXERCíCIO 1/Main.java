package com.senai;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // = Criação do scanner e objeto para realizar cálculos = //
        Scanner scan = new Scanner(System.in);
        Calculo calc = new Calculo();

        try {
            // = Exibindo mensagem e lendo os números = //
            System.out.println("|============================================|");
            System.out.println("| Insira o primeiro número:                  |");
            System.out.println("|--------------------------------------------|");
            System.out.printf("| ");
            float num1 = scan.nextFloat();

            System.out.println("|--------------------------------------------|");
            System.out.println("| Insira o segundo número:                   |");
            System.out.printf("| ");
            float num2 = scan.nextFloat();


            // = Verificação se o segundo número é zero = //
            if (num2 == 0) {
                System.out.println("\n\n|============================================|");
                System.out.println("|                >>Erro<<                    |");
                System.out.println("|--------------------------------------------|");
                System.out.println("|      O segundo número não pode ser 0.      |");
                System.out.println("|      Tente novamente com outro número.     |");
                System.out.println("|============================================|");

            } else {
                // = Realizando e exibindo a divisão = //
                System.out.println("\n\n\n|============================================|");
                System.out.println("|           Sua divisão deu: " + calc.divisao(num1, num2));
                System.out.println("|--------------------------------------------|");
            }

        } catch (Exception e) {
            // = Tratamento de exceção = //
            System.out.println("|============================================|");
            System.out.println("| Erro inesperado: " + e.getMessage() + "    |");
            System.out.println("|--------------------------------------------|");
        } finally {
            // = Finalizando o programa = //
            System.out.println("\n|============================================|");
            System.out.println("|            >>Execução encerrada<<          |");
            System.out.println("|        Muito obrigado pelapreferência.     |");
            System.out.println("|============================================|");
            scan.close();
        }
    }
}

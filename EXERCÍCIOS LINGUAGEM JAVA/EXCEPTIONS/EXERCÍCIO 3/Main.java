package com.senai;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // = Criação do scanner e objeto para realizar cálculos = //
        Scanner scan = new Scanner(System.in);
        Calculo calc = new Calculo();

        try {
            // = Coleta de dados = //
            System.out.println("|============================================|");
            System.out.println("| Insira o primeiro valor:                   |");
            System.out.println("|--------------------------------------------|");
            System.out.printf("| ");
            String val1 = scan.nextLine();
            System.out.println("|--------------------------------------------|");
            System.out.println("| Insira o segundo valor:                    |");
            System.out.println("|--------------------------------------------|");
            System.out.printf("| ");
            String val2 = scan.nextLine();
            System.out.println("|============================================|");

            // = Convertendo os valores para float = //
            float val1Float = Float.parseFloat(val1);
            float val2Float = Float.parseFloat(val2);

            // = Verificar se o número é zero = //
            if (val2Float == 0) {
                System.out.println("\n\n|============================================|");
                System.out.println("|                 >>Erro<<                   |");
                System.out.println("|    O segundo número não pode ser zero!     |");
                throw new ArithmeticException("   Divisão por zero não é permitida.");
            } else {
                System.out.println("| A divisão deu: " + calc.divisao(val1Float, val2Float));
                System.out.println("|============================================|");
            }

        } catch (NumberFormatException e) {
            // = Tratamento de exceção para dados não numéricos = //
            System.out.println("|==============================================|");
            System.out.println("|        >>Erro! - Valor não numérico<<        |");
            System.out.println("| " + e.getMessage());
            System.out.println("|============================================|");
        } catch (ArithmeticException e) {
            // = Tratamento de exceção para erro de divisão por zero = //
            System.out.println("|============================================|");
            System.out.println("|        >>Erro<< - Divisão inválida         |");
            System.out.println("| " + e.getMessage() + "       |");
            System.out.println("|============================================|");
        } finally {
            // = Finalizando o programa = //
            System.out.println("\n\n|============================================|");
            System.out.println("|           >>Execução encerrada<<           |");
            System.out.println("|       Muito obrigado pela preferência.     |");
            System.out.println("|============================================|");
            scan.close();
        }
    }
}

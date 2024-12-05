package com.senai;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // = Criação do scanner e objeto para realizar cálculos = //
        Scanner scan = new Scanner(System.in);

        try {
            // = Coleta de dados = //
            System.out.println("|============================================|");
            System.out.println("| Insira um número:                          |");
            System.out.println("|--------------------------------------------|");
            System.out.printf("| ");
            float num1 = scan.nextFloat();
            System.out.println("|============================================|");


            // = Verificar se o número é negativo = //
            if (num1 < 0) {
                System.out.println("\n\n|============================================|");
                System.out.println("|                 >>Erro<<                   |");
                throw new NegativeNumberException("|  Número negativo inserido: " + num1);
            } else {
                System.out.println("|   -- Número inserido: " + num1 + " --3" +
                        " (Válido!) -- ");
                System.out.println("|============================================|");
            }

        } catch (NegativeNumberException e) {
            // = Tratamento personalizado da exceção = //
            System.out.println(e.getMessage());
            System.out.println("|============================================|");
        } catch (Exception e) {
            // = Tratamento caso ocorra outro erro) = //
            System.out.println("|============================================|");
            System.out.println("| Erro inesperado: " + e.getMessage() + "    |");
            System.out.println("|--------------------------------------------|");
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

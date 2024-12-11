package com.senai.FormaGeometrica;

import java.util.Scanner;

public class Sistema {

    public static void limparTela() {
        System.out.print("\n\n\n\n\n\n\n");
    }

    public void menuInicial() {
        Scanner scan = new Scanner(System.in);
        Circulo circ = new Circulo();
        Retangulo ret = new Retangulo();

        int escolha;
        int escolha2 = 0;

        do {
            System.out.println("\n\n|============================================|");
            System.out.println("| Qual forma geométrica deseja utilizar?:    |");
            System.out.println("| 1) Retângulo                               |");
            System.out.println("| 2) Círculo                                 |");
            System.out.println("| 3) Sair                                    |");
            System.out.println("|============================================|");
            System.out.print("| Sua escolha: ");
            escolha = scan.nextInt();

            switch (escolha) {
                case 1:
                    do {
                        System.out.println("|====================================================|");
                        System.out.println("| Você escolheu o retângulo, o que deseja calcular?: |");
                        System.out.println("| 1) Perimetro                                       |");
                        System.out.println("| 2) Área                                            |");
                        System.out.println("| 3) Sair                                            |");
                        System.out.println("|--------------======================================|");
                        System.out.print("| Sua escolha: ");
                        escolha2 = scan.nextInt();

                        switch (escolha2) {
                            case 1:
                                System.out.println("\n\n\n=====================================================|");
                                System.out.println("| Você escolheu calcular o perímetro do retângulo.    |");
                                System.out.print("|  Insira o valor da base: ");
                                ret.base = scan.nextFloat();
                                System.out.print("|  Insira o valor da altura: ");
                                ret.altura = scan.nextFloat();
                                ret.calculoPerimetro(ret.base, ret.altura);
                                System.out.println("|----------------------------------------------------|");
                                System.out.println("|   Perímetro do retângulo: " + ret.perimetro);
                                System.out.println("|====================================================|");
                                break;
                            case 2:
                                System.out.println("\n\n\n|================================================|");
                                System.out.println("| Você escolheu calcular a área do retângulo.   |");
                                System.out.print("|  Insira o valor da base: ");
                                ret.base = scan.nextFloat();
                                System.out.print("|  Insira o valor da altura: ");
                                ret.altura = scan.nextFloat();
                                ret.calculoArea(ret.base, ret.altura);
                                System.out.println("|----------------------------------------------------|");
                                System.out.println("|           Área do retângulo: " + ret.area);
                                System.out.println("|====================================================|");
                                break;
                            case 3:
                                System.out.println("Voltando ao menu principal...");
                                limparTela();
                                break;
                            default:
                                System.out.println("Opção inválida. Tente novamente.");
                                limparTela();
                                break;
                        }
                    } while (escolha2 != 3);
                    break;

                case 2:
                    do {
                        System.out.println("|====================================================|");
                        System.out.println("| Você escolheu o círculo, o que deseja calcular?:  |");
                        System.out.println("| 1) Perímetro                                       |");
                        System.out.println("| 2) Área                                            |");
                        System.out.println("| 3) Sair                                            |");
                        System.out.println("|--------------======================================|");
                        System.out.print("| Sua escolha: ");
                        escolha2 = scan.nextInt();

                        switch (escolha2) {
                            case 1:
                                System.out.println("\n\n\n=====================================================|");
                                System.out.println("| Você escolheu calcular o perímetro do círculo.    |");
                                System.out.print("|  Insira o valor do raio: ");
                                circ.raio = scan.nextFloat();
                                circ.calculoPerimetro(circ.raio);
                                System.out.println("|----------------------------------------------------|");
                                System.out.println("|   Perímetro do círculo: " + circ.perimetro);
                                System.out.println("|====================================================|");
                                break;
                            case 2:
                                System.out.println("\n\n\n|================================================|");
                                System.out.println("| Você escolheu calcular a área do círculo.     |");
                                System.out.print("|  Insira o valor do raio: ");
                                circ.raio = scan.nextFloat();
                                circ.calculoArea(circ.raio);
                                System.out.println("|----------------------------------------------------|");
                                System.out.println("|           Área do círculo: " + circ.area);
                                System.out.println("|====================================================|");
                                break;
                            case 3:
                                System.out.println("Voltando ao menu principal...");
                                limparTela();
                                break;
                            default:
                                System.out.println("Opção inválida. Tente novamente.");
                                limparTela();
                                break;
                        }
                    } while (escolha2 != 3);
                    break;

                case 3:
                    System.out.println("Saindo...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (escolha != 3);
    }

    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        sistema.menuInicial();
    }
}

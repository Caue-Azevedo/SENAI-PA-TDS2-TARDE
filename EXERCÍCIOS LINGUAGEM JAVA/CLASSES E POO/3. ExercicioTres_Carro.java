import java.util.Scanner;


public class ExercicioTres_Carro {
   String modelo;
   int ano;
   String cor;


   public void exibirFicha() {
       System.out.println("\n\n\n\n\n\n|============================== FICHA TÉCNICA DO CARRO ==============================|");
       System.out.println("| Modelo:  " + modelo);
       System.out.println("| Ano de Fabricação: " + ano);
       System.out.println("| Cor: " + cor);
       System.out.println("| Idade do Carro: " + calcularIdade() + " anos");
       System.out.println("|=====================================================================================|");
   }


   public int calcularIdade() {
       int anoAtual = 2024;
       return anoAtual - ano;
   }


   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       ExercicioTres_Carro carro = new ExercicioTres_Carro();


       System.out.print("Digite o modelo do carro: ");
       carro.modelo = scanner.nextLine();


       System.out.print("Digite o ano de fabricação do carro: ");
       carro.ano = scanner.nextInt();
       scanner.nextLine();


       System.out.print("Digite a cor do carro: ");
       carro.cor = scanner.nextLine();


       carro.exibirFicha();
   }
}


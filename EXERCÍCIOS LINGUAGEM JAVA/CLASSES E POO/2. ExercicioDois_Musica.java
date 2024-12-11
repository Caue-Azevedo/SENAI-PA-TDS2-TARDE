import java.util.Scanner;


public class ExercicioDois_Musica {
   String titulo;
   String artista;
   int anoLancamento;
   double avaliacao;
   int numAvaliacoes;


   public void exibirFicha() {
       System.out.println("\n\n\n\n\n\n|============================== FICHA TÉCNICA DA MÚSICA ==============================|");
       System.out.println("| Título:  " + titulo);
       System.out.println("| Artista: " + artista);
       System.out.println("| Ano de Lançamento: " + anoLancamento);
       System.out.println("| Número de Avaliações: " + numAvaliacoes);
       System.out.println("| Média das Avaliações: " + calcularMedia());
       System.out.println("|=====================================================================================|");
   }


   public void avaliar(double nota) {
       avaliacao += nota;
       numAvaliacoes++;
   }


   public double calcularMedia() {
       if (numAvaliacoes > 0) {
           return avaliacao / numAvaliacoes;
       } else {
           return 0;
       }
   }


   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       ExercicioDois_Musica musica = new ExercicioDois_Musica();


       System.out.print("Digite o título da música: ");
       musica.titulo = scanner.nextLine();


       System.out.print("Digite o nome do artista: ");
       musica.artista = scanner.nextLine();


       System.out.print("Digite o ano de lançamento da música: ");
       musica.anoLancamento = scanner.nextInt();
       scanner.nextLine();


       System.out.print("\nQuantas avaliações deseja fazer? ");
       int numAvaliacoes = scanner.nextInt();


       for (int i = 1; i <= numAvaliacoes; i++) {
           double nota;
           do {
               System.out.println("Digite a nota da avaliação " + i + " (máximo 100): ");
               nota = scanner.nextDouble();
               if (nota > 100 || nota < 0) {
                   System.out.println("\nNota inválida! A nota deve estar entre 0 e 100. Tente novamente.\n");
               }
           } while (nota > 100 || nota < 0);


           musica.avaliar(nota);
       }


       musica.exibirFicha();
   }
}


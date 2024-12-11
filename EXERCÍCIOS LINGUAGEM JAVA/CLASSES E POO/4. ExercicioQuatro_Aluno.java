public class ExercicioQuatro_Aluno {
   String nome;
   int idade;


   public void exibirInformacoes() {
       System.out.println("\n\n\n\n\n\n|============================== INFORMAÇÕES DO ALUNO ==============================|");
       System.out.println("| Nome:  " + nome);
       System.out.println("| Idade: " + idade);
       System.out.println("|===================================================================================|");
   }


   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       ExercicioQuatro_Aluno aluno = new ExercicioQuatro_Aluno();


       System.out.print("Digite o nome do aluno: ");
       aluno.nome = scanner.nextLine();


       System.out.print("Digite a idade do aluno: ");
       aluno.idade = scanner.nextInt();


       aluno.exibirInformacoes();
   }
}


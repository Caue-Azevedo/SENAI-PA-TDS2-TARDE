import java.util.Scanner;

public class Sistema {
    public static void limparTela() {
        System.out.print("\n\n\n\n\n\n\n");
    }

    public static void adquirirCartao(CartaoCredito cartao) {
        Scanner scan = new Scanner(System.in);
        limparTela();
        System.out.println("|================================================|");
        System.out.print("| Insira a numeração do cartão: ");
        cartao.setNumeracao(scan.nextLine());
        System.out.print("| Insira a data de validade do cartão: ");
        cartao.setDataValidade(scan.nextLine());
        System.out.print("| Insira o código de verificação do cartão: ");
        cartao.setCodigoVerificacao(scan.nextInt());

        limparTela();
        limparTela();
        System.out.println("|================================================|");
        System.out.println("|   >Cartão de Crédito adquirido com sucesso!<   |");
        cartao.exibirCartao();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Cliente cli = new Cliente();
        CartaoCredito cc = new CartaoCredito();

        System.out.println("|==============================================|");
        System.out.println("|  >Seja bem-vindo(a) ao sistema de cadastro<  |");
        System.out.println("|----------------------------------------------|");
        System.out.print("| Insira seu nome: ");
        cli.setNome(scan.nextLine());
        System.out.print("| Insira seu código: ");
        cli.setCodigo(scan.nextInt());
        System.out.println("|==============================================|");
        limparTela();
        limparTela();

        System.out.println("|================================================|");
        System.out.println("|          >Seja bem-vindo(a) " + cli.getNome() + "<");
        System.out.println("|------------------------------------------------|");
        System.out.print("| Deseja adquirir um cartão de crédito? (S/N): ");
        char opcao = scan.next().charAt(0);
        System.out.println("|================================================|");
        limparTela();

        if (opcao == 'S' || opcao == 's') {
            adquirirCartao(cc);
        } else if (opcao == 'N' || opcao == 'n') {
            System.out.println("Voltando à tela inicial.");
        } else {
            System.out.println("Opção inválida.");
        }
    }
}

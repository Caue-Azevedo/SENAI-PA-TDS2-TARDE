import java.util.Scanner;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Produto() {
        this.nome = "Desconhecido";
        this.preco = 0.0;
        this.quantidade = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("|============================================|");
        System.out.print("| Digite o nome do produto: ");
        String nome = scan.nextLine();

        System.out.print("| Digite o preço do produto: ");
        double preco = scan.nextDouble();

        System.out.print("| Digite a quantidade do produto: ");
        int quantidade = scan.nextInt();


        Produto produto = new Produto(nome, preco, quantidade);

        System.out.println("\n\n\n|============================================|");
        System.out.println("| Produto: " + produto.getNome() + "\n| Preço: " + produto.getPreco() + "\n| Quantidade: " + produto.getQuantidade());
        System.out.println("|============================================|");

        scan.close();
    }
}

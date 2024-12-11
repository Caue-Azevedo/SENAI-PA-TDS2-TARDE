import java.util.Scanner;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private boolean disponibilidade;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public boolean getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public Livro(String titulo, String autor, int anoPublicacao, boolean disponibilidade) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.disponibilidade = disponibilidade;
    }

    public Livro() {
        this.titulo = "";
        this.autor = "";
        this.anoPublicacao = 0;
        this.disponibilidade = true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("|============================================|");
        System.out.print("| Digite o título do livro: ");
        String titulo = scan.nextLine();

        System.out.print("| Digite o autor do livro: ");
        String autor = scan.nextLine();

        System.out.print("| Digite o ano de publicação: ");
        int anoPublicacao = scan.nextInt();

        System.out.print("| O livro está disponível? (true/false): ");
        boolean disponibilidade = scan.nextBoolean();

        Livro livro = new Livro(titulo, autor, anoPublicacao, disponibilidade);

        System.out.println("\n|============================================|");
        System.out.println("| Detalhes do Livro:");
        System.out.println("| Título: " + livro.getTitulo());
        System.out.println("| Autor: " + livro.getAutor());
        System.out.println("| Ano de Publicação: " + livro.getAnoPublicacao());

        String disponibilidadeTexto;
        if (livro.getDisponibilidade()) {
            disponibilidadeTexto = "Sim";
        } else {
            disponibilidadeTexto = "Não";
        }

        System.out.println("| Disponibilidade: " + disponibilidadeTexto);
        System.out.println("|============================================|");

        scan.close();
    }
}

import java.util.Scanner;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private int velocidade;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = 0;
    }

    public Carro() {
        this.marca = "";
        this.modelo = "";
        this.ano = 0;
        this.velocidade = 0;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        if (velocidade > 0) {
            this.velocidade = velocidade;
        }
    }

    public void acelerar(int incremento) {
        if (incremento > 0) {
            this.velocidade += incremento;
        }
    }

    public void frear(int decremento) {
        if (decremento > 0) {
            this.velocidade -= decremento;
            if (this.velocidade < 0) {
                this.velocidade = 0;
            }
        }
    }

    public void exibirInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Velocidade: " + velocidade);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a marca do carro: ");
        String marca = scanner.nextLine();

        System.out.print("Digite o modelo do carro: ");
        String modelo = scanner.nextLine();

        System.out.print("Digite o ano do carro: ");
        int ano = scanner.nextInt();

        Carro carro = new Carro(marca, modelo, ano);

        System.out.print("Digite a velocidade inicial: ");
        int velocidadeInicial = scanner.nextInt();
        carro.setVelocidade(velocidadeInicial);

        carro.acelerar(50);
        carro.frear(20);
        carro.exibirInfo();

        scanner.close();
    }
}

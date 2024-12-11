class Carro {
    private String nomeModelo;
    private double[] precoAnual = new double[3];

    public void definirModelo(String nome) {
        this.nomeModelo = nome;
    }

    public void definirPrecos(double precoAno1, double precoAno2, double precoAno3) {
        this.precoAnual[0] = precoAno1;
        this.precoAnual[1] = precoAno2;
        this.precoAnual[2] = precoAno3;
    }

    public void exibirPrecoMaiorEMenor() {
        double menorPreco = precoAnual[0], maiorPreco = precoAnual[0];
        for (double preco : precoAnual) {
            if (preco < menorPreco) menorPreco = preco;
            if (preco > maiorPreco) maiorPreco = preco;
        }
        System.out.println("Menor preço: R$" + menorPreco);
        System.out.println("Maior preço: R$" + maiorPreco);
    }

    public String getNomeModelo() {
        return nomeModelo;
    }
}

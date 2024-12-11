class ModeloCarro extends Carro {
    private String nomeModelo;

    public ModeloCarro(String nome) {
        definirModelo(nome);
        this.nomeModelo = nome;
    }

    public void mostrarInformacoes() {
        System.out.println("Modelo do carro: " + getNomeModelo());
    }
}

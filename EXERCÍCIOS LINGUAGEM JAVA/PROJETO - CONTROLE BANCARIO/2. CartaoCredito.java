class CartaoCredito extends Cliente {
    private String numeracao;
    private String dataValidade;
    private int codigoVerificacao;

    public String getNumeracao() {
        return numeracao;
    }

    public void setNumeracao(String numeracao) {
        this.numeracao = numeracao;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public int getCodigoVerificacao() {
        return codigoVerificacao;
    }

    public void setCodigoVerificacao(int codigoVerificacao) {
        this.codigoVerificacao = codigoVerificacao;
    }

    // Método para exibir os dados do cartão de crédito
    public void exibirCartao() {
        System.out.println("|------------------------------------------------|");
        System.out.println("| Numeração do Cartão: " + numeracao);
        System.out.println("| Data de Validade: " + dataValidade);
        System.out.println("| Código de Verificação: " + codigoVerificacao);
        System.out.println("|================================================|");
    }
}

class GeradorPrimo extends NumerosPrimos {
    public int gerarProximoPrimo(int ultimoPrimo) {
        int proximo = ultimoPrimo + 1;
        while (!verificarPrimalidade(proximo)) {
            proximo++;
        }
        return proximo;
    }
}

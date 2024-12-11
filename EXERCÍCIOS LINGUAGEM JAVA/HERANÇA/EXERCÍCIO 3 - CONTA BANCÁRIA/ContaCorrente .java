class ContaCorrente extends ContaBancaria {
    private double tarifaMensal = 20.0;

    public void cobrarTarifaMensal() {
        sacar(tarifaMensal);
    }
}

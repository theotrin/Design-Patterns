package br.com.webpage.patterns.strategy;

public class CompraCredito implements StrategyCompra {
    @Override
    public void pagar(int valor) {
        System.out.println("Compra realizada no Crédito no valor de: " + valor );
    }
}

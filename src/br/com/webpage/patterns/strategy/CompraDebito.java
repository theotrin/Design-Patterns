package br.com.webpage.patterns.strategy;

public class CompraDebito implements StrategyCompra {
    @Override
    public void pagar(int valor) {
        System.out.println("Compra realizada no Débito no valor de: " + valor );
    }
}

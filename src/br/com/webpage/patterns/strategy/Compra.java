package br.com.webpage.patterns.strategy;

public class Compra {
    public int valor;

    public Compra(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void processarCompra(StrategyCompra strategyCompra) {
        strategyCompra.pagar(valor);
    }
}

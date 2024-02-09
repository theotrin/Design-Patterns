package br.com.webpage.patterns.strategy;

public class StrategyTest {
    public static void main(String[] args) {
        Compra appleVision = new Compra(2000000);
        Compra notebook = new Compra(1800000);

        appleVision.processarCompra(new CompraCredito());

        notebook.processarCompra(new CompraDebito());
    }
}

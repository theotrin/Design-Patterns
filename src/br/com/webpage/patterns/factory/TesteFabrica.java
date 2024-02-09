package br.com.webpage.patterns.factory;

public class TesteFabrica {
    public static void main(String[] args) {
        Moeda moeda = MoedaFabrica.getInstance("BR");

        System.out.println(40+moeda.getPrefixo());
    }
}

package br.com.webpage.patterns.factory;

public class Dollar implements Moeda{
    @Override
    public String getPrefixo() {
        return "$";
    }
}

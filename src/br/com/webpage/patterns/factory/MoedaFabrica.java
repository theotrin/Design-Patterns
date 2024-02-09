package br.com.webpage.patterns.factory;

public class MoedaFabrica {
    public static Moeda getInstance(String pais){
        switch (pais){
            case "BR": return new Real();
            case "EUA": return new Dollar();
            case "CA": return new Dollar();
            default: throw new IllegalArgumentException("País não encontrado");
        }
    }
}

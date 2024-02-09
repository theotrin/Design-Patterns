package br.com.webpage.patterns.singleton;

public class SingletonTest {
    public static void main(String[] args) {
        Conexao conexao = Conexao.getInstance("Postgres");
        Conexao conexao2 = Conexao.getInstance("MongoDB");

        System.out.println(conexao.bancoDeDados);
        System.out.println(conexao2.bancoDeDados);
    }
}

package br.com.webpage.patterns.builder;

public class BuilderTest {
    public static void main(String[] args) {
        //Paciente theo = new Paciente("Theo", "theo@gmail.com","123456789");

        PacienteBuilder builder = new PacienteBuilder();
        builder.setNome("Theo");
        //builder.setEmail("Theo@gmail.com");
        builder.setCpf("123.456.789-10");

       Paciente theo = builder.getResultado();

        System.out.println(theo.imprimirPaciente());
    }
}

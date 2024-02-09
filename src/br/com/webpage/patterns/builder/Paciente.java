package br.com.webpage.patterns.builder;

public class Paciente {
    private String nome,email,cpf;

    public Paciente(String nome, String email, String cpf) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String imprimirPaciente(){
        String ficha = "ficha do paciênte: \n";

        if(this.nome != null ){
            ficha += "Nome: "+this.nome +"\n";
        }
        if(this.email != null ){
            ficha += "Email: "+this.email +"\n";
        }
        if(this.cpf != null ){
            ficha += "CPF: "+this.cpf +"\n";
        }

        return ficha;
    }
}

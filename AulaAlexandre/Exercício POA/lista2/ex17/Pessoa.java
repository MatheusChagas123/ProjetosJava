package ex17;

import java.net.URL;

public class Pessoa {
    private String nome;
    private String cpf;
    private URL foto;
    private String email;
    public Pessoa(String nome, String cpf, URL foto, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.foto = foto;
        this.email = email;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public URL getFoto() {
        return foto;
    }
    public void setFoto(URL foto) {
        this.foto = foto;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    

}

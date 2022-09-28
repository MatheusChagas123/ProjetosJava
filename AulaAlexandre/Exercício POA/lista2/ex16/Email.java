package ex16;

import java.util.ArrayList;

public class Email {
    private int nomeDoEmail;
    
    ArrayList <Destinatario> destinatarios;


    public Email(int nomeDoEmail) {
        this.nomeDoEmail = nomeDoEmail;
    }

    public int getNomeDoEmail() {
        return nomeDoEmail;
    }

    public void setNomeDoEmail(int nomeDoEmail) {
        this.nomeDoEmail = nomeDoEmail;
    }

    public void escrever(){
        System.out.println("retornando método escrever da classe email");
    }

    public void excluir(){
        System.out.println("retornando método excluir da classe email");
    }

    public void anexar(){
        System.out.println("retornando método enexar da classe email");
    }

    public void responder(){
        System.out.println("retornando método responder da classe email");
    }
    
    
}

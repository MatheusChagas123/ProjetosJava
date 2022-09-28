package ex16;

public class Texto extends Email {
    private String mensagem;

    

    public Texto(int nomeDoEmail, String mensagem) {
        super(nomeDoEmail);
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    
}

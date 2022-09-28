package ex16;

public class Destinatario {
    private int emailDestinario;
    

    public Destinatario(int emailDestinario) {
        this.emailDestinario = emailDestinario;
    }

    public int getEmailDestinario() {
        return emailDestinario;
    }
    

    public void setEmailDestinario(int emailDestinario) {
        this.emailDestinario = emailDestinario;
    }

    // public  String buscar () {
    //     return "retornando método buscar dstinatário (perguntar a alexandre)"; 
    // }
    
    public  Destinatario  buscar(){
        return new Destinatario(4) ;
    }



   
    
}

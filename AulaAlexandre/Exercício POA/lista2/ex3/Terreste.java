package ex3;

public class Terreste extends MeioDeTransporte {
    private int roda;
    private double potencia;
    
    public Terreste(int id, short ano, String modelo, double cargaMaxima, int roda, double potencia) {
        super(id, ano, modelo, cargaMaxima);
        this.roda = roda;
        this.potencia = potencia;
    }

    public int getRoda() {
        return roda;
    }
    public void setRoda(int roda) {
        this.roda = roda;
    }
    public double getPotencia() {
        return potencia;
    }
    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    @Override
    public double consumo() {
        return potencia * cargaMaxima * 100  ;
    }
    


}

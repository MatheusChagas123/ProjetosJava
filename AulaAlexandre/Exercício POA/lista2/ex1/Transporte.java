package ex1;

public class Transporte {
    private Integer id;
    private Integer ano;
    private String modelo;
    private double cargaMaxima;
    
    public Transporte(Integer id, Integer ano, String modelo, double cargaMaxima) {
        this.id = id;
        this.ano = ano;
        this.modelo = modelo;
        this.cargaMaxima = cargaMaxima;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(double cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    public double consumo(){
        return 0;
    }

    public String leiaModelo(){
        return "modelo";
    }

    public void gravaModelo (String modelo){
        System.out.println("modelo gravado");
    }

        
}

package exe2;

public class Carros {

    private String placa;
    private String modelo;
    private String cor;


    public void verificar(){
        System.out.println("PLACA: " + this.getPlaca());
        System.out.println("MODELO: " + this.getModelo());
        System.out.println("COR: " + this.getCor());
    }
    

    //construtor
    public Carros(String placa, String modelo, String cor) {
        this.placa = placa;
        this.modelo = modelo;
        this.cor = cor;
    }




    //métodos getter e setters
    public String getPlaca() {
        return placa;
    }


    public void setPlaca(String placa) {
        this.placa = placa;
    }


    public String getModelo() {
        return modelo;
    }


    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public String getCor() {
        return cor;
    }


    public void setCor(String cor) {
        this.cor = cor;
    }

    


}

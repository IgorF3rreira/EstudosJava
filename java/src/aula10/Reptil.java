package aula10;

public class Reptil extends Animal{
    private String corEscama;


    public void alimentar() {
       System.out.println("Comendo vegetais");
        
    }


    public void emitirSom() {
        
        System.out.println("Som de réptil");
    }


    public void locomover() {
        
        System.out.println("Rastejando");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    
}

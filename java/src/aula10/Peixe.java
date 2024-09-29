package aula10;

public class Peixe extends Animal {
    private String corEscama;


    
    public void alimentar() {
        System.out.println("Comendo substancias");
        
    }


    public void emitirSom() {
        System.out.println("Peixe não faz som");
        
    }


    public void locomover() {
        System.out.println("Nadando");
        
    }
    
    public void soltarBolha(){
        System.out.println("Soltou uma bolha");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    
}

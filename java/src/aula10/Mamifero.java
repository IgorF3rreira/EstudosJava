package aula10;

public class Mamifero extends Animal {
    private String corPelo;

    
  
    public void alimentar() {
        System.out.println("Comendo");
    }


    public void emitirSom() {
        System.out.println("Som de mamifero");
    }


    public void locomover() {
        System.out.println("Correndo");
        
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    
    
}

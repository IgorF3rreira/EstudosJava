package aula10;

public class Ave extends Animal{
    public String corPena; 
    


    @Override
    public void alimentar() {
       System.out.println("Comendo frutas");
        
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de ave");
    }

    @Override
    public void locomover() {
        System.out.println("Voando");
    }
    
    public void fazerNinho(){
        System.out.println("Construiu um ninho");
    }
}

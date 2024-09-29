package aula10;

public class aula10 {
    public static void main(String[] args){
        
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();

        // // // m.setPeso(35.3f);
        // // // m.setCorPelo("Marrom");
        // // // m.alimentar();
        // // // m.locomover();
        // // // m.emitirSom();
        // // // System.out.println(m.toString());

        Canguro C = new Canguro();
        Cachorro k = new Cachorro();
        C.locomover();
        k.locomover();
        k.emitirSom();

    }
}

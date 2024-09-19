package aula07;

public class aula07 {
    public static void main(String[] args){
        Lutador l[] = new Lutador[6];
        l[0] = new Lutador("igor", "Brasileiro", 21, 1.69f, 70.5f, 10, 1, 3);
        l[1] = new Lutador("Anonimo", "frança", 35, 1.80f, 73.5f, 30, 8, 7);
        



        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[1],l[1]);
        UEC01.lutar();
       
    }
}

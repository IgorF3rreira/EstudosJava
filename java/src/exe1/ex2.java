package exe1;

public class ex2 {
    public static void main(String[] args){
        Pessoa[] p = new Pessoa[2];
        livro[] l = new livro[2];

        p[0] = new Pessoa("Igor", 21, "M");
        l[0] = new livro("a volta dos que não foram", "anonimo ", 69,p[0]);



       System.out.println( l[0].detalhes());
        l[0].avancarPag();
        System.out.println( l[0].detalhes());
        l[0].avancarPag();
        System.out.println( l[0].detalhes());


    }
}

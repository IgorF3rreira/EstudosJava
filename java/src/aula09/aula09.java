package aula09;

public class aula09 {
    public static void main(String[] args){
        visitante v1 = new visitante();
        v1.setNome("Igor");
        v1.setIdade(21);
        v1.setSexo("M");
        System.out.println(v1.toString());


        //Aluno a1 = new Aluno();
       // a1.setNome("anonimo");
        //a1.setMatr(2324);
        //a1.setCurso("informatica");
        //a1.setIdade(32);
        //a1.setSexo("M");
       
       // System.out.println(a1.toString());

        Bolsista b1 = new Bolsista();
        b1.setNome("anonimo");
        b1.setMatr(2324);
        b1.setCurso("informatica");
        b1.setIdade(32);
        b1.setSexo("M");
        b1.setBolsa(12.5f);
        b1.pagarMensalidade();
        

    }
}

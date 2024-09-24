package aula08;

public class projetoPessoas {
    public static void main(String[] args){
    //programa principal

    Pessoa	p1 = new Pessoa();
    Aluno  p2 =  new Aluno();
    Professor p3 = new Professor();
    Funcionario p4 = new Funcionario();

    p1.setNome("Pedro");
    p2.setNome("Maria");
    p3.setNome("Marcio");
    p4.setNome("Joana");

    p1.setIdade(24);
    p2.setIdade(26);
    p3.setIdade(34);
    p4.setIdade(14);

    p2.setCurso("informatica");
    p3.setSalario(2699.93f);
    p4.setSetor("estoque");

    p3.receberAum(540.50f);
    p2.cancelarMat();
    p4.mudarTrabalho();
    
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());

    }
    
    
}

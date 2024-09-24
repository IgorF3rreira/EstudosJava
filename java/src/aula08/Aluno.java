package aula08;

public class Aluno extends Pessoa{
    private int mat;
    private String curso;


    //método
    public void cancelarMat(){
        System.out.println("Matricula sera cancelada");
    }

    //métodos especiais
    
    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    
}

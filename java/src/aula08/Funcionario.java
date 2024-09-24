package aula08;

public class Funcionario extends Pessoa {
    private String setor;
    private boolean trabalhando;

    //métodos 
    public void mudarTrabalho(){
        this.trabalhando = ! this.trabalhando;
    }

    //métodos espaciais

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }



    
}

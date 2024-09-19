package aula07;

import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    //Métodos publicos
    public void marcarLuta(Lutador l1, Lutador l2){
        if (l1.getCategoria().equals(l2.getCategoria())  && l1 != l2) {
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        }else{
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }

    public void lutar(){
        if (aprovada) {
            System.out.println("/////////////////////////////////////////////");
            System.out.println("Desafiado");
            this.desafiado.apresentar();
            System.out.println("Desafiante");
            this.desafiante.apresentar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            switch (vencedor) {
                case 0:
                    System.out.println("////////////////////////////");
                    System.out.println("Empatou");
                    System.out.println("////////////////////////////");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                
                case 1: 
                System.out.println("////////////////////////////");
                    System.out.println("VENCEDOR: " + this.desafiado.getNome());
                    System.out.println("////////////////////////////");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    
                    
                break;

                case 2:
                System.out.println("////////////////////////////");
                    System.out.println("VENCEDOR: " + this.desafiante.getNome());
                     System.out.println("////////////////////////////");
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                break;
                default:
                    break;
            }
        }
    }

   

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    //Métodos
    
}

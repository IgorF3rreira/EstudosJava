public class ContaBanco {
    //Atributos

    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    //Métodos Personalizados

    public void estadoAtual(){
        System.out.println("------------------------------------------------");
        System.out.println("conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("dono: " + this.getDono());
        System.out.println("saldo: " + this.getSaldo());
        System.out.println("status: " + this.getStatus());

        }


    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC") {
            this.setSaldo(50);
        }else if (t == "CP") {
            this.setSaldo(150);
        }
        System.out.println("conta aberta");
    }

    public void fecharConta(){
        if (this.getSaldo() > 0) {
            System.out.println("Conta não pode ser fechado pq tem dinheiro");
        }else if (this.getSaldo() < 0){
            System.out.println("Conta não pode ser fechado pois tem debito");
        }else{
            this.setStatus(false);
            System.out.println("conta fechada");
        }
    }

    public void depositar(float v){
        if (this.getStatus() ) {
            //this.saldo = this.saldo + v;
            this.setSaldo(this.getSaldo() + v); 
            System.out.println("deposito com sucesso na conta " + this.getDono());
        }else{
            System.out.println("Impossivel depositar");
        }
    }

    public void sacar(float v){
        if (this.getStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("saque realizado da conta de " + this.getDono());
            }else{
                System.out.println("saldo insuficiente para saque");
            }
        }else{
            System.out.println("impossivel sacar de uma conta fechada");
        }
    }

    public void pagarMensal(){
        int v = 0;
        if (this.getTipo() == "CC") {
            v = 12;
        } else if (this.getTipo() == "CP"){
            v = 20;
        }
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("mensalidade paga com sucesso");
        }else{
            System.out.println("impossivel pagar com conta fechada");
        }
    }

    //Métodos Especiais

    public  ContaBanco(){
        this.setSaldo(0);
        this.setStatus(false);
    
    }

    //getter e setters
    public void setNumConta(int n){
        this.numConta = n;
    }

    public int getNumConta(){
       return this.numConta;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    
    public String getTipo(){
        return this.tipo;
    }

    public void setDono(String dono){
        this.dono = dono;
    }
    
    public String getDono(){
        return this.dono;
    }

    public void setSaldo(float saldo){
        this.saldo = saldo;
    }
    
    public float getSaldo(){
        return this.saldo;
    }

    public void setStatus(boolean status){
        this.status = status;
    }
    
    public boolean getStatus(){
        return this.status;
    }
}







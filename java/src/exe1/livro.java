package exe1;

public class livro implements Publi {
    private String titulo;
    private String autor;
    private int totPag;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;


    



    public livro(String titulo, String autor, int totPag, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPag = totPag;
        this.aberto = false;
        this.pagAtual = 0;
        this.leitor = leitor;
    }

   
    public String detalhes() {
        return "livro [titulo=" + titulo + ",\n autor=" + autor + ",\n totPag=" + totPag + ",\n pagAtual=" + pagAtual
                + ",\n aberto=" + aberto + ",\n leitor=" + leitor.getNome() + "]";
    }


    //métodos
    public String getTitulo() {
        return titulo;
    }



    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }






    public String getAutor() {
        return autor;
    }






    public void setAutor(String autor) {
        this.autor = autor;
    }






    public int getTotPag() {
        return totPag;
    }






    public void setTotPag(int totPag) {
        this.totPag = totPag;
    }






    public int getPagAtual() {
        return pagAtual;
    }






    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }






    public boolean isAberto() {
        return aberto;
    }






    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }






    public Pessoa getLeitor() {
        return leitor;
    }






    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }














    @Override
    public void abrir() {
       this.aberto = true;
    }


    @Override
    public void fechar() {
       this.aberto = false;
    }



    @Override
    public void folhear(int p) {
            this.pagAtual = p;
    }


    @Override
    public void avancarPag() {
        this.pagAtual ++;
    }



    @Override
    public void voltarPag() {
      this.pagAtual --;
    }
    
}

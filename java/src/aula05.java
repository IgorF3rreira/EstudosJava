public class aula05 {
    public static void main (String[] args){
         ContaBanco p3 = new ContaBanco();

        
            p3.setNumConta(123);
            p3.setDono("usuario");
            p3.abrirConta("CC");

        p3.depositar(100);

        p3.sacar(149);

        p3.sacar(1);
        p3.fecharConta();

         p3.estadoAtual();
     

    }
}

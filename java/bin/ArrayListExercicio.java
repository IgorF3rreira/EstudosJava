import java.util.ArrayList;

class Herois {
String nome;

}

public class Main {
public static void main(String[] args) {

ArrayList<Herois> listaHerois = new ArrayList<Herois>();


  Herois Heroi = new Herois();
  Heroi.nome = "Hulk";
  listaHerois.add(Heroi);

  Heroi = new Herois();
  Heroi.nome = "Superman";
  listaHerois.add(Heroi);

  Heroi = new Herois();
  Heroi.nome = "Homem de Ferro";
  listaHerois.add(Heroi);

  Heroi = new Herois();
  Heroi.nome = "Batman";
  listaHerois.add(Heroi);

  Heroi = new Herois();
  Heroi.nome = "Homem aranha";
  listaHerois.add(Heroi);

  Heroi = new Herois();
  Heroi.nome = "Mulher maravilha";
  listaHerois.add(Heroi);

  //Imprimindo todos os heróis 
   System.out.println("\t--HEROIS--" + "\n");
  for(int i = 0; i < listaHerois.size(); i++){
   
    System.out.println("\t Heroi " +i + ": " + listaHerois.get(i).nome);
  }


  System.out.println("\n\n\tNumero incial de elementos");
  System.out.println("\t" +listaHerois.size());

  //Imprimindo heroi que esta na posição 3
  System.out.println("\n\n\tHeroi na posição 3:\n " + "\t" + listaHerois.get(2).nome);

  //Adicionar thor na posição do homem aranha
  Heroi = new Herois();
  Heroi.nome = "Thor";
  listaHerois.add(4, Heroi);

  //Imprimir o numero de elementos depois da inclusão do thor
  System.out.println("\n\n\tNumero de elementos atualizado:");
  System.out.println("\t" +listaHerois.size());

  //Imprimindo todos os heróis atualizado
   System.out.println("\n\t--HEROIS--" + "\n");
  for(int i = 0; i < listaHerois.size(); i++){

    System.out.println("\t Heroi " +i + ": " + listaHerois.get(i).nome);
  }

  //Remover o Superman
  listaHerois.remove(1);
  
  //Imprimir o numero de elementos depois da remoção do Superman
  System.out.println("\n\n\tNumero de elementos atualizado:");
  System.out.println("\t" +listaHerois.size());
   System.out.println("\n\n");
  

  //Imprimindo todos os heróis atualizado
   System.out.println("\n\t--HEROIS--" + "\n");
  for(int i = 0; i < listaHerois.size(); i++){

    System.out.println("\t Heroi " +i + ": " + listaHerois.get(i).nome);
  
  }
   System.out.println("\n\n\n");

  listaHerois.clear();

  //Imprimir o numero de elementos depois da remoção do Superman
  System.out.println("\n\n\tNumero de elementos atualizado:");
  System.out.println("\t" +listaHerois.size());
   System.out.println("\n\n");
}
  

} 

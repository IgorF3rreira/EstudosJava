package aula12;

public class aula12 {
    public static void main(String[] args) {
        Video v [] = new Video[3];
        v[0] = new Video("aula de java");
        // System.out.println(v[0].toString());

        Gafanhoto p = new Gafanhoto("Anonimo", 24, "M", "Anonim");
        // System.out.println(p.toString());

        Visualizacao vis = new Visualizacao(p, v[0]);
        vis.avaliar(65.0f);
        System.out.println(vis.toString());
    }
}

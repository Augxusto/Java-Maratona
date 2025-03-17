package augxusto.rdg.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // byte, short, int, long, float, double = 0;
        // char '\u0000' ' '
        // boolean false
        // String null

        String[] nomes = new String[4];
        nomes[0] = "Saitama";
        nomes[1] = "Genos";
        nomes[2] = "Luffy";
        nomes[3] = "Kakaroto";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
        nomes = new String[5];
    }
}

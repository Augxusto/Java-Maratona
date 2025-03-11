package augxusto.rdg.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        //int, double, float, char, byte, short, long, boolean

        int idade = 10;
        long numeroGrande= 100000;
        double salarioDouble = 2000;
        float salarioFloat = (float)2500.0D; //casting - forçar o float a se comportar como um double
        byte idadeByte = 10; //max 127
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = '\u0041';
        String nome = "saitama";

        System.out.println ("A idade é : " + idade + " anos");
        System.out.println (verdadeiro);
        System.out.println ("char : "+caractere);
        System.out.println (salarioFloat);
        System.out.println ("Oi meu nome é "+nome);
    }
}

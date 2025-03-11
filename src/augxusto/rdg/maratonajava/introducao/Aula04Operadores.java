package augxusto.rdg.maratonajava.introducao;

public class Aula04Operadores {
    private static boolean isPlaystationCincoCompravel;

    public static void main(String[] args){
       // + - / *
        int numero01 = 10;
        int numero02 = 20;
        int soma = numero01 + numero02;
        int subtracao = numero01 - numero02;
        int multiplicacao = numero01 * numero02;
        double divisao = numero01 / (double) numero02;
        System.out.println("Soma: "+soma);
        System.out.println("Subtração: "+subtracao);
        System.out.println("Multiplicação: "+multiplicacao);
        System.out.println("Divisão: "+divisao);


        // Operador de resto: %
        int resto = 21 % 7;
        System.out.println("Resto: "+resto);

        // < > <= >= == !=

        //para operadores booleanos usamos "is"
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezMenorIgualVinte = 10 <= 20;
        boolean isDezMaiorIgualVinte = 10 >= 20;
        boolean isDezDiferenteVinte = 10 != 20;
        System.out.println("isDezMaiorQueVinte: "+isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte: "+isDezMenorQueVinte);
        System.out.println("isDezIgualVinte: "+isDezIgualVinte);
        System.out.println("isDezMenorIgualVinte: "+isDezMenorIgualVinte);
        System.out.println("isDezMaiorIgualVinte: "+isDezMaiorIgualVinte);
        System.out.println("isDezDiferenteVinte: "+isDezDiferenteVinte);

        // && (AND) || (OR) ! (NOT)
        int idade = 19;
        float salario = 3100F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade <= 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta: "+isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrita: "+isDentroDaLeiMenorQueTrinta);


        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystationCincoCompravel =  valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystationCincoCompravel: "+isPlaystationCincoCompravel);

        // = += -= *= /= %=
        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println("Bonus: "+bonus);

        //++ --
        int contador = 0;
        contador++;
        contador--;
        ++contador;
        --contador;
        int contador2 = 0;
        System.out.println("Contador: "+contador);
        System.out.println("Contador2: "+ ++contador2);
    }
}

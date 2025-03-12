package augxusto.rdg.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        //doar se salario > 5000
        double salario = 6000;
        //String mensagemDoar = "Eu vou doar 500";
        //String mensagemNaoDoar = "Sem dinheiro, mas vou ter";
        //(condicao) ? verdadeiro : falso
        //String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;

        String resultado = salario > 5000 ? "Eu vou doar 500" : "Sem dinheiro, mas vou ter";

        System.out.println(resultado);
    }
}

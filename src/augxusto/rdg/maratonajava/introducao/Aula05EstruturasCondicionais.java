package augxusto.rdg.maratonajava.introducao;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
        int idade = 15;

        boolean isAutorizadoComprarBebida = idade >= 18;
        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado");
        }
        if(!isAutorizadoComprarBebida){
            System.out.println("Não autorizado");
        }
    }
}

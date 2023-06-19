import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        //instanciar scanner  (linha obrigatória para ler dados da consola)
        Scanner input = new Scanner(System.in);
        System.out.println("*** Exercicio8 ***");

        // Definir variaveis
        double produto1, produto2, produto3, preco;

        // Ler valores do utilizador
        System.out.println("Insira um preço de um produto: ");
        produto1 = input.nextDouble();

        System.out.println("Insira um preço de um produto: ");
        produto2 = input.nextDouble();

        System.out.println("Insira um preço de um produto: ");
        produto3 = input.nextDouble();

        // Calcular o preço total
        preco=produto1+produto2+produto3;

        // Calcular preco com desconto
        preco=preco*0.9;

        // Apresentar o preco final
        System.out.println("Preco final: "+preco);
    }
}

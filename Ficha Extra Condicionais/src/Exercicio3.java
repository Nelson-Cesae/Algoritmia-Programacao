import java.util.Scanner;
public class Exercicio3 {
    public static void main(String[] args) {
        //instancia obrigatoria scanner  (linha obrigatória para ler dados da consola)
        Scanner input = new Scanner(System.in);
        System.out.println("*** Exercicio3 ***");

        //Ler variaveis
        double valor;

        // Ler dados do utilizador
        System.out.println("Defina o valor do produto:");
        valor=input.nextDouble();

        // Programa
        if (valor>100.00) {
            System.out.println("O valor do produto com desconto é de:"+valor*0.9);
        } else {
            System.out.println("O valor do produto não tem desconto.");
        }

    }
}

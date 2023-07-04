import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        //instancia obrigatoria scanner  (linha obrigatória para ler dados da consola)
        Scanner input = new Scanner(System.in);
        System.out.println("*** Exercicio3 ***");

        // Ler variaveis
        int valor1, valor2, iteracao;
        String jogador1, jogador2;

        // Ler valor iteraçao
        iteracao=0;

        // Ler valor jodaor 1
            System.out.println("Jogador 1 defina um valor de 0 a 100:");
            valor1= input.nextInt();

        // Jogo
        do {
            System.out.println("Jogador 2 adivinhe o valor inserido pelo jogador1:");
            valor2= input.nextInt();
            iteracao++;
            if (valor1<valor2) {
                System.out.println("O valor inserido e superior ao do utilizador 1");
            }else if (valor1>valor2) {
                System.out.println("O valor inserido e inferior ao do utilizador 1");
            }
        } while (valor1!=valor2);

            System.out.println("Numero de tentativas do utilizador2:"+iteracao);

}
}

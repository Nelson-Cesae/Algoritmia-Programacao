import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        //instancia obrigatoria scanner  (linha obrigatória para ler dados da consola)
        Scanner input = new Scanner(System.in);
        System.out.println("*** Exercicio11 ***");

        // Ler variaveis
        double saldoconta, montante;

        // Ler saldo conta
        System.out.print("Introduza o saldo conta: ");
        saldoconta = input.nextDouble();

        // Ler valor a creditar
        System.out.print("Insira o montante a creditar (+) ou debitar (-): ");
        montante = input.nextDouble();


        // operaçao
        if (saldoconta < 0) {
            System.out.println("Operacao invalida, nao tem saldo suficiente");
        } else{//atualiza o saldo
            saldoconta=saldoconta+montante;
            System.out.println("Operacao realizada com sucesso");
        }

        System.out.println("Novo saldo: "+saldoconta);
    }
}

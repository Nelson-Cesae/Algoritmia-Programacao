import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        //instancia obrigatoria scanner  (linha obrigatória para ler dados da consola)
        Scanner input = new Scanner(System.in);
        System.out.println("*** Exercicio12 ***");

        // Definir variaveis
        int operacao;

        // Imprimir opçoes
        System.out.println("1. Criar");
        System.out.println("2. Atualizar");
        System.out.println("3. Eliminar");
        System.out.println("4. Sair");


        // Ler valores do utilizador
        System.out.print("Insira a operacao: ");
        operacao = input.nextInt();

        // Programa
        switch (operacao) {
            case 1: System.out.println("Criar");
            break;

            case 2: System.out.println("Atualizar");
            break;

            case 3: System.out.println("Eliminar");
            break;

            case 4:
            break;

            default: System.out.println ("Escolha invalida");
        }
}
}

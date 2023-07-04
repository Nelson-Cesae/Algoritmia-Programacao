import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        //instancia obrigatoria scanner  (linha obrigatória para ler dados da consola)
        Scanner input = new Scanner(System.in);
        System.out.println("*** Exercicio2 ***");

        // Ler variaveis
        int opcao;

        // Ler opção
        do {
            do {
                System.out.println("Defina a sua opçao");
                System.out.println(" 1.Criar");
                System.out.println(" 2.Atualizar");
                System.out.println(" 3.Eliminar");
                System.out.println(" 4.Sair");
                opcao = input.nextInt();

            } while (opcao < 1 || opcao > 4);
            switch (opcao) {
                case 1:
                    System.out.println(" Escolheu a opçao Criar");
                    break;
                case 2:
                    System.out.println("Escolheu a opçao Atualizar");
                    break;
                case 3:
                    System.out.println("Escolheu a opçao Eliminar");
                    break;
                case 4:
                    System.out.println("Escolheu a opcao Sair");
                    break;
                default:
                    System.out.println("Opçao invalida");
            }
        }while (opcao == 1 || opcao== 2 || opcao==3);
}
}

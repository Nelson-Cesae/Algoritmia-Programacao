import java.util.Scanner;

public class Exerci1 {
    public static void main(String[] args) {

        // Instanciar Scanner (linha obrigatória para ler dados da consola)
        Scanner input = new Scanner(System.in);

        // Declarar variaveis
        int num1 = 0, num2 = 0;
        String opcao, continuar;

        // Menu
        do { //Linha importante para começar o menu

            // Ler num1
            System.out.print("Insira 1º número: ");
            num1=input.nextInt();

            // Ler num2
            System.out.print("Insira 2º número: ");
            num2=input.nextInt();

            do {
                // Imprimir opções do menu
                System.out.println("+ - Soma");
                System.out.println("- - Subtração");
                System.out.println("* - Multiplicação");
                System.out.println("/ - Divisão");

                //Ler opcao do utilizador
                System.out.print("\nIntroduza a opção: ");
                opcao=input.next();

            } while (!opcao.equals("+") && !opcao.equals("-") && !opcao.equals("*") && !opcao.equals("/"));
            // Só deixa avançar se a opção for válida

            switch (opcao) {
                case "+":
                    System.out.println("\n*****Soma*****\n");
                    System.out.println(num1 + num2);
                    break;

                case "-":
                    System.out.println("\n*****Subtração*****\n");
                    System.out.println(num1 - num2);
                    break;

                case "*":
                    System.out.println("\n*****Multiplicação*****\n");
                    System.out.println(num1 * num2);
                    break;

                case "/":
                    System.out.println("\n*****Divisão*****\n");
                    System.out.println(num1 / num2);
                    break;
            }

            //Linhas importantes para ler se o utilizador quer executar novamente o programa
            System.out.println("\nDeseja continuar? (s/n): ");
            continuar=input.next();

        } while (continuar.equals("s")); // Linha importante para fechar o menu e terminar o programa
        // Só deixa sair se opção for a de saída
    }
}






import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        //instancia obrigatoria scanner  (linha obrigatória para ler dados da consola)
        Scanner input = new Scanner(System.in);
        System.out.println("*** Exercicio10 ***");

        // Definir variaveis
        double num1, num2;
        String operacao;

        // Ler num1
        System.out.print("Introduza o num1: ");
        num1 = input.nextDouble();

        // Ler num2
        System.out.print("Introduza o num2: ");
        num2 = input.nextDouble();

        // Operacao
        System.out.print("Operacao (+ - * /): ");
        operacao = input.next();

        // Programa a realizar pelo utilizador
        switch (operacao) {
            case "+": System.out.println("num1+num2");
            break;

            case "-": System.out.println("num1-num2");
            break;

            case "*": System.out.println("num1*num2");
            break;

            case "/": System.out.println("num1/num2");
            break;

            default: System.out.println("Definir como erro");
        }

    }
}
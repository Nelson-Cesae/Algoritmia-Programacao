import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        //instanciar scanner  (linha obrigatória para ler dados da consola)
        Scanner input = new Scanner(System.in);
        System.out.println("*** Exercicio1 ***");
        //Declarar variável
        int num1, num2, resultado;

        //ler num1
        System.out.print("Introduza um numero inteiro: ");
        num1=input.nextInt();

        //ler num2
        System.out.print("Introduza um numero inteiro: ");
        num2=input.nextInt();

        //Somar num1 com num2
        resultado=num1+num2;

        //Apresentar resultado
        System.out.print("Resultado da soma: "+resultado);

    }
}

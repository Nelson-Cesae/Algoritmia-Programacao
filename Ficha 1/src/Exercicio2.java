import java.util.Scanner;

        public class Exercicio2 {
            public static void main(String[] args) {
                //instanciar scanner  (linha obrigatória para ler dados da consola)
                Scanner input = new Scanner(System.in);
                System.out.println("*** Exercicio2 ***");
                // Declarar variavel
                double valor1, valor2, soma, subtracao, multiplicacao, divisao;

                //ler valor 1
                System.out.print("enter double: ");
                valor1=input.nextDouble();

                //ler valor 2
                System.out.print("enter double: ");
                valor2=input.nextDouble();

                //soma
                soma=valor1+valor2;
                System.out.print("enter double: ");

                //subtracao
                subtracao=valor1-valor2;
                System.out.print("enter double: ");

                // multiplicacao
                multiplicacao=valor1*valor2;
                System.out.print("enter double: ");

                //divisao
                divisao=valor1/valor2;
                System.out.print("enter double: ");
    }
}
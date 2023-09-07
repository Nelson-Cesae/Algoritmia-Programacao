import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        // Instanciar Scanner (linha obrigatória para ler dados da consola)
        Scanner input = new Scanner(System.in);

        // Declarar Variaveis
        double valor1, valor2, resultado;

        // Ler do utilzador valor1
        System.out.print("Defina um primeiro numero:");
        valor1=input.nextDouble();

        // Ler do utilzador valor2
        System.out.print("Defina um segundo numero:");
        valor2=input.nextDouble();

        // Resultado da Soma
        resultado=valor1+valor2;
        System.out.println("A soma do valor1 com o valor2 é:" +resultado);

        // Resultado da Subtração
        resultado=valor1-valor2;
        System.out.println("A subtração do valor1 com o valor2 é:" +resultado);

        // Resultado da Multiplicação
        resultado=valor1*valor2;
        System.out.println("A multiplicação do valor1 com o valor2 é:" +resultado);

        // Resultado da Divisão
        resultado=valor1/valor2;
        System.out.println("A divisão do valor1 com o valor2 é:" +resultado);
    }
}
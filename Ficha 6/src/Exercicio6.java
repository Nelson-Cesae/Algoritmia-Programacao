import java.util.Scanner;

// no uses new
public class Exercicio6 {

    /**
     * A função contém o menu de opções que permitam invocar as funções
     * desenvolvidas nos exercícios 2 a 4
     */


    static void menu() {

        // Instancia obrigatória do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int numero, opcao;

        System.out.print("Introduza um numero: ");
        numero = input.nextInt();

        do {
            //Apresenta as opções do menu
            System.out.println("Defina a opção desejada: 1 - Par; 2 - Positivo; 3 - Primo;");
            opcao = input.nextInt();

        } while (numero < 1 && numero > 3);

        switch (opcao){
            case 1:
                System.out.println("Numero par:" + Exercicio2.par(numero));
                break;
            case 2:
                System.out.println("Numero positivo:" + Exercicio3.numPositivo(numero));
                break;
            case 3:
                System.out.println("Numero Primo:" + Exercicio4.numPrimo(numero));
                break;

        }
    }

    //no usages new
    public static void main(String[] args) {
        menu();
    }
}

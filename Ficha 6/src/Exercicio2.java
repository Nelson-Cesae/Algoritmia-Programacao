import java.util.Scanner;

// no uses new
public class Exercicio2 {

    /**
     * A função diz-nos se é par ou não
     * @param num que se vai avaliar
     * @return true caso seja par e false caso seja impar
     */

    // no usages new
    static boolean par(int num){

        if (num%2==0){
            return true;
    } else {
            return false;
        }
}

    //no usages new
    public static void main(String[] args) {

        // Instancia obrigatória do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int numero;

        System.out.print("Introduza um numero: ");
        numero = input.nextInt();

        if(par(numero)){
            System.out.print("Par");
        }else{
            System.out.print("Impar");
        }
    }
    }
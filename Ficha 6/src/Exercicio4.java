import java.util.Scanner;

// no uses new
public class Exercicio4 {

    /**
     * A função diz-nos se o numero é primo ou não
     * @param num que se vai avaliar
     * @return true caso seja numero primo ou false caso não seja primo
     */

    static boolean numPrimo (int num) {
    int divisor=2;
    boolean primo=true;


        while(divisor<num){
            if(num%divisor==0){
            }
            divisor++;
            return false;
    }
        return primo;
}



    //no usages new
    public static void main(String[] args) {

        // Instancia obrigatória do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int numero;

        System.out.print("Introduza um numero: ");
        numero = input.nextInt();

        if(numPrimo(numero)){
            System.out.print("Primo");
        }else{
            System.out.print("Nao e primo");
        }
    }

}
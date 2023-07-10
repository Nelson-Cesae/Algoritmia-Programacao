import java.util.Scanner;

// no uses new
public class Exercicio3 {

    /**
     * A função diz-nos se o numero é positivo ou não
     * @param num que se vai avaliar
     * @return true caso seja numero positivo e false caso seja negativo
     */

    static boolean numPositivo (int num){
        if (num >= 0){
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

        if(numPositivo(numero)){
            System.out.print("Positivo");
        }else{
            System.out.print("Negativo");
        }
}
}
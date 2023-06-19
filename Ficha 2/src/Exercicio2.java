import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        //instancia obrigatoria scanner  (linha obrigatória para ler dados da consola)
        Scanner input = new Scanner(System.in);
        System.out.println("*** Exercicio2 ***");

        // Definir variaveis
        double salario;

        // Ler salario
        System.out.print("Introduza salario: ");
        salario=input.nextDouble();


        // Calcular impostos
        if (salario<= 15000) { // o imposto é de 20%
            System.out.println("Imposto de 20: "+salario * 0.2);
        }else {// se for maior o salario o imposto é de 30%
            System.out.println("Imposto de 30: "+salario * 0.3);
        }


}
}

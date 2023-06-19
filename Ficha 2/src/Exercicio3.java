import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        //instancia obrigatoria scanner  (linha obrigatória para ler dados da consola)
        Scanner input = new Scanner(System.in);
        System.out.println("*** Exercicio3 ***");

        // Definir variaveis
        double salario;

        // Ler salario
        System.out.print("Introduza salario: ");
        salario=input.nextDouble();

        // Calcular impostos
        if (salario<= 15000) { // o imposto é de 20%
            System.out.println("Imposto de 20: "+salario * 0.2);
        } else if (salario>=15000 && salario<=20000){// o imposto é de 30%
            System.out.println("Imposto de 30: "+salario * 0.3);
        } else if (salario>=20000 && salario<=25000){// o imposto é de 35%
            System.out.println("Imposto de 35: "+salario * 0.35);
        } else {// o imposto é de 40%
            System.out.println("Imposto de 40: "+salario * 0.4);

        }
    }
}


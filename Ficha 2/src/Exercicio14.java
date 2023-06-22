import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        //instancia obrigatoria scanner  (linha obrigatória para ler dados da consola)
        Scanner input = new Scanner(System.in);
        System.out.println("*** Exercicio14 ***");

        // Ler variaveis
        int num1, num2, num3;

        // Ler num1
        System.out.print("Introduza o numero1: ");
        num1= input.nextInt();

        // Ler num2
        System.out.print("Introduza o numero2: ");
        num2= input.nextInt();

        // Ler num3
        System.out.print("Introduza o numero3: ");
        num3= input.nextInt();

        // Condição Ordem Crescente
        if(num1<num2 && num1<num3 && num2<num3){
                System.out.println("Primeiro num1: "+num1+ "Segundo num2:"+num2+ "Terceiro num3:"+num3);
            }

        if(num2<num1 && num2<num3 && num1<num3){
            System.out.println("Primeiro num2: "+num2+ "Segundo num1:"+num1+ "Terceiro num3:"+num3);
        }
        if(num3<num1 && num3<num2 && num2<num1){
            System.out.println("Primeiro num3:"+num3+ "Segundo num2:"+num2+ "Terceiro num1"+num1);
        }
        if(num1<num2 && num1<num3 && num3<num2) {
            System.out.println("Primeiro num1:" + num1 + "Segundo num3:" + num3 + "Terceiro num2" + num2);
        }
        if (num2<num1 && num2<num3 && num3<num2) {
            System.out.println("Primeiro num2: " + num2 + "Segundo num3:" + num3 + "Terceiro num2:" + num2);
        }
        if (num3<num1 && num3<num2 && num1<num2) {
            System.out.println ("Primeiro num3:"+num3+ "Segundo num2:"+num1+ "Terceiro num1"+num2);
        }
}
}

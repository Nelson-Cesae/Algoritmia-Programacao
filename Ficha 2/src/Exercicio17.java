import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        //instancia obrigatoria scanner  (linha obrigatória para ler dados da consola)
        Scanner input = new Scanner(System.in);
        System.out.println("*** Exercicio17 ***");

        // Ler variaveis
        double saldomedio;

        // ler saldo medio
        System.out.print("Introduza o saldo medio: ");
        saldomedio = input.nextDouble();

        // Condicional para definir Valor do credito
        if (saldomedio<= 2000) {
            System.out.println("O valor do credito: "+0);
        } else if (saldomedio>2000 && saldomedio<=4000){
            System.out.println("O valor do credito: "+saldomedio / 0.2);
        } else if (saldomedio>4000 && saldomedio<=6000){
            System.out.println("O valor do credito: "+saldomedio * 0.3);
        } else if (saldomedio>6000){
            System.out.println("O valor do credito: "+saldomedio * 0.4);
        }

}
}

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        // Instanciar Scanner (linha obrigatória para ler dados da consola)
        Scanner input = new Scanner(System.in);

        // Declarar variaveis
        int[] array = new int [10];

        // Ciclo para introduzir numeros no array ou vetor
        for (int i=0; i<10; i++){
            System.out.println("Introduza um numero no vetor ["+i+"]:");
            array[i]= input.nextInt();
        }

        // Ciclo para imprimir numeros do array ou vetor
        for (int i=0;i<10;i++){
            System.out.println("Array ["+i+"]: " +array[i]);
        }
    }
}
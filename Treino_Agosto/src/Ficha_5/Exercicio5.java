import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        // Instanciar Scanner (linha obrigatória para ler dados da consola)
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[] array = new int[10];
        double media, total=0;

        // Ciclo para intoduzir numeros no array
        for (int i=0; i<10;i++){
            System.out.println("Introduza um numero no array ["+i+"]:");
            array[i]= input.nextInt();
            total=total+array[i];
        }

        media=total/10;

        System.out.println("A soma é:" +total);
        System.out.println("A media é:" +media);
    }
}
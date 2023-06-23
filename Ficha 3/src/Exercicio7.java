import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        //instancia obrigatoria scanner  (linha obrigatória para ler dados da consola)
        Scanner input = new Scanner(System.in);
        System.out.println("*** Exercicio6 ***");

        // Ler variaveis
        double numero, media, conta;

        // Ler numero
        System.out.print("Digite um numero: ");
        numero = input.nextDouble();

        // Programa

        while(numero>-1) {
            System.out.println("Insira novo numero");
            numero++;
        }

        // Ler media
        media=numero/2;
        System.out.println("A media é" +numero/2);
}
}

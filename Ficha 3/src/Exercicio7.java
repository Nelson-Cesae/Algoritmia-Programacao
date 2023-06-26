import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        //instancia obrigatoria scanner  (linha obrigatória para ler dados da consola)
        Scanner input = new Scanner(System.in);
        System.out.println("*** Exercicio7 ***");

        // Ler variaveis
        double numero, media, soma=0, numintroduzidos=0;

        // Ler numero
        System.out.println("Digite um numero: ");
        numero = input.nextDouble();


        // Programa

        while(numero!=-1) {
            soma=numero+soma;
            numintroduzidos++;
            System.out.println("Insira novo numero");
            numero= input.nextDouble();
        }

        // Ler media
        media=soma/numintroduzidos;
        System.out.println("A media é" +media);

}
}

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        //instanciar scanner  (linha obrigatória para ler dados da consola)
        Scanner input = new Scanner(System.in);
        System.out.println("*** Exercicio4 ***");

        // Declarar Constante Real Pi
        final double Pi = 3.14;

        // Definir variavel real
        double raio, area, perimetro;

        // Ler valor raio
        System.out.println("Insira o raio: ");
        raio = input.nextDouble();

        //Definir area
        area = (3.14 * raio * raio);

        // Definir o perimetro
        perimetro=2*3.14*raio;


        // Apresentar a area
        System.out.println("Bom dia! A area :"+area);

        // Apresentar o perimetro
        System.out.println("Bom dia! O perimetro :"+perimetro);

    }
}
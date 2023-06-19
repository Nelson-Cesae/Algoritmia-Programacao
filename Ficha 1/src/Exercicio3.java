import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        //instanciar scanner  (linha obrigatória para ler dados da consola)
        Scanner input = new Scanner(System.in);
        System.out.println("*** Exercicio3 ***");

        //Declarar variavel (reais)
        double area, perimetro, largura, comprimento;


        //Ler valor largura
        System.out.println("Insira a largura: ");
        largura=input.nextDouble();

        //Ler valor comprimento
        System.out.println("Insira o comprimento: ");
        comprimento=input.nextDouble();

        // Calcular perimetro
        perimetro=(largura+comprimento)*2;

        // Calcular area
        area= largura*comprimento;

        // Apresentar area
        System.out.println("Bom dia! A area do seu retangulo: "+area);

        // Apresentar perimtetro
        System.out.println("Boa tarde! O perimetro do seu retangulo: "+perimetro);

        // closing the scanner object
        input.close();
    }
}

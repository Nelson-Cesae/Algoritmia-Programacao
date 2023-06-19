import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        //instanciar scanner  (linha obrigatória para ler dados da consola)
        Scanner input = new Scanner(System.in);
        System.out.println("*** Exercicio6 ***");

        // Definir variaveis
        double media, percentagens, valor1, valor2, valor3, porcento20, porcento30, porcento50;

        //valor1
        System.out.println("Insira um numero: ");
        valor1 = input.nextDouble();

        //valor2
        System.out.println("Insira um numero: ");
        valor2 = input.nextDouble();

        //valor3
        System.out.println("Insira um numero: ");
        valor3 = input.nextDouble();

        // Calcular media Aritmetica (todos os valores têm o mesmo peso)
        media= (valor1+valor2+valor3)/3;

        // Apresentar a media Aritmetica
        System.out.println("Bom dia! A media : " + media);

        // Calcular Percentagens (media ponderada)
        porcento20= valor1 * 0.2;
        porcento30= valor2 * 0.3;
        porcento50= valor3 * 0.5;

        // Apresentar media ponderada
        System.out.println("Bom dia! A porcentual : " +porcento20);
        System.out.println("Bom dia! A porcentual : " +porcento30);
        System.out.println("Bom dia! A porcentual : " +porcento50);
    }}

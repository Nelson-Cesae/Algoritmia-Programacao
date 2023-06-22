import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        //instancia obrigatoria scanner  (linha obrigatória para ler dados da consola)
        Scanner input = new Scanner(System.in);
        System.out.println("*** Exercicio16 ***");

        // Definir variaveis
        int  valor, nota5=0, nota10=0, nota20=0, nota50=0, nota100=0, nota200=0;


        // ler valor
        System.out.print("Valor: ");
        valor= input.nextInt();

        // Ler nota200
        System.out.print("Nota200: ");
        nota200= input.nextInt();
        nota5=segundosTotais+(tempoMusica*60);

        // ler notas
        notas=2*5;
        System.out.print("Notas necessarias: "+valor/2);
        notas= input.nextInt();

        // Leitura
        if (valor=10) {
            System.out.println("Sao precisas 2 notas"+notas);
        }


}
}

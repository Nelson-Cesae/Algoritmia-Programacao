import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        //instancia obrigatoria scanner  (linha obrigatória para ler dados da consola)
        Scanner input = new Scanner(System.in);
        System.out.println("*** Exercicio13 ***");

        // Definir variaveis
        int programa, hora, minutos;


        // Definir hora
        hora=17;
        System.out.println("Definir hora:" );
        hora = input.nextInt();

        // Definir minutos
        minutos=30;
        System.out.println ("Definir minutos:" );
        minutos = input.nextInt();

        //Sistema 12 horas
        if (hora <=12) {
            System.out.println("Sao "+hora + "AM");
        } else {
            System.out.println ("Sao" +hora + "PM");
        }

}
}

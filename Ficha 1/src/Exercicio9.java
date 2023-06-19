import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        //instanciar scanner  (linha obrigatória para ler dados da consola)
        Scanner input = new Scanner(System.in);
        System.out.println("*** Exercicio9 ***");

        // Definir variaveis
        int segundostotais=0, tempoMusica=0, horas, minutos, segundos;

        // Ler minutos musica1
        System.out.print("Introduza os minutos da musica 1: ");
        tempoMusica=input.nextInt();
        segundostotais=segundostotais+(tempoMusica+60);

        // Ler segundos musica1
        System.out.print("Introduza os segundos da musica 1: ");
        tempoMusica=input.nextInt();
        segundostotais=segundostotais+(tempoMusica);

        // Ler minutos musica2
        System.out.print("Introduza os minutos da musica 2: ");
        tempoMusica=input.nextInt();
        segundostotais=segundostotais+(tempoMusica+60);

        // Ler segundos musica2
        System.out.print("Introduza os segundos da musica 2: ");
        tempoMusica=input.nextInt();
        segundostotais=segundostotais+(tempoMusica);

        // Ler minutos musica3
        System.out.print("Introduza os minutos da musica 3: ");
        tempoMusica=input.nextInt();
        segundostotais=segundostotais+(tempoMusica+60);

        // Ler segundos musica3
        System.out.print("Introduza os segundos da musica 3: ");
        tempoMusica=input.nextInt();
        segundostotais=segundostotais+(tempoMusica);

        // Ler minutos musica4
        System.out.print("Introduza os minutos da musica 4: ");
        tempoMusica=input.nextInt();
        segundostotais=segundostotais+(tempoMusica+60);

        // Ler segundos musica4
        System.out.print("Introduza os segundos da musica 4: ");
        tempoMusica=input.nextInt();
        segundostotais=segundostotais+(tempoMusica);

        // Ler minutos musica5
        System.out.print("Introduza os minutos da musica 5: ");
        tempoMusica=input.nextInt();
        segundostotais=segundostotais+(tempoMusica+60);

        // Ler segundos musica5
        System.out.print("Introduza os segundos da musica 5: ");
        tempoMusica=input.nextInt();
        segundostotais=segundostotais+(tempoMusica);

        System.out.println("Total do Album em segundos: "+segundostotais);

        // Converter para horas minutos segundos
        horas=segundostotais/3600;
        minutos=(segundostotais/60)-(horas*60);
        segundos=(segundostotais)-(horas*3600)-(minutos*60);

        // Imprimir duracao album
        System.out.println("Duracao do Album");
        System.out.println(horas+"h "+minutos+"m "+ segundos+"s");
    }
}

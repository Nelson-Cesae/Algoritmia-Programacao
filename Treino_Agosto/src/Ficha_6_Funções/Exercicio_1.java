import java.util.Scanner;

public class Exercicio_1 {

    static void fazerBarulho(String animal) {

        switch (animal) {
            case "CAO":
                System.out.println("au au au");
                break;
            case "GATO":
                System.out.println("miau");
                break;
            case "PEIXE":
                System.out.println("glub glub");
                break;
            case "VACA":
                System.out.println("muuuu");
                break;
            case "PORCO":
                System.out.println("oinc oinc");
                break;
            default:
            System.out.println("Barulho Indefinido");
            break;
        }
    }

    public static void main(String[] args) {

        // Instanciar Scanner (linha obrigatória para ler dados da consola)
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        String animalEscolhido;

        //Ler valores do utilizador
        System.out.println("Introduza um animal:");
        animalEscolhido = input.next();

        fazerBarulho(animalEscolhido);

        System.out.println("FIM");

    }
}
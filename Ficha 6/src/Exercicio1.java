import java.util.Scanner;

// no uses new
public class Exercicio1 {

    /**
     * A função imprime o barulho de um animal
     * @param animal Animal que vai fazer barulho
     */

    // no usages new
    static void fazerBarulho(String animal){

        switch (animal){
            case "CAO":
                System.out.println("Au au au");
                break;
            case "GATO":
                System.out.println("Miau");
                break;
            case "PEIXE":
                System.out.println("Glub Glub Glub");
                break;
            case "VACA":
                System.out.println("Muuuuuu");
                break;
            case "Porco":
                System.out.println("Oinc! Oinc! Oinc!");
                break;
            default:
                System.out.println("Barulho Indefinido");
                break;
        }
    }

    //no usages new
    public static void main(String[] args) {

        // Instancia obrigatória do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        String animalEscolhido;

        System.out.println("Escolha um animal: ");
        animalEscolhido=input.next();

        fazerBarulho(animalEscolhido);

        System.out.println("\nFIM!");
    }
    }
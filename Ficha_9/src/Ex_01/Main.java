package Ex_01;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("Nelson", 24, 1.8);
        Pessoa pessoa2 = new Pessoa("Maria", 30, 1.7);

        System.out.println("Detalhes da Ex_01.Pessoa 1");
        System.out.println("Nome" + pessoa1.getNome());
        System.out.println("Idade" + pessoa1.getIdade());
        System.out.println("Altura" + pessoa1.getAltura());

        System.out.println();

        System.out.println("Detalhes da Ex_01.Pessoa 2");
        System.out.println("Nome" + pessoa2.getNome());
        System.out.println("Idade" + pessoa2.getIdade());
        System.out.println("Altura" + pessoa2.getAltura());
    }
}

package Ex_07;

import Ex_06.Calculadora;

public class Main {
    public static void main(String[] args) {

        Livro livro1 = new Livro("Lol", "Loli", "Porno", 50, 2);
        Livro livro2 = new Livro("Lil", "Lula", "Porno", 70, 5);

        livro1.exibirDetalhes();
        livro2.exibirDetalhes();

    }
}

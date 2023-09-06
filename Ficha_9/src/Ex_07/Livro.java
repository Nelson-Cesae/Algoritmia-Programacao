package Ex_07;

public class Livro {

    private String titulo;
    private String autor;
    private String categoria;
    private int numPaginas;
    private int isbn;

    /**
     * Método construtor para um livro
     * @param titulo do livro
     * @param autor do livro
     * @param categoria do livro
     * @param numPaginas do livro
     * @param isbn do livro
     */
    public Livro(String titulo, String autor, String categoria, int numPaginas, int isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.numPaginas = numPaginas;
        this.isbn = isbn;
    }

    /**
     * Método para exibir os dados de um livro
     */
    public void exibirDetalhes(){
        System.out.println("Titulo: " +this.titulo);
        System.out.println("Autor: " +this.autor);
        System.out.println("Categoria: " +this.categoria);
        System.out.println("Numero de Páginas: " +this.numPaginas);
        System.out.println("ISBN: " +this.isbn);
    }
}

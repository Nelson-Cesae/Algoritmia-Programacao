package Ex_08;

public class Aluno {

    private String nome;
    private int idade;
    private String curso;
    private double media;


    /**
     * Método Construtor de um Aluno
     * @param nome do Aluno
     * @param idade do Aluno
     * @param curso do Aluno
     * @param media do Aluno
     */
    public Aluno(String nome, int idade, String curso, double media) {
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
        this.media = media;
    }

    /**
     * Método para definir a situação do aluno (aprovado ou não)
     */
    public void situacao() {
        if(this.media>=9.5){
            System.out.println("O aluno esta Aprovado.");
        } else {
            System.out.println("O aluno esta Reprovado.");
        }

    }
}

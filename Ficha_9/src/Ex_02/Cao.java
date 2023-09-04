package Ex_02;
// Classe
public class Cao {

    private String nome;
    private String raca;
    private String latido;

    // Construtor
    public Cao(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
        this.latido = "Au au au";
    }

    public String latido() {return latido;}


    public void setlatido(String latido) {
        this.latido = latido;
    }

    public String getlatido(){
        return this.latido;
    }
}



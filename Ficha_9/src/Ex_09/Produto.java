package Ex_09;

public class Produto {

    private String nome;
    private double preco;
    private int quantidadeStock=0;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public int getQuantidadeStock() {
        return quantidadeStock;
    }

    public void comprar(int quantidade){
        this.quantidadeStock+=quantidade;
    }

    public void vender(int quantidade){
        if(this.quantidadeStock>=quantidade){
            this.quantidadeStock-=quantidade;
        } else{
            System.out.println("Não há quantidade disponivel em stock.");
        }
    }
}

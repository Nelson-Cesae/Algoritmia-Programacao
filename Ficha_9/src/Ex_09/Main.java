package Ex_09;

public class Main {
    public static void main(String[] args) {

        Produto produto1 = new Produto("sabao", 2);

        produto1.comprar(5);
        produto1.vender(2);
        System.out.println("A quantidade em stock é:" +produto1.getQuantidadeStock());

        produto1.comprar(10);
        System.out.println("A quantidade em stock é:" +produto1.getQuantidadeStock());

        produto1.vender(35);
        System.out.println("A quantidade atual em stock é:" +produto1.getQuantidadeStock());
    }
}

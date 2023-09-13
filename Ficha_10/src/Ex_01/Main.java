package Ex_01;

public class Main {
    public static void main(String[] args) {

        Carro carro1 = new Carro("Fiat", "500","2019","100 cv", "999", TipoCombustivel.GASOLINA, 6,5);
        Carro carro2 = new Carro("BMW", "lol","1980","500 cv", "2000", TipoCombustivel.DIESEL, 9);


        // Código para ligar carros

        carro1.ligar();

        System.out.println();

        carro2.ligar();


}
}
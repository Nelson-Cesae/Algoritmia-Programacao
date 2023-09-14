package Ex_01;

public class Main {
    public static void main(String[] args) {

        Carro carro1 = new Carro("Fiat","500",2019,100, 999, TipoCombustivel.GASOLINA, 6.5);
        Carro carro2 = new Carro("BMW","lol",1980,500, 2000, TipoCombustivel.DIESEL, 9);


        // Código para ligar carros

        carro1.ligar();

        System.out.println();

        carro2.ligar();

        // Simulação de Corrida


        Carro vencedor=carro1.corrida(carro2);

        if(vencedor==null){
            System.out.println("Empate");
        }else{
            System.out.println("Vencedor: ");
            vencedor.exibirDetalhes();
        }


    }
}
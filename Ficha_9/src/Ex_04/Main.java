package Ex_04;

import Ex_03.Retângulo;

public class Main {
    public static void main(String[] args) {

        // Instanciar o Circulo

        Circulo circulo = new Circulo(4);

        // Calcular Área e Circunferência do Circulo

        final double PI = 3.14;

        double area = PI* circulo.getRaio()* circulo.getRaio();
        double circunferencia = 2*PI* circulo.getRaio();

        System.out.println("A area do circulo e de:" +area);
        System.out.println("A circunferência do circulo e de:" +circunferencia);

    }
}

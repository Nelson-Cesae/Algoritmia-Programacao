package Ex_02;

public class Main {
    public static void main(String[] args) {

        Cao cao1 = new Cao ("Prince", "Salsicha");

        System.out.println("Impressão do ladrar: " +cao1.latido());

        Cao cao2 = new Cao ("Vaca", "PastorAlemao");
        Cao cao3 = new Cao ("Boi", "Pug");

        cao1.setlatido("Ruf Ruf");
        System.out.println("Novo ladrar:"+cao1.latido());

        cao2.latido();
        cao3.latido();
    }
}

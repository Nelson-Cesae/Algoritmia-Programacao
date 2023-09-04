package Ex_02;

public class Main {
    public static void main(String[] args) {

        Cao cao = new Cao ("Prince", "Salsicha");

        System.out.println("Impressão do ladrar: " +cao.latido());

        Cao cao2 = new Cao ("Vaca", "PastorAlemao");
        Cao cao3 = new Cao ("Boi", "Pug");

        cao.setlatido("Ruf Ruf");
        System.out.println("Novo ladrar:"+cao.latido());
    }
}

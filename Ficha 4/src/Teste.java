import java.util.Scanner;

class teste {
    public static void main(String[] args) {
        //instancia obrigatoria scanner  (linha obrigatória para ler dados da consola)
        Scanner input = new Scanner(System.in);
        System.out.println("*** teste ***");

       int a=0, b=0, c=0;

       a=10;
       b-=a;

       if (a<b){
           c=a;
       } else if (a > b) {
           c=b;
       }else if (a==b){
           c=15;
           System.out.println("c="+c);
       }

    }
}
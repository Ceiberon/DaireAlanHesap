import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int r;
        double pi = 3.14, a;



        Scanner input = new Scanner(System.in);

        System.out.print("Dairenin yarı çapını giriniz :");

        r = input.nextInt();
        double alan = pi * r * r;
        double cevre = 2 * pi * r;

        System.out.print("Dairenin merkezAçısını giriniz");
        a = input.nextInt();

        double merkezAcı = pi * (r*r) * a/360;


        System.out.println("Dairenin Alanı :" + alan);
        System.out.println("Dairenin Cevresi :" + cevre);
        System.out.println("Merkez Açı Ölçüsü :"+ merkezAcı);


    }
}
import java.util.Scanner;
import java.util.Random;
import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args) {
//        zad2
//        Random r = new Random();
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        int[] tab = new int[n];
//        for (int i = 0; i <= n - 1; i++) {
//            tab[i] = r.nextInt(50+50) - 50;
//            System.out.println(tab[i]);
//
//        }
//        System.out.println("max: "+ileMax(tab,n));
//    zad1
        Scanner scan =new Scanner(System.in);
        int n = scan.nextInt();
        int[] tab = new int[n];
        for (int i =0;i<=n-1;i++){
            tab[i]=scan.nextInt();
            System.out.println(tab[i]);

        }
        showPrimes(tab);

    }
//zad1
    public static void showPrimes(int[] list){
        for(int i=0;i<=list.length-1;i++){
            int suma = 0;
            for(int j=1;j<+sqrt(list[i]);j++){
                if(list[i]%j == 0){

                    suma++;
                }
            }

            if (suma == 1) {
                System.out.println(list[i]);
            }
        }

    }



//zad2
    public static int ileMax(int[] tab,int n) {
        int max = tab[0];
        int suma = 0;
        for (int i = 0; i <= n - 1; i++) {
            if (tab[i] >= max)
                max = tab[i];

        }
        for (int i = 0; i <= n - 1; i++) {
            if (tab[i] == max)
                suma += 1;
        }
        return suma;
    }

}


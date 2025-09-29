package lab2909;

import java.util.Random;
import java.util.Scanner;

public class random2909 {
    
    public static int genera_random1(){
        Random random = new Random();
        int num = random.nextInt(10) + 1;
        return num;
    }

    public static int genera_random2(int m){
        Random random = new Random();
        int num = random.nextInt(m) + 1;
        return num;
    }

    public static int genera_random3(int mi, int ma){
        Random random = new Random();
        int num = random.nextInt(ma - mi + 1) + mi;
        return num;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //

        int n = genera_random1();
        System.out.println("numero generato da 1 a 10: " + n);

        // 

        System.out.println("inserisci il numero massimo per la generazione");
        int max = scanner.nextInt();
        n = genera_random2(max);
        System.out.println("numero generato da 1 a max: " + n);

        //

        System.out.println("inserisci il numero minimo per la generazione");
        int min = scanner.nextInt();
        System.out.println("inserisci il numero massimo per la generazione");
        max = scanner.nextInt();
        n = genera_random3(min,max);
        System.out.println("numero generato da min a max: " + n);

        scanner.close();

    }
}

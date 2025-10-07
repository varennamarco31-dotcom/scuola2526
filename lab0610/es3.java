package lab0610;

import java.util.Scanner;
import java.util.Random;


public class es3 {

    public static void riempia(double a[]) {
        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(45) + 1; 
        }
    }

    public static void mediaf(double a[],int fi,double a2[]){
        double somma = 0;
        for (int i = 0; i < a.length / fi ; i++) {
            for (int j = 0; j < fi; j++) {
                somma += fi;
            }
            a2[i] = somma / fi;
        }
    }

    public static void stampaa(double a[]){
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("quanti numeri vuoi nell'array? ");
        int n = scanner.nextInt();
        
        double[] array = new double[n];
        riempia(array);
        
        System.out.println("valore di finestra");
        int f = scanner.nextInt(); 
        double[] array2 = new double[n/f];
        
        mediaf(array,f,array2);
        stampaa(array2);
        
        scanner.close();
    }
}

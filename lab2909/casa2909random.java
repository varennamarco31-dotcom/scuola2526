package lab2909;

import java.util.Scanner;
import java.util.Random;

public class casa2909random {

    public static void riempia(int a[]){
        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(10) + 1;
        }
    }

    public static void stampaa(int a[]){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static int sommaa(int a[]){
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("quanto vuoi che sia lungo l'array? ");
        int l = scanner.nextInt();
        int[] array = new int[l];
        riempia(array);
        stampaa(array);
        System.out.println();
        System.out.println("media dei valori nell' array -> " + sommaa(array));

        scanner.close();
    }
}

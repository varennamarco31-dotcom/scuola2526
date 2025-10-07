package lab0610;

import java.util.Random;

public class es2 {
    
    public static void riempia(int a[]) {
        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(100) + 1; 
        }
    }
    
    public static void bsort(int a[]){
        for (int i = 0; i < a.length - 1 ; i++) {
            for (int j = 0; j <  a.length - i - 1; j++) {
                if (a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                } 
            }
        }
    }

    public static void stampaa(int a[]){
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] array = new int[15];
        riempia(array);
        bsort(array);
        stampaa(array);
    }
}

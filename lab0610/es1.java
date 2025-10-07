// Scrivi un programma che legga da tastiera 10 numeri interi e li inserisca in un array. Implementa un metodo che cerchi un numero specifico nell'array e restituisca la posizione della prima occorrenza (o -1 se non trovato).

package lab0610;

import java.util.Scanner;
import java.util.Random;

public class es1 {

    public static void riempia(int a[]) {
        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(10) + 1; 
        }
    }

    public static int cerca(int a[], int r){
        for (int i = 0; i < a.length; i++) {
            if(a[i] == r){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] array = new int[10];
        riempia(array);
        
        System.out.println("inserisci il numero da cercare ");
        int cerca = scanner.nextInt();
        
        System.out.println("il numero inserito e stato trovato in indice: " + cerca(array, cerca));
        
        scanner.close();
    }
}

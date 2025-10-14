package lab1410;

import java.io.*;
import java.util.Scanner;

public class es3 {
    public static void main(String[] args) {
        
        String[] nomi = {"Umeci","Omeci","Imeci","Emeci","Ameci"};
        int[] eta = {11,12,14,15,17};
        int[] voti = {6,7,8,9,3};
        Scanner scanner = new Scanner(System.in);
        int scelta;
        int l = nomi.length;
    
        do {

            System.out.println("1. leggi");
            System.out.println("2. scrivi");
            System.out.println("0. esci");
            scelta = scanner.nextInt();

        switch (scelta) {
            case 1:
                l = 0;
                try (Scanner fscanner = new Scanner(new File("/workspaces/scuola2526/lab1410/file4.txt"))){
                    while(fscanner.hasNext() && l < nomi.length){
                        nomi[l] = fscanner.next();
                        eta[l] = fscanner.nextInt();
                        voti[l] = fscanner.nextInt();
                        l++;
                    }
                    for (int i = 0; i < l; i++) {
                        System.out.printf("%d. %s %d %d \n",i,nomi[i],eta[i],voti[i]);
                    }
                }catch (IOException e) {
                    System.err.println("errore in lettura");
                }
                break;
            case 2:
                try (PrintWriter writer = new PrintWriter(new File("/workspaces/scuola2526/lab1410/file4.txt"))){
                    nomi[0] = "blufbeci";
                    for (int i = 0; i < l; i++) {
                        writer.printf("%s %d %d \n",nomi[i],eta[i],voti[i]); 
                    }
                } catch (IOException e) {
                    System.err.println("errore in scrittura");
                }
                break;
            case 0:
                System.out.println("fine");
                break;
            default:
                System.out.println("inserisci scelta valida dp");
                break;
        }
        } while (scelta != 0);
        
        scanner.close();
    }
}

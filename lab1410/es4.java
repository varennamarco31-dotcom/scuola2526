package lab1410;

import java.io.*;
import java.util.Scanner;

public class es4 {

    public static int salva (String nomefile,int l,String[] n,int[] et,int[] v){
        l = 0;
                try (Scanner fscanner = new Scanner(new File(nomefile))){
                    while(fscanner.hasNext() && l < n.length){
                        n[l] = fscanner.next();
                        et[l] = fscanner.nextInt();
                        v[l] = fscanner.nextInt();
                        l++;
                    }
                    for (int i = 0; i < l; i++) {
                        System.out.printf("%d. %s %d %d \n",i,n[i],et[i],v[i]);
                    }
                }catch (IOException e) {
                    System.err.println("errore in lettura");
                }
                return l;
    }

    public static void scrivi (String nomefile,int l,String[] n,int[] et,int[] v){
        try (PrintWriter writer = new PrintWriter(new File(nomefile))){
                    for (int i = 0; i < l; i++) {
                        writer.printf("%s %d %d \n",n[i],et[i],v[i]); 
                    }
                } catch (IOException e) {
                    System.err.println("errore in scrittura");
                }
    }

    public static void aggiungi (String nomeFile,int l,String[] n,int[] et,int[] v){
        Scanner scanner = new Scanner(System.in);
        if (l == 14){
            System.out.println("database pieno");
        }else{
            System.out.println("inserisci nome da inserire");
            n[l+1] = scanner.next();
            System.out.println("inserisci eta da inserire");
            et[l+1] = scanner.nextInt();
            System.out.println("inserisci voto da inserire");
            v[l+1] = scanner.nextInt();
            scrivi(nomeFile, l, n, et, v);
        }
        scanner.close();
    }

    public static void cerca (int l,String[] n,int[] et, int[] v){
        boolean c = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci il nome da cercare");
        String nc = scanner.next();

        for (int i = 0; i < n.length; i++) {
            if(nc == n[i]){
                System.out.printf("%d %s %d %d \n",i,n[i],et[i],v[i]);
                i = n.length;
            }
        }
        if(!c){
            System.out.println("nome non trovato");
        }
        scanner.close();
    }

    public static void main(String[] args) {
        
        String[] nomi = new String[15];
        int[] eta = new int[15];
        int[] voti = new int[15];
        Scanner scanner = new Scanner(System.in);
        int scelta;
        int l = nomi.length;
        String file = "/workspaces/scuola2526/lab1410/file4.txt";
    
        do {

            System.out.println("1. leggi");
            System.out.println("2. scrivi");
            System.out.println("3. inserisci nuovo studente");
            System.out.println("4. cerca studente");
            System.out.println("5. cancella studente");
            System.out.println("0. esci");
            scelta = scanner.nextInt();

        switch (scelta) {
            case 1:
                l = salva(file,l,nomi,eta,voti);
                break;
            case 2:
                scrivi(file, l, nomi, eta, voti);
                break;
            case 3:
                aggiungi(file,l,nomi,eta,voti);
                break;
            case 4: 
                l = salva(file,l,nomi,eta,voti);
                cerca(l,nomi,eta,voti);
                break;
            case 5:

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
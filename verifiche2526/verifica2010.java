package verifiche2526;

import java.io.*;
import java.util.Scanner;

public class verifica2010 {
    
    static int max = 40;
    static String[] marca = new String[max];
    static String[] modello = new String[max];
    static String[] desc = new String[max];
    static int[] anno = new int[max];
    static int n = 0;

    public static void aggiungi(Scanner scanner){
        
        boolean t = false;
        do {
            scanner.nextLine();
            System.out.println("inserisci la marca");
            marca[n] = scanner.nextLine();
            System.out.println("inserisci il modello");
            modello[n] = scanner.nextLine();
            System.out.println("inserisci la descrizione");
            desc[n] = scanner.nextLine();
            System.out.println("inserisci l'anno di produzione");
            anno[n] = scanner.nextInt();
            if (anno[n] > 2025 || marca[n]==null || modello[n]==null || desc[n]==null ){
                System.out.println("valori inseriti invalidi");
            }else {
                t = true;
            }
            } while (t == false);
        n++;
    }

    public static void stampapa(){
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = i; j < n-1-i; j++) {
                // (int j = 0; j < n-1-i; j++)
                    // if (anno[j] > anno[j+1])
                        // scambi tra j e j+1  
                if(anno[i] > anno[j]){
                    int temp = anno[i];
                    anno[i] = anno[j];
                    anno[j] = temp; 
                    String tempmo = modello[i];
                    modello[i] = modello[j];
                    modello[j] = tempmo;
                    String tempma = marca[i];
                    marca[i] = marca[j];
                    marca[j] = tempma;
                    String tempde = desc[i];
                    desc[i] = desc[j];
                    desc[j] = tempde;
                }
            }
        }
        
        for (int i = n-1; i > -1; i--) {
            System.out.println(marca[i] + " " + modello[i] + " " + desc[i] + " " + anno[i]);
        }
    }

    public static void cercapm(Scanner scanner){
        scanner.nextLine();
        System.out.println("inserisci la marca da cercare");
        int t = 0; 
        String mc = scanner.nextLine();
        if (mc != null) {
            for (int i = 0; i < n; i++) {
                if(mc.equalsIgnoreCase(marca[i])){
                    System.out.println(i + ". " + marca[i] + " " + modello[i] + " " + desc[i] + " " + anno[i]);
                    t++;
                }
            }
        }else{
            System.out.println("marca invalida");
        }
        if(t == 0){
            System.out.println("nessun oggetto trovato");
        }
    }

    public static void scrivi(){
        try (PrintWriter w = new PrintWriter(new File("file.txt"))){
            for (int i = 0; i < n; i++) {
                w.printf("%s-%s-%s-%d\n",marca[i],modello[i],desc[i],anno[i]);
            }
        } catch (IOException e) {
            System.out.println("errore nella scrittura su file");
        }
    }

    public static void leggi(){
        try(Scanner fscanner = new Scanner(new File("file.txt"))){
            n = 0;
            while(fscanner.hasNextLine() && n < 40){
                String a = fscanner.nextLine();
                String a2[] = a.split("-");
                marca[n] = a2[0];
                modello[n] = a2[1];
                desc[n] = a2[2];
                String a3 = a2[3];
                anno[n] = Integer.parseInt(a3);
                n++;  
            }
        } catch (IOException e){
            System.out.println("errore nella lettura da file");
        }
    }

    public static void stampapm(){
        for (int i = 0; i < n-1 ; i++) {
            for (int j = i; j < n-1-i; j++) {
                // (int j = 0; j < n-1-i; j++)
                String a = marca[i];
                if(a.compareToIgnoreCase(marca[j])>0){
                    // if (a.compareToIgnoreCase(marca[j+1])>0)
                        // scambi tra j e j+1  
                    int temp = anno[i];
                    anno[i] = anno[j];
                    anno[j] = temp; 
                    String tempmo = modello[i];
                    modello[i] = modello[j];
                    modello[j] = tempmo;
                    String tempma = marca[i];
                    marca[i] = marca[j];
                    marca[j] = tempma;
                    String tempde = desc[i];
                    desc[i] = desc[j];
                    desc[j] = tempde;
                }
            }
        }
        for (int i = n-1; i > -1; i--) {
            System.out.println(marca[i] + " " + modello[i] + " " + desc[i] + " " + anno[i]);
        }
    }

    public static void cancellamm(Scanner scanner){
        scanner.nextLine();
        System.out.println("isnerisci la marca");
        String mc=scanner.nextLine();
        System.out.println("insrisci il modello");
        String moc=scanner.nextLine();
        for (int i = 0; i < n-1; i++) {
            for (int j = i; j < n-1-i; j++) {
                if(mc.equalsIgnoreCase(marca[i]) && moc.equalsIgnoreCase(modello[i])){
                    marca[j] = marca[j+1];
                    modello[j] = modello[j+1];
                    desc[j] = desc[j+1];
                    anno[j] = anno[j+1];
                    n--;
                }    
            }
            
        }
    }
        // if da eseguire prima del secondo ciclo for
        // 2°for: (int j = i; j < n-1; j++)

    public static void cancellam(Scanner scanner){
        scanner.nextLine();
        System.out.println("inserisci il modelllo da eliminare");
        String moc = scanner.nextLine();
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-1; j++) {
                if (moc.equalsIgnoreCase(modello[i])) {
                    marca[j] = marca[j+1];
                    modello[j] = modello[j+1];
                    desc[j] = desc[j+1];
                    anno[j] = anno[j+1];
                    n--;
                }
            }
        }
    }
        // if da eseguire prima del secondo ciclo for
        // 2°for: (int j = i; j < n-1; j++)

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int scelta;

    do {
        System.out.println("1. aggiungi prodotto");
        System.out.println("2. stampa in ordine di anno di produzione");
        System.out.println("3. cerca articolo per marca");
        System.out.println("4. scrivi su file");
        System.out.println("5. leggi da file");
        System.out.println("6. stampa if ordine per marca");
        System.out.println("7. cancella per marca e modello");
        System.out.println("8. cancella per modello");
        System.out.println("inserisci scelta");
        scelta = scanner.nextInt();
    
        switch (scelta) {
            case 1:
                aggiungi(scanner);
                break;
            case 2:
                stampapa();
                break;
            case 3:
                cercapm(scanner);
                break;
            case 4:
                scrivi();
                // break;
            case 5:
                leggi();
                // break;
            case 6:
                stampapm();
                break;
            case 7:
                cancellamm(scanner);
                break;
            case 8:
                cancellam(scanner);
                break;
            case 0:
                System.out.println("sei uscito dal programma");
                break;
            default:
                System.out.println("inserire una scelta valida del menu");
                break;
        }

    } while (scelta!=0);

    }
}


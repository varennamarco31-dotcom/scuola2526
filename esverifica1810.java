import java.util.Scanner;
import java.io.*;

public class esverifica1810 {

    static String[] titolo = new String[30];
    static String[] autore = new String[30];
    static int[] anno = new int[30];
    static int n = 0;

    public static void aggiungi(Scanner scanner){
        scanner.nextLine();
        if(n >= 30){
            System.out.println("libreria piena");
        }else{
            System.out.println("inserisci titolo ");
            titolo[n] = scanner.nextLine();
            System.out.println("inserisci l'autore ");
            autore[n] = scanner.nextLine();
            System.out.println("inserisci l'anno di pubblicazione");
            anno[n] = scanner.nextInt();
            n++;
        }
    }

    public static void visualizza(){
        if(n == 0){
            System.out.println("nessun libro in libreruia");
        }else{
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - 1 - i; j++) {
                    if(titolo[j].compareToIgnoreCase(titolo[j+1]) > 0){
                        String tempt = titolo[j];
                        String tempa = autore[j];
                        int tempy = anno[j];
                        titolo[j] = titolo[j+1];
                        titolo[j+1] = tempt;
                        autore[j] = autore[j+1];
                        autore[j+1] = tempa;
                        anno[j] = anno[j+1];
                        anno[j+1] = tempy;
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                System.out.println(i + ": " + titolo[i] + " " + autore[i] + " " + anno[i]);
            }
        }
    }

    public static void cerca(Scanner scanner){
        scanner.nextLine();
        int trovati = 0;
        if (n == 0){
            System.out.println("nessun libro nella libreria");
        }else{
            System.out.println("inserisci l'autore da cercare");
            String a = scanner.nextLine();
            for (int i = 0; i < n; i++) {
                if(autore[i].equalsIgnoreCase(a)){
                    System.out.println(i + ": " + titolo[i] + " " + anno[i]);
                    trovati++;
                }
            }
            if(trovati==0){
                System.out.println("nessun libro trovato");
            }
        }
    }

    public static void cancella(Scanner scanner){
        scanner.nextLine();
        boolean t = false;
        if (n == 0){
            System.out.println("nessun libro in libreria");
        }else{
            System.out.println("inserisci il titolo da cercare");
            String a = scanner.nextLine();
            for (int i = 0; i < n; i++) {
                if (titolo[i].equalsIgnoreCase(a)){
                    for (int j = i; j < n -1; j++) {
                        titolo[j] = titolo[j+1];
                        autore[j] = autore[j+1];
                        anno[j] = anno[j+1];
                    }
                    n--;
                    t = true;
                    System.out.println("libro cancellato");
                    break;
                }
            }
        }
        if(!t){
            System.out.println("libro non trovato");
        }
    }

    public static void scrivi(){
        try (PrintWriter writer = new PrintWriter(new File("file.txt"))){
            for (int i = 0; i < n; i++) {
                writer.println(titolo[i] + "-" + autore[i] + "-" + anno[i]);
            }
            System.out.println("scrittura completata");
        } catch (IOException e) {
            System.err.println("errore in scrittura");
        }
    }

    public static void leggi(){
        try (Scanner fscanner = new Scanner(new File("file.txt"))){
            n = 0;
            while (fscanner.hasNextLine() && n < 30 ) {
                String a = fscanner.nextLine();
                String a2[] = a.split("-");
                if (a2.length == 3){
                    titolo[n] = a2[0];
                    autore[n] = a2[1];
                    anno[n] = Integer.parseInt(a2[2]);
                    n++;
                }
            }
            System.out.println("lettura completata");
        } catch (IOException e) {
            System.out.println("errore in lettura");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int scelta;

        do {
            System.out.println("1. aggiungi");
            System.out.println("2. stampa");
            System.out.println("3. cerca");
            System.out.println("4. cancella");
            System.out.println("5. scrivi su file");
            System.out.println("6. leggi file");
            System.out.println("0. esci");
            scelta = scanner.nextInt();

            switch (scelta) {
                case 1:
                    aggiungi(scanner);
                    break;
                case 2:
                    visualizza();
                    break;
                case 3:
                    cerca(scanner);
                    break;
                case 4:
                    cancella(scanner);
                    break;
                case 5:
                    scrivi();
                    break;
                case 6:
                    leggi();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("immetti una scelta valida");
                    break;
            }

        } while (scelta != 0);

        scanner.close();
    }
}

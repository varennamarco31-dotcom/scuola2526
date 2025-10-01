package lab3009;

import java.util.Scanner;

public class rubrica {
    
    public static void menu(){
        System.out.println("1. inserisci gromech");
        System.out.println("2. cerca in rubrica");
        System.out.println("3. cancella tramite nome");
        System.out.println("4. stampa tutti i numeri");
        System.out.println("5. n posti vuoit");
        System.out.println("0. exit");
    }
    
    public static boolean newcontact(String num[], String nom[], Scanner scanner){

        for (int i = 0; i < nom.length; i++) {
            if(nom[i] == null || nom[i].equals("")){
                System.out.println("insersci il nome del nuovo contatto");
                nom[i] = scanner.nextLine();
                System.out.println("inserisci il numero del nuovo contatto");
                num[i] = scanner.nextLine();
                return true;
            }
        }
        System.out.println("lista piena");
        return false;
    }

    public static void cercanum(String num[], String nom[], String nome){
        for (int i = 0; i < nom.length; i++) {
            if(nom[i] != null && nom[i].equals(nome)){
                System.out.println("contatto : "+ nome  + " " + num[i]);
            }
        }
    }
    public static void cercanom(String num[], String nom[], String numero){
        for (int i = 0; i < num.length; i++) {
            if(num[i] != null && num[i].equals(numero)){
                System.out.println("contatto : "+ nom[i] + " " + numero);
            }
        }
    }

    public static void canc(String num[], String nom[], String nome){
        for (int i = 0; i < nom.length; i++) {
            if(nom[i] != null && nom[i].equals(nome)){
                nom[i] = "";
                num[i] = "";
            }
        }
    }

    public static void stampa(String num[], String nom[]) {
        System.out.println();
        for (int i = 0; i < nom.length; i++) {
            if(nom[i] != null && !nom[i].equals("")){
                System.out.print(nom[i] + " ");
                System.out.println(num[i]);
            }
        }
        System.out.println();
    }

    public static int conta(String num[], String nom[]){
        int j=0;
        for (int i = 0; i < nom.length; i++) {
            if(nom[i] == null || nom[i].equals("")){
                j++;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String[] numeri = new String[10];
        String[] nome = new String[10]; 
        int scelta;

        do {
            menu();
            scelta = scanner.nextInt();
            scanner.nextLine();

            switch (scelta) {
                case 1:
                    System.out.println("Hai scelto inserisci gromech");
                    newcontact(numeri, nome, scanner);
                    break;
                case 2:
                    System.out.println("1. Cerca con numero");
                    System.out.println("2. Cerca con nome");
                    int scn = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("valore di ricerca: ");
                    String n = scanner.nextLine();
                    switch (scn) {
                        case 1:
                            cercanom(numeri, nome, n);
                            break;
                        case 2:
                            cercanum(numeri, nome, n);
                            break;
                        default:
                            System.out.println("Turi");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("inserisci il nome da cancellare");
                    String n2 = scanner.nextLine();
                    canc(numeri, nome, n2);
                    break;
                case 4:
                    System.out.println("Stampa di tutti i contatti");
                    stampa(numeri, nome);
                    break;
                case 5:
                    System.out.println("gli spazi vuoti sono: " + conta(numeri, nome));
                    break;
                case 0:
                    System.out.println("Fine programma");
                    break;
                default:
                    System.out.println("Valore inserito non valido");
                    break;
            }    
        } while (scelta != 0);

        scanner.close();
    }
}

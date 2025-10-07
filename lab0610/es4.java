package lab0610;

import java.util.Scanner;

public class es4 {

    public static int vocali(String a){
        String v = "aeiouAEIOU";
        int vocals = 0;
        for (int i = 0; i < v.length(); i++) {
            char c = v.charAt(i);
            for (int j = 0; j < a.length(); j++) {
                if (c == a.charAt(j)) {
                    vocals++;
                }
            }
        }
        return vocals;
    }

    public static int consonanti(String a){
        String v = "bcdfghjklmnopqrstvwxyz";
        a = a.toLowerCase();
        int cons = 0;
        for (int i = 0; i < v.length(); i++) {
            char c = v.charAt(i);
            for (int j = 0; j < a.length(); j++) {
                if (c == a.charAt(j)) {
                    cons++;
                }
            }
        }
        return cons;
    }

    public static boolean palindroma(String a){
        a = a.toLowerCase();
        a = a.replaceAll(" ", "");
        for (int i = 0; i < a.length() / 2; i++) {
            if(a.charAt(i) != a.charAt(a.length()-1-i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("inserisci la stringa da controllare");
        String frase = scanner.nextLine();
        
        System.out.println("il numero di vocali è: " + vocali(frase));
        System.out.println("il numero di consonanti è: " + consonanti(frase));
        
        if(palindroma(frase)){
            System.out.println("la frase e palindroma");
        }else{
            System.out.println("frase non palindroma");
        }
        
        scanner.close();
    }
}

package lab0610;

import java.util.Scanner;

public class es5 {
    public static String cifra(String testo, char c) {
        String risultato = "";
        int chiave = Character.toUpperCase(c) - 'A';

        for (int i = 0; i < testo.length(); i++) {
            char c2 = testo.charAt(i);

            if (Character.isLetter(c2)) {
                char base;
                if (Character.isUpperCase(c2)) {
                    base = 'A';
                } else {
                    base = 'a';
                }

                char cifrato = (char) ((c2 - base + chiave) % 26 + base);
                risultato += cifrato;
            } else {
                risultato += c2;
            }
        }

        return risultato;
    }

    public static String decifra(String testo, char c) {
    String risultato = "";
    int chiave = Character.toUpperCase(c) - 'A';

    for (int i = 0; i < testo.length(); i++) {
        char c2 = testo.charAt(i);

        if (Character.isLetter(c2)) {
            char base;
            if (Character.isUpperCase(c2)) {
                base = 'A';
            } else {
                base = 'a';
            }

            char decifrato =(char)((c2 - base - chiave + 26) % 26 + base);
            risultato += decifrato;
        } else {
            risultato += c2;
        }
    }

    return risultato;
}

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("inserisci la frase originale");
        String originale = scanner.nextLine();
        System.out.println("inserisci la chiave di crifratura");
        String chiave = scanner.next();

        char chiava = chiave.charAt(0);

        String cifrato = cifra(originale, chiava);
        System.out.println("Testo cifrato: " + cifrato);

        String decifrato = decifra(cifrato, chiava);
        System.out.println("Testo decifrato: " + decifrato);

        scanner.close();
    }

}

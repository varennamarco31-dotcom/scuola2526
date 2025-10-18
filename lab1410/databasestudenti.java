 package lab1410;

import java.io.*;
import java.util.Scanner;

public class databasestudenti {

    public static int salva(String nomefile, int l, String[] n, int[] e, int[] v) {
        l = 0;
        try (Scanner f = new Scanner(new File(nomefile))) {
            while (f.hasNext() && l < n.length) {
                n[l] = f.next();
                e[l] = f.nextInt();
                v[l] = f.nextInt();
                l++;
            }
            for (int i = 0; i < l; i++) {
                System.out.println(i + " " + n[i] + " " + e[i] + " " + v[i]);
            }
        } catch (IOException ex) {
            System.out.println("errore lettura");
        }
        return l;
    }

    public static void scrivi(String nomefile, int l, String[] n, int[] e, int[] v) {
        try (PrintWriter w = new PrintWriter(new File(nomefile))) {
            for (int i = 0; i < l; i++) {
                if (n[i] != null) {
                    w.println(n[i] + " " + e[i] + " " + v[i]);
                }
            }
        } catch (IOException ex) {
            System.out.println("errore scrittura");
        }
    }

    public static int aggiungi(String nomefile, int l, String[] n, int[] e, int[] v) {
        Scanner s = new Scanner(System.in);
        if (l == n.length - 1) {
            System.out.println("pieno");
        } else {
            for (int i = 0; i < n.length; i++) {
                if (n[i] == null) {
                    System.out.println("nome");
                    n[i] = s.next();
                    System.out.println("eta");
                    e[i] = s.nextInt();
                    System.out.println("voto");
                    v[i] = s.nextInt();
                    l++;
                    scrivi(nomefile, l, n, e, v);
                    break;
                }
            }
        }
        s.close();
        return l;
    }

    public static int cerca(int l, String[] n, int[] e, int[] v) {
        Scanner s = new Scanner(System.in);
        System.out.println("nome");
        String x = s.next();
        for (int i = 0; i < l; i++) {
            if (n[i] != null && n[i].equals(x)) {
                System.out.println(i + " " + n[i] + " " + e[i] + " " + v[i]);
                s.close();
                return i;
            }
        }
        System.out.println("non trovato");
        s.close();
        return -1;
    }

    public static void cancella(int p, String[] n, int[] e, int[] v) {
        if (p >= 0) {
            n[p] = null;
            e[p] = -1;
            v[p] = -1;
        }
    }

    public static void main(String[] args) {
        String[] n = new String[15];
        int[] e = new int[15];
        int[] v = new int[15];
        Scanner s = new Scanner(System.in);
        int l = 0;
        int scelta;
        String f = "file4.txt";

        do {
            System.out.println("1 leggi");
            System.out.println("2 scrivi");
            System.out.println("3 aggiungi");
            System.out.println("4 cerca");
            System.out.println("5 cancella");
            System.out.println("0 fine");
            scelta = s.nextInt();

            switch (scelta) {
                case 1:
                    l = salva(f, l, n, e, v);
                    break;
                case 2:
                    scrivi(f, l, n, e, v);
                    break;
                case 3:
                    l = aggiungi(f, l, n, e, v);
                    break;
                case 4:
                    cerca(l, n, e, v);
                    break;
                case 5:
                    int p = cerca(l, n, e, v);
                    cancella(p, n, e, v);
                    scrivi(f, l, n, e, v);
                    break;
                case 0:
                    System.out.println("fine");
                    break;
                default:
                    System.out.println("scelta errata");
            }
        } while (scelta != 0);

        s.close();
    }
}

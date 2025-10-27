package lab2710;

import java.util.Scanner;

class Libro {

    private String titolo;
    private String autore;
    private int numPagine;
    private double prezzo;

    public Libro(String t, String a, int n, double p) {
        settitolo(t);
        setautore(a);
        setnumPagine(n);
        setprezzo(p);
    }

    public String gettitolo() {
        return titolo;
    }

    public void settitolo(String t) {
        titolo = t;
    }

    public String getautore() {
        return autore;
    }

    public void setautore(String a) {
        autore = a;
    }

    public int getnumPagine() {
        return numPagine;
    }

    public void setnumPagine(int n) {
        numPagine = n;
    }

    public double getprezzo() {
        return prezzo;
    }

    public void setprezzo(double p) {
        if (p >= 0) {
            prezzo = p;
        }
    }

    public void stampainfo() {
        System.out.println("Titolo: " + gettitolo());
        System.out.println("Autore: " + getautore());
        System.out.println("Numero di pagine: " + getnumPagine());
        System.out.println("Prezzo: " + getprezzo());
    }

    public void inserisci(Scanner scanner){ 
        System.out.println("inserisci il titolo"); 
        settitolo(scanner.nextLine()); 
        System.out.println("inserisci l'autore"); 
        setautore(scanner.nextLine()); 
        System.out.println("inserisci il numero di pagine"); 
        setnumPagine(scanner.nextInt()); 
        System.out.println("inserisci il prezzo"); 
        setprezzo(scanner.nextDouble()); 
        scanner.nextLine(); 
    } 
}
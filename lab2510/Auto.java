package lab2510;

import java.util.Scanner;

public class Auto {
    // Attributi
    private String colore;
    private String marca;
    private String modello;
    private int porte;
    private boolean accesso;
    private int velocita;

    // Costruttore: imposta valori iniziali tramite i set
    public Auto() {
        setColore("");
        setMarca("");
        setModello("");
        setPorte(0);
        setAccesso(false);
        setVelocita(0);
    }

    // Getter e Setter
    public String getColore() {
        return colore;
    }

    public void setColore(String c) {
        colore = c;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String m) {
        marca = m;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String mod) {
        modello = mod;
    }

    public int getPorte() {
        return porte;
    }

    public void setPorte(int p) {
        porte = p;
    }

    public boolean isAccesso() {
        return accesso;
    }

    public void setAccesso(boolean a) {
        accesso = a;
    }

    public int getVelocita() {
        return velocita;
    }

    // Se accesso == false, forza velocità a 0
    public void setVelocita(int v) {
        if (isAccesso()) {
            velocita = v;
        } else {
            velocita = 0;
        }
    }

    // Metodo per inserire i dati da tastiera
    public void inserisciDati() {
        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci il colore: ");
        setColore(input.nextLine());

        System.out.print("Inserisci la marca: ");
        setMarca(input.nextLine());

        System.out.print("Inserisci il modello: ");
        setModello(input.nextLine());

        System.out.print("Inserisci il numero di porte: ");
        setPorte(input.nextInt());

        System.out.print("Accesso consentito? (true/false): ");
        setAccesso(input.nextBoolean());

        System.out.print("Inserisci la velocità massima: ");
        setVelocita(input.nextInt());
        input.close();
    }

    // Metodo per mostrare i dettagli
    public void mostraDettagli() {
        System.out.println("\n--- DETTAGLI AUTO ---");
        System.out.println("Colore: " + getColore());
        System.out.println("Marca: " + getMarca());
        System.out.println("Modello: " + getModello());
        System.out.println("Numero porte: " + getPorte());

        if (isAccesso()) {
            System.out.println("Accesso: Consentito");
        } else {
            System.out.println("Accesso: Negato");
        }

        System.out.println("Velocità massima: " + getVelocita() + " km/h");
    }

    // Metodo main per testare la classe
    public static void main(String[] args) {
        Auto miaAuto = new Auto();
        miaAuto.inserisciDati();
        miaAuto.mostraDettagli();
    }
}

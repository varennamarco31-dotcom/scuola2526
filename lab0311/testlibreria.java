package lab0311;

public class testlibreria {
    public static void main(String[] args) {

        libreria libro1 = new libreria ("1984","orwell",1949,328,10.50);
        libreria libro2 = new libreria ("talottastories","talotta",2025);
        libreria libro3 = new libreria ("pomeci&co","umeci");
        libreria libro4 = new libreria ("bombechthegreat","laskab",2023,789,67.67);
  
        System.out.println("=== Dettagli iniziali dei libri ===");
        System.out.println(libro1);
        System.out.println(libro2);
        System.out.println(libro3);
        System.out.println(libro4);

        System.out.println("\n=== Prestiti e restituzioni ===");
        libro1.presta();
        libro1.presta();
        libro1.restituisci();
        libro4.restituisci();

        System.out.println("\n=== Applicazione sconto su libro ===");
        System.out.println("Prezzo originale di " + libro2.gettitolo() + ": " + libro2.getprezzo() + " €");
        libro2.setprezzo(10.0);
        libro2.applicasconto(20);
        System.out.println("Prezzo scontato: " + libro2.getprezzo() + " €");

        System.out.println("\n=== Confronto anni di pubblicazione ===");
        boolean confronto = libro4.confrontaanno(libro1);
        System.out.println(libro4.gettitolo() + " è più recente di " + libro1.gettitolo() + "? " + confronto);

        System.out.println("\n=== Modifica attributi ===");
        libro3.setprezzo(14.50);
        libro3.setnpag(400);
        libro3.setanno(2012);
        libro3.setdisponibile(false);

        System.out.println("\n=== Dettagli finali dei libri ===");
        libro1.stampadettagli();
        libro2.stampadettagli();
        libro3.stampadettagli();
        libro4.stampadettagli();

    }
}

package lab1011;

public class TestLibreria {
    public static void main(String[] args) {
        
        int max = 10;
        Libreria libreria = new Libreria("Libalps", "Via Jacopo della quercia", max);

        Libro l1 = new Libro("Il Signore degli Anelli", "Fantasy", "Tolkien", 1200, 1954);
        Libro l2 = new Libro("1984", "Distopico", "Orwell", 328, 1949);
        Libro l3 = new Libro("I Promessi Sposi", "Storico", "Manzoni", 720, 1840);
        Libro l4 = new Libro("Harry Potter", "Fantasy", "Rowling", 500, 1997);
        Libro l5 = new Libro("La Fattoria degli Animali", "Satira", "Orwell", 150, 1945);

        // aggiungilibri
        libreria.aggiungiLibro(l1, max);
        libreria.aggiungiLibro(l2, max);
        libreria.aggiungiLibro(l3, max);
        libreria.aggiungiLibro(l4, max);
        libreria.aggiungiLibro(l5, max);

        // stampalibri
        libreria.visualizzaTuttiLibri();

        // cercalibroperautore
        Libro[] la = libreria.elencoLibriPerAutore("Orwell");
        for (int i = 0; i < la.length; i++) {
            System.out.println(la[i]);
        }

        // maxpagine
        System.out.println(libreria.libroConPiuPagine());
        
        // mediapg
        System.out.println(libreria.mediaPagine());
    }
}

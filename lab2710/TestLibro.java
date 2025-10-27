package lab2710;

public class TestLibro {
    public static void main(String[] args) {

        Libro l1 = new Libro("Il nome della rosa", "Umberto Eco", 512, 18.50);
        Libro l2 = new Libro("1984", "George Orwell", 328, 14.90);
        Libro l3 = new Libro("Harry Potter e la pietra filosofale", "J.K. Rowling", 223, 12.00);

        l1.stampainfo();
        System.out.println();
        l2.stampainfo();
        System.out.println();
        l3.stampainfo();
        System.out.println();

        l1.setprezzo(1500.0);
        l1.stampainfo();
        System.out.println();

        l1.setprezzo(-25.0);
        l1.stampainfo();
    }
}

package lab0311;
public class testcontocorrente {
    public static void main(String[] args) {
        contocorrente c1 = new contocorrente("a123", "mario", 500);
        contocorrente c2 = new contocorrente("b456", "luigi", 200, 3);

        c1.deposita(200);
        c1.preleva(100);
        c1.preleva(1000);

        c1.bonifico(c2, 150);

        c1.applicainteressi();
        c2.applicainteressi();

        System.out.println("--- dettagli finali ---");
        c1.stampadettagli();
        c2.stampadettagli();
    }
}
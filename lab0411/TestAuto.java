public class TestAuto {
    public static void main(String[] args) {

        Motore motore1 = new Motore(2000, "Benzina", 150);
        Auto a1 = new Auto("Volkswagen", "Golf", motore1);
        Auto a2 = new Auto("Toyota", "Corolla", 1800, "Ibrida", 140);

        System.out.println("avvio a1");
        a1.avvia();
        a2.avvia();

        System.out.println("\nschede auto");
        a1.stampaScheda();
        a2.stampaScheda();

        System.out.println("\ntoString");
        System.out.println(a1);
        System.out.println(a2);
    }
}

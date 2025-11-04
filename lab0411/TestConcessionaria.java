public class TestConcessionaria {
    public static void main(String[] args) {
        
        Motore m1 = new Motore(1984,"Benzina",220);
        Motore m2 = new Motore(1798,"ibrida",140);
        
        Auto a1 = new Auto("Volkswagen", "Golf", m1);
        Auto a2 = new Auto("Toyota", "Corolla", m2);
        Auto a3 = new Auto("Ford", "Mustang", 0, null, 0);
        
        a1.avvia();
        a2.avvia();
        a3.avvia();

        a1.  stampaScheda();
        a2.stampaScheda();
        a3.stampaScheda();

        System.out.println(a1.getMotore().getCavalli()); 

}
}
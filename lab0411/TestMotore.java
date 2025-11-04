public class TestMotore {
    public static void main(String[] args) {
        Motore m1 = new Motore(1600, "Benzina", 110);
        Motore m2 = new Motore(2000, "Diesel", 150);

        System.out.println("accendi motori");
        m1.accendi();
        m2.accendi();

        System.out.println("\ndati motori");
        System.out.println(m1.toString());
        System.out.println(m2.toString());

        System.out.println("\ngetters");
        System.out.println("Cilindrata motore 1: " + m1.getCilindrata());
        System.out.println("Carburante motore 1: " + m1.getCarburante());
        System.out.println("Cavalli motore 1: " + m1.getCavalli());
    }
}


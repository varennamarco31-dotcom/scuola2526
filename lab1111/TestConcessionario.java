package lab1111;

public class TestConcessionario {
    public static void main(String[] args) {

        Automobile a1 = new Automobile("Fiat", "Panda", 1200, 2018, 8500, "AB123CD");
        Automobile a2 = new Automobile("Fiat", "Tipo", 1600, 2020, 15000, "EF456GH");
        Automobile a3 = new Automobile("BMW", "X1", 2000, 2022, 35000, "IJ789KL");
        Automobile a4 = new Automobile("Audi", "A3", 1800, 2019, 28000, "MN012OP");
        Automobile a5 = new Automobile("BMW", "X3", 2500, 2021, 45000, "QR345ST");
        Automobile a6 = new Automobile("Fiat", "500", 1000, 2023, 17000, "UV678WX");

        Concessionario c1 = new Concessionario("AutoTop", "Roma");
        Concessionario c2 = new Concessionario("CarWorld", "Milano", 10);

        c1.aggiungiAuto(a1);
        c1.aggiungiAuto(a2);
        c1.aggiungiAuto(a3);

        c2.aggiungiAuto(a4);
        c2.aggiungiAuto(a5);
        c2.aggiungiAuto(a6);

        System.out.println("elenco concessionario 1");
        c1.visualizzaTutteAuto();

        System.out.println("\nRicerca per targa: " + c2.cercaAutoPerTarga("MN012OP"));

        System.out.println("\nElenco auto in concessionario 2:");
        Automobile[] arr1 = c2.elencoAutoPerMarca("BMW");
        for (int i=0 ;i < arr1.length;i++) {
            System.out.println(arr1[i]);
        }

        System.out.println("\nauto più costosa in c1:");
        System.out.println(c1.autoConPrezzoMaggiore());

        System.out.println("\nauto in c1 con min e max:");
        Automobile[] arr2 = c1.autoInFasciaDiPrezzo(10000, 30000);
        for (int i=0 ;i < arr2.length;i++) {
            System.out.println(arr2[i]);
        }

        System.out.println("\nvalore tot c1: " + c1.calcolaValoreTotaleInventario());

        System.out.println("\ncalcola prezzo finale: " + c1.calcolaPrezzoVendita(a3));

        System.out.println("print statistiche");
        Concessionario.stampaStatisticheSistema();
        
        System.out.println("Prezzo medio auto: " + Automobile.getPrezzoMedioAuto());
    }
}
package lab1911;

public class TestEreditarieta{
    public static void main(String[] args) {
        Veicolo unoveicolo = new Veicolo("pipop", "pluto");
        unoveicolo.stampadettagli();

        Auto unoauto = new Auto("gia", "giu", 4);
        unoauto.stampadettagli();

        Moto unomoto = new Moto("bul", "dt", false);
        unomoto.stampadettagli();

    }
}   
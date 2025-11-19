public class TestAnimali {

    public static void main(String[] args) {

        Cane cane = new Cane("Fido", 5, "Labrador");
        Gatto gatto = new Gatto("Micia", 3, "Bianco");
        Pappagallo pappagallo = new Pappagallo("Kiko", 2, new String[]{"Ciao!", "Buongiorno!", "Ti voglio bene!"});

        Animale[] animali = {cane, gatto, pappagallo};

        for (int i = 0; i < animali.length; i++) {
            Animale a = animali[i];
            System.out.println();
            System.out.println("Animale: " + a.getNome());
            System.out.println("Verso: " + a.faiVerso());
            a.mangia();
            a.dormi();
        }

        System.out.println();
        cane.corri();
        gatto.faFusa();
        pappagallo.ripeti();
    }
}
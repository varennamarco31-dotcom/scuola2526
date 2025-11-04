public class Auto {
    private String marca;
    private String modello;
    private Motore motore;

    public Auto(String marca, String modello, Motore motore){
        this.marca = marca;
        this.modello = modello;
        this.motore = motore;
    }

    public Auto(String marca, String modello, int cilindrata, String carburante, int cavalli){
        this.marca = marca;
        this.modello = modello;
        this.motore = new Motore(cilindrata, carburante, cavalli); 
    }

    public void avvia(){
        motore.accendi();
        System.out.println("Auto in funzione");
    }

    public Motore getMotore() {
        return motore;
    }

    public String getmarca(){
        return marca;
    }

    public String getmodello(){
        return modello;
    }

    public void stampaScheda() {
        System.out.println("Auto:");
        System.out.println("  Marca: " + marca);
        System.out.println("  Modello: " + modello);
        System.out.println(motore.toString());
    }

    @Override
    public String toString(){
        return "Auto:\n" + 
                "Marca: " + marca +
                "Modello: " + modello +
                motore.toString();
    }

}


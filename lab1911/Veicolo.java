package lab1911;

public class Veicolo {
    private String marca;
    private String modello;

    public Veicolo(String marca, String modello){
        this.marca = marca;
        this.modello = modello;
    }

    public void stampadettagli(){
        System.out.println("marca: " + marca);
        System.out.println("modello: " + modello);
    }

}

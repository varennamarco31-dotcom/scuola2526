package lab1911;

public class Moto extends Veicolo{
    
    private boolean cavalletto;

    public Moto(String marca, String modello, boolean cavalletto){
        super(marca,modello);
        this.cavalletto = cavalletto;
    }

    @Override
    public void stampadettagli(){
        super.stampadettagli();
        System.out.println("la moto ha il cavalletto: "+ (cavalletto ? "si" : "no"));
    }
}

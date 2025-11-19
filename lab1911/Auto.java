package lab1911;

public class Auto extends Veicolo {
    private int numeroPorte;

    public Auto(String marca, String modello, int numeroPorte){
        super(marca,modello);
        this.numeroPorte = numeroPorte;
    }

    @Override
    public void stampadettagli(){
        super.stampadettagli();
        System.out.println("numero di porte: " + numeroPorte);
    }
    
}

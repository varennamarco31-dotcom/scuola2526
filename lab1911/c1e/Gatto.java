//ereditarieta (estende Animale)
public class Gatto extends Animale{
    private String colore;

    public Gatto(String nome, int eta, String colore){
        super(nome, eta); // eredita con super da Animale
        this.colore = colore;
    }
    //polimorfismo 
    @Override
    public String faiVerso(){
        return "miao";
    }

    public String getColore() {
        return colore;
    }
    public void setColore(String colore) {
        this.colore = colore;
    }

    public void faFusa(){
        System.out.println("brrr");
    }
}

//ereditarieta (estende Animale)
public class Cane extends Animale {
 
    private String razza;

    public Cane(String nome, int eta, String razza){
        super(nome,eta);// eredita con super da Animale
        this.razza = razza;
    }
    //polimorfismo 
    @Override
    public String faiVerso(){
        return "bau";
    }

    public void corri(){
        System.out.println("sta correndo");
    }

    public String getRazza() {
        return razza;
    }
    public void setRazza(String razza) {
        this.razza = razza;
    }
}

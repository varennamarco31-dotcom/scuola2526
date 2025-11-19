import java.util.Random;
//ereditarieta (estende Animale)
public class Pappagallo extends Animale{
    private String[] parole;

    public Pappagallo(String nome, int eta, String[] parole){
        super(nome, eta);// eredita con super da Animale
        this.parole = parole;
    }

    public String[] getParole() {
        return parole;
    }
    public void setParole(String[] parole) {
        this.parole = parole;
    }
    //polimorfismo 
    @Override 
    public String faiVerso(){
        return "Squawk";
    }
    
    public void ripeti(){
        Random r = new Random();
        int p = r.nextInt(parole.length);
        System.out.println(parole[p]);
    }
    
}

// classe astratta rappresenta generalmente un animale

public abstract class Animale {
    protected String nome;
    protected int eta;
    
    public Animale(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEta() {
        return eta;
    }
    public void setEta(int eta) {
        this.eta = eta;
    }
    // metodo astratto che impone alle sottoclassi di riscriverlo
    public abstract String faiVerso();
    
    public void mangia(){
        System.out.println("sta mangiando");
    }
    public void dormi(){
        System.out.println("sta dormendo");
    }

}

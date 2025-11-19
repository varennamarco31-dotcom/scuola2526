public class Tavolo {
    private int Ntavolo;
    private int cmax;
    private boolean dispo;
    private Cliente cliente;

    public Tavolo(int Ntavolo, int cmax){
        this.Ntavolo = Ntavolo;
        this.cmax = cmax;
        this.dispo = true;
        this.cliente = null;
    }
    
    public Tavolo(int Ntavolo){
        this.Ntavolo = Ntavolo;
        this.cmax = 4;
        this.dispo = true;
        this.cliente = null;
    }

    public void assegnaCliente(Cliente cliente){
        if(cmax >= cliente.getNper()){
            this.cliente = cliente;
            this.dispo = false;
        }else{
            System.out.println("il tavolo non ha abbastanza capacità");
        }
    }

    public void liberaTavolot(){
        this.cliente = null;
        this.dispo = true;
    }

    public boolean isDisponibile(){
        return dispo;
    }

    public int getNtavolo(){
        return Ntavolo;
    }

    public Cliente getClienteAssegnato(){
        return cliente;
    }

    public int getCmax() {
        return cmax;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setCmax(int cmax) {
        this.cmax = cmax;
    }

    public void setDispo(boolean dispo) {
        this.dispo = dispo;
    }

    public void setNtavolo(int ntavolo) {
        Ntavolo = ntavolo;
    }
    
}

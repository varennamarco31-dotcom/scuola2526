public class Cliente {
    private String nome;
    private String cognome;
    private String telefono;
    private int nper;
    private Tavolo tavolo;

    public Cliente(String nome, String cognome, String telefono, int nper){
        this.nome = nome;
        this.cognome = cognome;
        this.telefono = telefono;
        this.nper = nper;
        this.tavolo = null;
    }
    
    public Cliente(String nome, String cognome, int nper){
        this.nome = nome;
        this.cognome = cognome;
        this.telefono = "non fornito";
        this.nper = nper;
        this.tavolo = null;
    }

    public void prenotaTavolo(Tavolo tavolo){
        setNome(nome);
        setCognome(cognome);
        setNper(nper);
        setTelefono(telefono);
        setTavolo(tavolo);
    }

    public void liberaTavolo(){
        tavolo.liberaTavolot();
    }

    public Tavolo getTavoloPrenoato(){
        return tavolo;
    }

    public int getNper() {
        return nper;
    }

    public String getNomeCompleto(){
        return nome + "-" + cognome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNper(int nper) {
        this.nper = nper;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setTavolo(Tavolo tavolo) {
        this.tavolo = tavolo;
    }

    @Override
    public String toString(){
        return "Cliente\n" +
                "nome: " + nome +
                "cognome: " + cognome +
                "telefono: " + telefono + 
                "nper: " + nper /*+"tavolo: " + tavolo */ ;
    }

  /*  private boolean verificaPrenotazione(){
        if(this.tavolo != null){
            return true;
        }
        return false;
    }
    */
    /*
    private void cambiaNumeroPersone(int nuovoNumero){
        if(nuovoNumero <= tavolo.getCmax()){
            this.nper = nuovoNumero;
        }
    } */
}

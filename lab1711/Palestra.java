public class Palestra {
    // private String nomePalestra;
    // private String indirizzo;
    private Abbonamento[] abbonamenti;
    private int numeroAbbonamenti;

    // private static int numeroPalestreAperte = 0;
    private static int capacitaStandard;
    // private static double scontoStudenti;
    
    public Palestra(String nomePalestra, String indirizzo, int max, int numeroAbbonamenti) {
        // this.nomePalestra = nomePalestra;
        // this.indirizzo = indirizzo;
        this.abbonamenti = new Abbonamento[max];
        this.numeroAbbonamenti = 0;

        // numeroPalestreAperte++;
    }

    public Palestra(String nomePalestra, String indirizzo) {
        // this.nomePalestra = nomePalestra;
        // this.indirizzo = indirizzo;
        this.abbonamenti = new Abbonamento[capacitaStandard];
        this.numeroAbbonamenti = 0;
    }

    public void aggiungiAbbonamento(Abbonamento abbonamento){
        if(numeroAbbonamenti >= abbonamenti.length){
            System.out.println("max numero abbonamenti");
        }else{
            abbonamenti[numeroAbbonamenti] = abbonamento;
        }
    }
    
    public void visualizzaTuttiAbbonamenti(){
        for (int i = 0; i < numeroAbbonamenti; i++) {
            System.out.println(abbonamenti[i].toString());
        }       
    }
    
    public Abbonamento cercAbbonamentoPerCodice(String codice){
        if(numeroAbbonamenti == 0){
            System.out.println("nessun abbonamento");
        }else{
            for (int i = 0; i < numeroAbbonamenti; i++) {
                if(abbonamenti[i].getCodiceAbbonamento().equalsIgnoreCase(codice)){
                    return abbonamenti[i];
                }
            }
        }
        return null;
    }

    public Abbonamento[] elencoAbbonamentoPerTipo(String tipo){
        int l = 0;

        if(numeroAbbonamenti == 0){
            System.out.println("nessun abbonamento");
            return null;
        }else{
            for (int i = 0; i < numeroAbbonamenti; i++) {
                if (abbonamenti[i].getTipoAbbonamento().equalsIgnoreCase(tipo)) {
                    l++;
                }
            }
        }

        Abbonamento[] abb = new Abbonamento[l+1];
        for (int i = 0; i < l; i++) {
            if (abbonamenti[i].getTipoAbbonamento().equalsIgnoreCase(tipo)) {
                abb[i] = abbonamenti[i];
            }
        }

        return abb;
    }

    public double calcolaIncassoTotale(){
        double somma = 0;
        for (int i = 0; i < numeroAbbonamenti; i++) {
            somma += abbonamenti[i].calcolaCostoTotale();
        }
        return somma;
    }
}
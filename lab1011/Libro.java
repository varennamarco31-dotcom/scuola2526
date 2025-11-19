package lab1011;

public class Libro {
    private String titolo;
    private String genere;
    private String autore;
    private int numeroPagine;
    private int annoPubblicazione;
    
    public Libro(String titolo, String genere, String autore, int numeroPagine, int annoPubblicazione) {
        this.titolo = titolo;
        this.genere = genere;
        this.autore = autore;
        this.numeroPagine = numeroPagine;
        this.annoPubblicazione = annoPubblicazione;
    }

    public String getTitolo() {
        return titolo;
    }
    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getGenere() {
        return genere;
    }
    public void setGenere(String genere) {
        this.genere = genere;
    }

    public String getAutore() {
        return autore;
    }
    public void setAutore(String autore) {
        this.autore = autore;
    }

    public int getNumeroPagine() {
        return numeroPagine;
    }
    public void setNumeroPagine(int numeroPagine) {
        this.numeroPagine = numeroPagine;
    }

    public int getAnnoPubblicazione() {
        return annoPubblicazione;
    }
    public void setAnnoPubblicazione(int annoPubblicazione) {
        this.annoPubblicazione = annoPubblicazione;
    }
    
    @Override
    public String toString(){
        return "Libro\n" + 
                "titolo: " + titolo +
                "autore: " + autore +
                "genere: " + genere + 
                "numPagine: " + numeroPagine + 
                "annoPubb: " + annoPubblicazione; 
    }
}

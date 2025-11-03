package lab0311;

public class libreria {

    private String titolo;
    private String autore;
    private int anno;
    private int npag;
    private double prezzo;
    private boolean disponibile;

    public libreria(String titolo, String autore, int anno, int npag,double prezzo ){
        this.titolo = titolo;
        this.autore = autore;
        this.anno = anno;
        this.npag = npag;
        this.prezzo = prezzo;
        this.disponibile = true;
    } 

    public libreria(String titolo, String autore, int anno){
        this.titolo = titolo;
        this.autore = autore;
        this.anno = anno;
        this.npag = 0;
        this.prezzo = 0.0;
        this.disponibile = true;
    }

    public libreria(String titolo, String autore){
        this.titolo = titolo;
        this.autore = autore;
        this.anno = 2025;
        this.npag = 0;
        this.prezzo = 0.0;
        this.disponibile = true;
    }

    public libreria(String titolo, String autore, int anno, int npag, double prezzo, boolean disponibile){
        this.titolo = titolo;
        this.autore = autore;
        this.anno = anno;
        this.npag = npag;
        this.prezzo = prezzo;
        this.disponibile = disponibile;
    }

    @Override
    public String toString() {
        return "Libro:\n" +
                "  Titolo: " + titolo +
                "  Autore: " + autore +
                "  Anno: " + anno +
                "  Numero pagine: " + npag +
                "  Prezzo: " + prezzo +
                "  Disponibile: " + disponibile;
    }

    public String gettitolo(){
        return titolo;
    }

    public String getautore(){
        return autore;
    }

    public int getanno(){
        return anno;
    }

    public int getnpag(){
        return npag;
    }

    public double getprezzo(){
        return prezzo;
    }

    public boolean getdisponibile(){
        return disponibile;
    }

    public void settitolo(String titolo){
        this.titolo = titolo;
    }

    public void setautore(String autore){
        this.autore = autore;
    }

    public void setanno(int anno){
        validaanno(anno);
        this.anno = anno;
    }

    public void setnpag(int npag){
        this.npag = npag;
    }

    public void setprezzo(double prezzo){
        this.prezzo = prezzo;
    }

    public void setdisponibile(boolean disponibile){
        this.disponibile = disponibile;
    } 

    public void presta(){
        if(!disponibile){
            System.out.println("libro gia in prestito");
        }else{
            this.disponibile = false;
        }
    }

    public void restituisci(){
        this.disponibile = true;
    }

    public void applicasconto(double percentuale){
        this.prezzo = (prezzo * percentuale) / 100;
    }

    public boolean confrontaanno(libreria altrolibro){
        if(anno < altrolibro.getanno()){
            return true;
        }else{
            return false;
        }
    }

    public void stampadettagli(){
        System.out.println("Libro:\n" +
                "  Titolo: " + titolo +
                "  Autore: " + autore +
                "  Anno: " + anno +
                "  Numero pagine: " + npag +
                "  Prezzo: " + prezzo +
                "  Disponibile: " + disponibile);
    }

    private boolean validaanno(int anno){
        if(anno > 1450 && anno < 2025){
            return true;
        }else{
            return false;
        }
    }
}

package lab1111;

public class Automobile {
    private String marca;
    private String modello;
    private int cilindrata;
    private int anno;
    private double prezzo;
    private String targa;

    private static int contatoreTotaleAuto = 0;
    private static double sommaPrezziTotali = 0;
    
    public Automobile(String marca, String modello, int cilindrata, int anno, double prezzo, String targa) {
        this.marca = marca;
        this.modello = modello;
        this.cilindrata = cilindrata;
        this.anno = anno;
        this.prezzo = prezzo;
        this.targa = targa;
        contatoreTotaleAuto++;
        sommaPrezziTotali += prezzo;
    }

    public String getMarca() {
        return marca;
    }
    public String getModello() {
        return modello;
    }
    public int getCilindrata() {
        return cilindrata;
    }
    public int getAnno() {
        return anno;
    }
    public double getPrezzo() {
        return prezzo;
    }
    public String getTarga() {
        return targa;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    @Override
    public String toString(){
        return "Automobile\n" +
                "marca: " + marca +
                "modello: " + modello +
                "cilindrata: " + cilindrata +
                "anno: " + anno +
                "prezzo: " + prezzo + 
                "targa: " + targa; 
    }
    
    public static int getTotaleAutoCreate(){
        return contatoreTotaleAuto;
    }
    
    public static double getPrezzoMedioAuto(){
        return sommaPrezziTotali / contatoreTotaleAuto ;
    }
    
    public static void resetContatori(){
        sommaPrezziTotali = 0;
        contatoreTotaleAuto = 0;
    }
}

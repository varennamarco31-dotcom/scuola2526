package lab1111;

public class Concessionario {
    // private String nome;
    // private String citta;
    private Automobile[] automobili;
    private int numeroAuto;

    private static int numeroConcessionariCreati = 0;
    private static final int capacitaMassimaPredefinita = 67;
    private static double percentualeGuadagno = 15;

    public Concessionario(String nome, String citta, int max){
        // this.nome = nome;
        // this.citta = citta;
        this.automobili = new Automobile[max];
        this.numeroAuto = 0;
        numeroConcessionariCreati++;
    }

    public Concessionario(String nome, String citta){
        // this.nome = nome;
        // this.citta = citta;
        this.automobili = new Automobile[capacitaMassimaPredefinita];
        this.numeroAuto = 0;
        numeroConcessionariCreati++;
    }

    public void aggiungiAuto(Automobile auto){
        if (this.numeroAuto < automobili.length){
            automobili[numeroAuto] = auto;
            numeroAuto++;
        }
    }

    public void visualizzaTutteAuto(){
        for (int i = 0; i < numeroAuto; i++) {
            System.out.println(automobili[i].toString());
        }
    }

    public Automobile cercaAutoPerTarga(String targa){
        if(numeroAuto > 0){
            for (int i = 0; i < numeroAuto; i++) {
                if(automobili[i].getTarga().equalsIgnoreCase(targa)){
                    return automobili[i];
                }
            }
        }
        return null;
    }

    public Automobile[] elencoAutoPerMarca(String marca){
        if (numeroAuto > 0) {
            int c = 0;
            for (int i = 0; i < numeroAuto; i++) {
                if(marca.equalsIgnoreCase(automobili[i].getMarca())){
                    c++;   
                }
            }
            Automobile[] a = new Automobile[c];
            int j = 0;
            for (int i = 0; i < numeroAuto; i++) {
                if (marca.equalsIgnoreCase(automobili[i].getMarca())) {
                    a[j++] = automobili[i];
                }
            }
            return a;
        }
        return null;
    }

    public Automobile autoConPrezzoMaggiore(){
        double max = 0.0;
        Automobile maxa = null;
        if(numeroAuto > 0){
            for (int i = 0; i < numeroAuto; i++) {
                if(max < automobili[i].getPrezzo()){
                    max = automobili[i].getPrezzo();
                    maxa = automobili[i];
                }
            }
        }
        return maxa;
    }

    public Automobile[] autoInFasciaDiPrezzo(double min, double max){
        if(numeroAuto>0){
            int j = 0;
            for (int i = 0; i < numeroAuto; i++) {
                if(automobili[i].getPrezzo() >= min && automobili[i].getPrezzo() <= max){
                    j++;
                }
            }
            Automobile[] a = new Automobile[j];
            for (int i = 0; i < j; i++) {
                if(automobili[i].getPrezzo() >= min && automobili[i].getPrezzo() <= max){
                    a[i] = automobili[i];
                }
            }
            return a;
        }
        return null;
    }

    public double calcolaValoreTotaleInventario(){
        if(numeroAuto > 0){
            double somma = 0;
            for (int i = 0; i < numeroAuto; i++) {
                somma += automobili[i].getPrezzo(); 
            }
            return somma;
        }
        return 0;
    }

    public double calcolaPrezzoVendita(Automobile auto){
        return auto.getPrezzo() * (1 + percentualeGuadagno / 100); 
    }

    
    public static int getNumeroConcessionariCreati() {
        return numeroConcessionariCreati;
    }
    public static void setPercentualeGuadagno(double value) {
        percentualeGuadagno = value;
    }
    public static double getPercentualeGuadagno() {
        return percentualeGuadagno;
    }
    
    public static void stampaStatisticheSistema(){
        System.out.println("Concessionari aperti: " + getNumeroConcessionariCreati());
        System.out.println("Numero totale auto: " + Automobile.getTotaleAutoCreate());
    }

}

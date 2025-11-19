public class Abbonamento {
    private String nomeCliente;
    private String cognomeCliente;
    private String tipoAbbonamento;
    private int durataGiorni;
    private double prezzoBase;
    private String codiceAbbonamento;

    private static int numeroAbbonatiCreati = 0;
    private static double costoGiornaliero;
    private static double tassaIscrizione;

    public Abbonamento(String nomeCliente, String cognomeCliente, String tipoAbbonamento,int durataGiorni, double prezzoBase, String codiceAbbonamento) {
        this.nomeCliente = nomeCliente;
        this.cognomeCliente = cognomeCliente;
        this.tipoAbbonamento = tipoAbbonamento;
        this.durataGiorni = durataGiorni;
        this.prezzoBase = prezzoBase;
        this.codiceAbbonamento = codiceAbbonamento;

        numeroAbbonatiCreati++;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getCognomeCliente() {
        return cognomeCliente;
    }

    public void setCognomeCliente(String cognomeCliente) {
        this.cognomeCliente = cognomeCliente;
    }

    public String getTipoAbbonamento() {
        return tipoAbbonamento;
    }

    public void setTipoAbbonamento(String tipoAbbonamento) {
        this.tipoAbbonamento = tipoAbbonamento;
    }

    public int getDurataGiorni() {
        return durataGiorni;
    }

    public void setDurataGiorni(int durataGiorni) {
        this.durataGiorni = durataGiorni;
    }

    public double getPrezzoBase() {
        return prezzoBase;
    }

    public void setPrezzoBase(double prezzoBase) {
        this.prezzoBase = prezzoBase;
    }

    public String getCodiceAbbonamento() {
        return codiceAbbonamento;
    }

    public void setCodiceAbbonamento(String codiceAbbonamento) {
        this.codiceAbbonamento = codiceAbbonamento;
    }

    public static int getNumeroAbbonatiCreati() {
        return numeroAbbonatiCreati;
    }

    public static double getCostoGiornaliero() {
        return costoGiornaliero;
    }

    public static void setCostoGiornaliero(double costoGiornaliero) {
        Abbonamento.costoGiornaliero = costoGiornaliero;
    }

    public static double getTassaIscrizione() {
        return tassaIscrizione;
    }

    public static void setTassaIscrizione(double tassaIscrizione) {
        Abbonamento.tassaIscrizione = tassaIscrizione;
    }

    public double calcolaCostoTotale() {
        return durataGiorni * costoGiornaliero + tassaIscrizione;
    }

    @Override
    public String toString() {
        return "Abbonamento {" +
                "nomeCliente='" + nomeCliente + '\'' +
                ", cognomeCliente='" + cognomeCliente + '\'' +
                ", tipoAbbonamento='" + tipoAbbonamento + '\'' +
                ", durataGiorni=" + durataGiorni +
                ", prezzoBase=" + prezzoBase +
                ", codiceAbbonamento='" + codiceAbbonamento + '\'' +
                '}';
    }
}

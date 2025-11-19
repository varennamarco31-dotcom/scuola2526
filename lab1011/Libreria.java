package lab1011;

public class Libreria {
    // private String nome;
    // private String indirizzo;
    private Libro[] libri;
    private int numeroLibri;

    public Libreria(String nome, String indirizzo, int max){
        // this.nome = nome;
        // this.indirizzo = indirizzo;
        this.libri = new Libro[max];
        this.numeroLibri = 0;        
    }

    public void aggiungiLibro(Libro libro,int max){
        if(numeroLibri < max ){
            libri[numeroLibri] = libro;
            numeroLibri++;
        }else{
            System.out.println("libreria piena");
        }
    }

    public void visualizzaTuttiLibri(){
        for (int i = 0; i < numeroLibri; i++) {
            System.out.println(libri[i].toString());
        }
    }

    public Libro cercaLibroPerTitolo(String s){
        for (int i = 0; i < numeroLibri; i++) {
            if(s.equalsIgnoreCase(libri[i].getTitolo())){
                return libri[i];
            }
        }
        return null;
    }

    public Libro[] elencoLibriPerAutore(String s){
        Libro[] sa = new Libro[numeroLibri];
        int j = 0;
        if(numeroLibri != 0){
            for (int i = 0; i < numeroLibri; i++) {
                if(s.equalsIgnoreCase(libri[i].getAutore())){
                    sa[j] = libri[i];
                    j++;
                }
            }
            }
        Libro[] ris = new Libro[j];
        for (int i = 0; i < j; i++) {
            ris[i] = sa[i];
        }
        return ris;
    }   

    public Libro libroConPiuPagine(){
        Libro l = null;
        for (int i = 1; i < numeroLibri; i++) {
            if(libri[i].getNumeroPagine() > libri[i-1].getNumeroPagine()){
                l = libri[i];
            }
        }
        return l;
    }

    public double mediaPagine(){
        double media = 0;
        for (int i = 0; i < numeroLibri; i++) {
            media += libri[i].getNumeroPagine();
        }
        media /= numeroLibri;
        return media;
    }

}

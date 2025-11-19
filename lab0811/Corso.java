package lab0811;

public class Corso {

    private int lmax;
    // private String nomeCorso;
    // private String nomeDocente;
    // private int cfu; 
    private Studenti[] studenti;
    private int cont;

    public Corso(String nomeCorso, String nomeDocente, int cfu, int lmax){
        // this.nomeCorso = nomeCorso;
        // this.nomeDocente = nomeDocente;
        // this.cfu = cfu;
        this.lmax = lmax;
        this.studenti = new Studenti[lmax]; 
        this.cont = 0;  
    }

    public void aggiungiStudente(Studenti studente){
        if(cont >= lmax){
            System.out.println("Array pieno!");
        } else {
            this.studenti[cont] = studente;
            cont++;
        }
    }

    public int[] elencoMatricole(){
        int[] a = new int[cont];
        for (int i = 0; i < cont; i++) {
            a[i] = studenti[i].getMatricola();
        }
        return a;
    }
    
    public Studenti[] elencoStudentiConMatricolaMaggiore(int k){
        int count = 0;
        for (int i = 0; i < cont; i++) {
            if (studenti[i].getMatricola() > k) {
                count++;
            }
        }

        Studenti[] result = new Studenti[count];
        int index = 0;
        for (int i = 0; i < cont; i++) {
            if (studenti[i].getMatricola() > k) {
                result[index++] = studenti[i];
            }
        }
        return result;
    }

    public boolean esisteStudente(String nome, String cognome){
        for (int i = 0; i < cont; i++) {
            if (studenti[i] != null &&
                studenti[i].getNome().equals(nome) &&
                studenti[i].getCognome().equals(cognome)) {
                return true;
            }
        }
        return false;
    }
}

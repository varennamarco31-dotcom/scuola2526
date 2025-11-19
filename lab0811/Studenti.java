package lab0811;

public class Studenti {
    private String nome;
    private String cognome;
    private int matricola;

    public Studenti(String nome, String cognome, int matricola){
        this.nome = nome;
        this.cognome = cognome;
        this.matricola = matricola;
    }

    public String getNome() { 
        return nome; 
    }
    public String getCognome() {
         return cognome; 
    }
    public int getMatricola() {
         return matricola; 
    }

    public void setNome(String nome) {
         this.nome = nome;
    }
    public void setCognome(String cognome) { 
        this.cognome = cognome; 
    }
    public void setMatricola(int matricola) { 
        this.matricola = matricola; 
    }

}

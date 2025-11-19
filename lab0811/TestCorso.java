package lab0811;

public class TestCorso {
    public static void main(String[] args) {

        Studenti s1 = new Studenti("Mario", "Rossi", 1001);
        Studenti s2 = new Studenti("Luca", "Bianchi", 1005);
        Studenti s3 = new Studenti("Anna", "Verdi", 999);

        Corso corso1 = new Corso("programmazione java", "prof. esposito", 9, 10);
        Corso corso2 = new Corso("basi di dati", "prof.ssa neri", 6, 10);

        corso1.aggiungiStudente(s1);
        corso1.aggiungiStudente(s2);
        corso1.aggiungiStudente(s3);

        corso2.aggiungiStudente(s2);
        corso2.aggiungiStudente(s3);

        System.out.println("elenco matricole del corso 1:");
        int[] matricole = corso1.elencoMatricole();
        for (int m : matricole) {
            System.out.println(m);
        }

        System.out.println("\nstudenti del corso 1 con matricola > 1000:");
        Studenti[] filtrati = corso1.elencoStudentiConMatricolaMaggiore(1000);
        for (Studenti s : filtrati) {
            System.out.println(s.getNome() + " " + s.getCognome() + " (" + s.getMatricola() + ")");
        }

        System.out.println("\nesiste lo studente 'mario rossi'? " + corso1.esisteStudente("Mario", "Rossi"));
        System.out.println("esiste lo studente 'giulia neri'? " + corso1.esisteStudente("Giulia", "Neri"));

        System.out.println("\ntest aggiunta oltre il limite:");
        Corso corsoPiccolo = new Corso("corso di test", "prof. demo", 3, 2);
        corsoPiccolo.aggiungiStudente(s1);
        corsoPiccolo.aggiungiStudente(s2);
        corsoPiccolo.aggiungiStudente(s3);
    }
}
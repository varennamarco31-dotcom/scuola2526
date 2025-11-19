package lab1011;

public class ContoCorrente {
    private String numero;
    private String nome;
    private double saldo;
    private double tasso;

    private static int cont = 0; 

    public ContoCorrente(String numero, String nome, double saldo) {
        this.numero = numero;
        this.nome = nome;
        this.saldo = saldo;
        this.tasso = 0;
        cont++;
    }

    public ContoCorrente(String numero, String nome) {
        this.numero = numero;
        this.nome = nome;
        this.saldo = 0;
        this.tasso = 0;
        cont++;
    }

    public ContoCorrente(String numero, String nome, double saldo, double tasso) {
        this.numero = numero;
        this.nome = nome;
        this.saldo = saldo;
        this.tasso = tasso;
        cont++;
    }

    public void deposita(double x) {
        this.saldo += x;
        System.out.println("deposito ok");
    }

    public void preleva(double x) {
        if (verificasaldo(x)) {
            this.saldo -= x;
            System.out.println("prelievo ok");
        } else {
            System.out.println("saldo no");
        }
    }

    public void stampasaldo() {
        System.out.println("saldo: " + this.saldo);
    }

    public void stampadettagli() {
        System.out.println("conto: " + this.numero);
        System.out.println("nome: " + this.nome);
        System.out.println("saldo: " + this.saldo);
        System.out.println("tasso: " + this.tasso);
    }

    public double getsaldo() {
        return this.saldo;
    }

    public String getnumero() {
        return this.numero;
    }

    public String getnome() {
        return this.nome;
    }

    public void bonifico(ContoCorrente d, double x) {
        if (verificasaldo(x)) {
            this.saldo -= x;
            d.saldo += x;
            System.out.println("bonifico ok");
        } else {
            System.out.println("saldo no");
        }
    }

    public void applicainteressi() {
        if (this.saldo > 0 && this.tasso > 0) {
            double i = this.saldo * this.tasso / 100;
            this.saldo += i;
            System.out.println("interessi ok");
        }
    }

    private boolean verificasaldo(double x) {
        return this.saldo >= x;
    }

    public static int getCont() {
        return cont;
    }

    public static void stampanconti(){
        System.out.println("hai creato " + getCont() + "conti");
    }
}
import java.util.Scanner;

public class casa2909 {

    public static double arearett (double b,double h) {
        return b * h ;
    }

    public static int sommarr (int a[]){
        int somma = 0;
        for (int i = 0; i < a.length; i++) {
            somma += a[i];
        }
        return somma;
    }

    public static boolean nprimi(int x){
        if (x<= 1){
            return false;
        } 
        for (int i = 2; i < x/2; i++ ){
            if(x %  i == 0){
                return false;
            }
        } 
        return true;
    }

    public static int nvarr(int x,int a[]){
        int n = 0;
        for (int i = 0; i < a.length; i++) {
            if(x == a[i]){
                n++;
            }
        }
        return n;
    }

    public static double acerchio(double raggio){
        return raggio * raggio * 3.14;
    }

    public static double aquadrato(double lato){
        return lato * lato;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crea un metodo che calcola l'area di un rettangolo e testalo nel main con valori inseriti dall'utente.

        System.out.println("inserisci la base del triangolo");
        double base = scanner.nextDouble();
        System.out.println("inserisci l'altezza del triangolo");
        double altezza = scanner.nextDouble();
        System.out.println("l'area del rettangolo con i dati inseriti e': "+ arearett(base,altezza));
        
        // Scrivi un metodo che riceve un array di interi e ritorna la somma di tutti gli elementi.

        int[] array1 = {1,2,3,4};
        int sum = sommarr(array1);
        System.out.println("la somma dei valori nell array e': " + sum );

        // Crea un metodo che verifica se un numero è primo. Testalo con un ciclo che controlla i numeri da 1 a 20.

        for (int i = 0; i < 20; i++) {
            if(nprimi(i)){
                System.out.println(i);
            }
        }
        
        // Scrivi due metodi overloaded per calcolare l'area: uno per il cerchio (raggio) e uno per il quadrato (lato).
            
        System.out.println("inserisci raggio del cerchio");
        double r = scanner.nextDouble();
        System.out.println("inserisci lato del quadrato");
        double l = scanner.nextDouble();
        
        System.out.println("area del cerchio con r inserito: "+ acerchio(r));
        System.out.println("area del cerchio con l inserito: "+ aquadrato(l));

        // Crea un metodo che riceve un array e un numero, e conta quante volte il numero appare nell'array.

        System.out.println("inserisci il numero da controllare ");
        int numero = scanner.nextInt();
        int[] array2 = {9,8,2,5,9};

        System.out.println("il numero da cercare appare " + nvarr(numero,array2) + " volter");

        scanner.close();
    }
}

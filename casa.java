import java.util.Scanner;

public class casa {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        // Dichiara un array di 10 numeri, riempilo con i primi 10 numeri pari e stampali usando enhanced for.

        int[] array1 = new int[10];

        for ( int i = 0; i < 10; i++) {
            array1[i] = (i+1) * 2 ; 
        }
        for (int numero : array1){
            System.out.println(numero);
        } 

        // Leggi 8 voti da tastiera, salvali in un array e calcola la media.

        int[] array2 = new int[8];
        int somma = 0; 
        for (int i = 0; i < array2.length; i++) {
            array2[i] = scanner.nextInt();
            somma += array2[i];
        }    
        somma /= 8;
        System.out.println("media: " + somma);

        // Crea un array di 6 nomi, riempilo e poi stampa solo i nomi che iniziano con 'A'.

        String[] array3 = {"Mattia","Luca","Andrea","Giovanni","Alessandro","Daniele"};

        for (int i = 0; i < array3.length; i++) {
            if (array3[i].charAt(0) == 'A') {
                System.out.println(array3[i]);
            }
        }

        // Leggi 5 numeri in un array, trova e stampa il numero maggiore e la sua posizione.

        int[] array4 = new int[5];
        array4[0] = scanner.nextInt();
        int max = array4[0];
        int mi = 0;

        for (int i = 1; i < array4.length; i++) {
            array4[i] = scanner.nextInt();
            if(array4[i] > max){
                max = array4[i];
                mi = i;
            }
        }
        System.out.println("massimo: " + max + " in indice " + mi);

        // Crea un array di temperature della settimana, riempilo e conta quante temperature sono sopra i 20 gradi.

        double[] array5 = {15.2, 25.6, 21.9};
        int ts = 0;

        for (int i = 0; i < array5.length; i++){
            if(array5[i] > 20.0){
                ts++;
            }
        }
        System.out.println("nell array ci sono "+ ts + " temperature maggiori di 20");

        // Leggi 10 numeri in un array e stampali in ordine inverso.

        int[] array6 = new int[10];

        for (int i = 0; i < array6.length; i++) {
            array6[i] = scanner.nextInt();
        }
        for(int i = array6.length-1; i >= 0; i--) {
            System.out.println(array6[i]);
        }
        
        // Crea un array di 7 giorni della settimana e un array di 7 temperature. Stampa il giorno più caldo.

        String[] array7 = {"Lunedi","Martedi","Mercoledi","Giovedi","Venerdi","Sabato","Domenica"};
        double[] array8 = {17.2, 18.3, 19.5, 20.1, 21.7, 22.4, 23.0};
        double mtem = array8[0];
        int mtemi = 0;

        for (int i = 1; i < array8.length; i++) {
            if(mtem < array8[i]){
                mtem = array8[i];
                mtemi = i;
            }
        }
        System.out.println(array7[mtemi]);

        // Leggi numeri da tastiera fino a quando l'utente inserisce 0, salvali in un array (max 20 elementi) e poi stampali.

        int[] array9 = new int[20];

        System.out.println("inserisci il primo numero (0 per stoppare)");
        int num = scanner.nextInt();
        int p = 0;

        while (num != 0 && p < 20 ){
            array9[p] = num; 
            p++;
            if (p < 20) {
                System.out.println("inserisci un altro numero (0 per fermare, max 20 numeri):");
                num = scanner.nextInt();
            }
        }  
        for (int i = 0; i < p; i++){
            System.out.println(array9[i]);
        } 

        // Crea due array di 5 numeri ciascuno, riempili e crea un terzo array con la somma elemento per elemento.

        int[] array10 = {1,2,3,4,5};
        int[] array11 = {5,4,3,2,1};
        int[] array12 = new int[5];
        
        for (int i = 0; i < array12.length; i++) {
            array12[i] = array10[i] + array11[i]; 
            System.out.println(array12[i]); 
        }
        
        scanner.close();
    }
}

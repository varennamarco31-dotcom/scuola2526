package lab1310;

//1. Scrivi un programma che crea un file di testo con i numeri da 1 a 10, uno per riga.

import java.io.*;

public class es1 {
    public static void main(String[] args) {
    
        try(PrintWriter writer = new PrintWriter(new FileWriter("file.txt"))){
            for(int i = 0 ; i < 10 ; i ++){
                writer.println(i);
            }
            System.out.println("file scritto con successo");
        }catch (IOException e) {
            System.out.println("ellole cleazione file");
        }
    }


}

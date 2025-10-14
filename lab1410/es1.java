package lab1410;

import java.util.Scanner;
import java.io.*;

public class es1 {
    public static void main(String[] args) {

        int l = 0;

        try (Scanner fscanner = new Scanner(new File("/workspaces/scuola2526/lab1410/file.txt"))){
            
            while (fscanner.hasNext()){
                fscanner.next();
                l++;
            }
        } catch (IOException e) {
            System.err.println("file non trovato");
        } catch (Exception e){
            System.err.println("errore nella lettura");
        }
        
        try (PrintWriter writer = new PrintWriter(new FileWriter("/workspaces/scuola2526/lab1410/file2.txt"))){
            writer.println("nel primo file ho letto " + l + " parole");
            System.out.println("nel primo file ho letto " + l + " parole");
        } catch (IOException e) {
            System.err.println("errore nella scrittura del file");        
        }

    }
}

package lab1310;

import java.io.*;
import java.util.Scanner;

public class es2 {
     public static void main(String[] args) {
    
        try(Scanner scannerfile = new Scanner(new File("file.txt"))){
            int somma = 0;
            int l = 0;

            while(scannerfile.hasNextInt()){
                int num = scannerfile.nextInt();
                somma += num;
                l++;
            }

            if (l > 0){
                Double media = (double) somma / l;
                System.out.println("somma dei numeri: " + somma);
                System.out.println("media dei numeri: " + media);
            }

        }catch (FileNotFoundException e) {
            System.out.println("file inesistentte");
        }
    }
}

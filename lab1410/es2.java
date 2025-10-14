package lab1410;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class es2 {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,0};

        try (PrintWriter writer = new PrintWriter(new FileWriter("/workspaces/scuola2526/lab1410/file3.txt"))){
            for (int i = 0; i < arr.length; i++) {
                writer.print(arr[i] + " ");
            }
        } catch (IOException e) {
            System.err.println("errore in scrittura");
        }

        int[] arr2 = new int[arr.length];
        int f = 0;

        try (Scanner fscanner = new Scanner(new File("/workspaces/scuola2526/lab1410/file3.txt"))){
            while (fscanner.hasNextInt()) {
            arr2[f] = fscanner.nextInt();
            f++;    
            }
        } catch (Exception e) {
            System.err.println("errore in lettura ");
        }

        boolean aa = true; 
        for (int i = 0; i < arr2.length; i++) {
            if (arr[i] != arr2[i]){
                aa = false;
            }
        }

        if(aa){
            System.out.println("gli array sono identici");
        }else{
            System.out.println("gli array sono diversi");
        }

    }
}

package lab0710;

import java.util.Scanner;

public class passwordcheck{

    public static boolean password(String p){
        
        if (p.length() < 8){
            System.out.println("password corta");
            return false;
        }

        boolean num = false;
        boolean let = false;
        boolean mai = false;
        boolean min = false;
        boolean cas = false;
        String cs = "!@-_&%$";

        for (int i = 0; i < p.length(); i++) {
            char c = p.charAt(i);
            if(Character.isDigit(c)){
                num = true;
            }
            if(Character.isLetter(c)){
                let = true;
            }
            if(Character.isUpperCase(c)){
                mai = true;
            }
            if(Character.isLowerCase(c)){
                min = true;
            }
            if(cs.indexOf(c) != -1){
                cas = true;
            }
        }

        if(num && let && mai && min && cas){
                return true;
            }else{
                return false;
            }
    }

    public static void main(String[] args ){
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci la password che si vuole controllare");
        String pass = scanner.nextLine();
        if(password(pass)){
            System.out.println("password valida");
        }else{
            System.out.println("password invalida");
        }

        scanner.close();
    }

}
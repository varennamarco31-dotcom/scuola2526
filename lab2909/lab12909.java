package lab2909;

import java.util.Scanner;

public class lab12909 {

    public static void menu() {
        System.out.println("scelta 1");
        System.out.println("scelta 2");
        System.out.println("scelta 3");
        System.out.println("scelta 0");
    }

    public static boolean scelta(int sc) {
        if (sc == 0){
            return false;
        }else{
            switch (sc) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                default:
                    System.out.println("valore invalido");
                    break;
            }
            return true;
        } 

    }
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int s;

        do {
            menu();
            s = scanner.nextInt();
        } while (scelta(s));

        scanner.close();
    }
}

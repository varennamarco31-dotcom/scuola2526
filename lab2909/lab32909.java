package lab2909;

import java.util.Scanner;

public class lab32909 {

    public static double celsius(double t){
        return t * 9/5 + 32; 
    }

    public static double fahr(double t){
        return (t - 32) * 5/9;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. C -> F");
        System.out.println("0. F -> C");

        boolean scelta = scanner.nextBoolean();
        System.out.println("inserisci la temperatura da trasformare");
        double temp = scanner.nextDouble();

        switch (scelta) {
            case true:
                System.out.println("temperatura traformata in fahr: " + celsius(temp));
                break;
            case false: 
                System.out.println("temperatura traformata in celsius: " + fahr(temp));
                break;
            default:
                System.out.println("valore indefiniuto");
                break;
        }

    }
}

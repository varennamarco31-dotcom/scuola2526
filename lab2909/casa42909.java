package lab2909;

public class casa42909 {

    public static String larray(String a[]){
        String ma = a[0];

        for (int i = 1; i < a.length; i++) {
            if (ma.length() < a[i].length()) {
                ma = a[i];
            }
        }
        return ma;
    }
    
    public static void main(String[] args) {
        
        String[] array = {"ciao","come","stai?"};

        System.out.println("la stringa piu lunga nell' array e': " + larray(array));
    }
}

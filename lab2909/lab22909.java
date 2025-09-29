package lab2909;

public class lab22909 {

    public static boolean aequal(int a1[],int a2[]){
        if(a1.length != a2.length){
            System.out.println("array di dimensione differente");
            return false;
        }else{
            for (int i = 0; i < a2.length; i++) {
                if (a1[i] != a2[i]){
                    return false;
                } 
            }
            return true;
        }
    }

    public static void main(String[] args) {
        
        int[] array1 = {1,2,3};
        int[] array2 = {2,3,4};

        aequal(array1,array2);

    }
}

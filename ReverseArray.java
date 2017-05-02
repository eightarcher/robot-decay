import java.io.*;
import java.util.*;


public class ReverseArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }
        in.close();
        revArray(arr);


        System.out.println(Arrays.toString(arr));
    }

    public static void revArray(int[] ar){
        for( int j = ar.length - 1; j >= 0; j--){
            System.out.print(ar[j] + " ");

        }
        System.out.println("");

    }


}
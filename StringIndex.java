import java.io.*;
import java.util.*;

public class StringIndex {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for( int i = 0; i < T; i++) {
            String sc = in.next();
            strChop(sc);
        }
//        do{
//            String sc = in.next();
//        }
//        while (i<T);
    }

    public static void strChop(String hash){
        String odd = "";
        String even = "";
        for(int j = 0; j < hash.length();j++){

            if (j % 2 == 0) {
                even = even + hash.charAt(j);
            }
            else odd = odd + hash.charAt(j);
        }
        System.out.println(even + " " + odd);
    }
}
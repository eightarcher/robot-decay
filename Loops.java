import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Loops {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        loop(n);
    }

    public static void loop(int mult){
        for( int i = 1; i <= 10; i++){
            int result = i * mult;
            System.out.println( mult + " x " + i + " = " + result);
        }

    }




}

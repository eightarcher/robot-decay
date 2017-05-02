import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class gradingStudents {

    static int solve(int[] grades) {
        // Complete this function
        for (int i = 0; i < grades.length; i++) {
            int gT = ((grades[i] / 10) * 10);
            //System.out.println(gT);
            int gO = (grades[i] - gT);
            //System.out.println(gO);
            if (grades[i] < 38) {
                System.out.println(grades[i]);
                //break;
            }
            else if ((gO >= 3) && (gO < 5)) {
                System.out.println(gT + 5);
                //break;
            }
            else if ((gO >= 8) && (gO <= 9)) {
                System.out.println(gT + 10);
                //break;
            } else System.out.println(grades[i]);
        }

        return (42);
    }



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }
        int result = solve(grades);
        //System.out.println(result);
    }
}
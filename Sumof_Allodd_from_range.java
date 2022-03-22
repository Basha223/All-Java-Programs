//Write a JAVAprogram to find sum of all odd numbers between 1 to n.
import java.util.*;
 
public class Sumof_Allodd_from_range {
    public static void main(String args[]) {
        int N, i, sum = 0;
 
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number limit:");
        N = in.nextInt();
 
        for(i = 0; i <= N; i++){
            if((i%2) == 1){
                sum += i;
            }
        }
     
        System.out.print("Sum of all odd numbers between 0 to " + N + " = " + sum);
    }
}
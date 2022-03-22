//Write a JAVAprogram to print all odd number between 1 to 100.

import java.util.Scanner;

public class Print_odd_from1ton{
    public static void main(String[] args){
        int i=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Limit:");
        int number=sc.nextInt();
        System.out.print("Lit of odd numbers: ");  
        while(i<=number){
            System.out.println(i+"");
           
           i= i+2;
            
        }
        
    }
}
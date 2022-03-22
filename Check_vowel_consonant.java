//8. Write a JAVAprogram to input any alphabet and check whether it is vowel or consonant.---
import java.util.Scanner;
public class Check_vowel_consonant {

    public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
        System.out.println("Enter A Character:");
        char ch =sc.next().charAt(0);
        
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
            System.out.println(ch + " is vowel");
        else
            System.out.println(ch + " is consonant");

    }
}
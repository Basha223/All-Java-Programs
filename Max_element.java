//Write a JAVAprogram to find maximum element in an array.
import java.util.Scanner;
class Max_element{
    public static void main(String[] args){
        int n,max;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");  
        n=sc.nextInt();
        int array[]=new int[n];
        System.out.println("Enter the elements of the array: ");  
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
            
        }
        System.out.println("Array Elements are:");
        for(int i=0;i<n;i++){
            System.out.println(array[i]);
        }
        System.out.println("Maximum Element in an array is:");
        max=array[0];
        for(int i=0;i<array.length;i++){
            if(array[i]>max){
                max=array[i];}
                
            }
            System.out.println(max);
        }
    
}
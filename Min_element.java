//Write a JAVAprogram to find minimum element in an array.
import java.util.Scanner;
class Min_element{
    public static void main(String[] args){
        int n,min;
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
        System.out.println("Minimum Element in an array is:");
        min=array[0];
        for(int i=0;i<array.length;i++){
            if(array[i]<min){
                min=array[i];
                
            }
                
            }
            System.out.println(min);
        }
    
}
//Write a JAVAprogram even and odd elements in an array.
import java.util.Scanner;
class Even_odd_elements_Array{
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
        
        System.out.println("Even Numbers in An Array:");
        for(int i=0;i<array.length;i++){
            if(array[i]%2==0){
                System.out.println(array[i]);
            }
               System.out.println("odd Numbers in An Array:");
        for(i=0;i<array.length;i++){
            if(array[i]%2!=0){
                System.out.println(array[i]);
            }
        }
    }
}
}

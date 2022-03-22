/*Sample Input 1:
5
20 20 1 20 3
20 20 20 20 20
20 20 20 20 20
20 20 20 20 20
6 20 3 20 20
Sample Output 1:
Yes
Sample Input 2:
5
20 20 1 20 3
20 20 20 20 20
20 20 12 20 20
20 20 20 20 20
6 20 3 20 20
Sample Output 2:
No*/
import java.util.Scanner;
import java.util.Scanner;
class Exercise12{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter array size");
        n=sc.nextInt();
        int arr[][] = new int[n][n];
        System.out.println("Enter array values");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<n;j++)
            {
                for(j=0;j<n;j++){
        if(arr[i][j]!=20 && arr[i][j]>10)
        {
            System.out.println("NO");
        }
            else
            {
             
               System.out.println("Yes");
            }
        }
            }
    }
}
}

/*Sample Input 1:
5
20 20 1 20 3
20 20 20 20 20
20 20 20 20 20
20 20 20 20 20
6 20 3 20 20
Sample Output 1:
4
Sample Input 2:
9
20 5 20 20 3 20 20 20 20
20 20 8 20 20 20 20 5 20
20 20 20 20 20 20 2 20 20
20 20 20 20 20 20 20 20 20
20 20 20 20 20 20 20 20 20
20 20 20 20 20 20 20 20 20
20 20 3 20 20 20 20 20 20
20 3 20 20 20 20 3 20 20
20 20 20 20 1 20 20 6 20
Sample Output 2:
10*/
import java.util.Scanner;
class Exercise13{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,count=0;
        System.out.println("Enter array size");
        n=sc.nextInt();
        int a[][] = new int[n][n];
        System.out.println("Enter array values");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        
        
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(a[i][j]!=20 && a[i][j]<10)
                    count++;
                    break;
            }
            
    }
        }
        
}
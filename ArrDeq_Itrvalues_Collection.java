/* Write a program to iterate through all elements in an ArrayDeque.Using iterator method
Prompt the user input from the terminal.
Sample Input: 12,31,6,23,90

Expected Output: 
ArrayDeque: [12, 31, 6, 23, 90]
The iterator values are: 
12
31
6
23
90 */

import java.util.*;
class ArrDeq_Itrvalues_Collection{
    public static void main(String args[]){
        ArrayDeque <Integer> au=new ArrayDeque();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter How Manyelements ");
       int n=sc.nextInt();
        System.out.println("Enter Values :");
        for(int i=0;i<n;i++){
        au.add(sc.nextInt());
        }
        System.out.println();
        System.out.println("Iterator Values Are ");
        for(Integer a:au){
            System.out.println(a);
        }
    }
}
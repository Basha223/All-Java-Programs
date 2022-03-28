/*Create an application having a Generic HashMap with Empcode as key and EmpName as value. Display only EmpNames as output. 
Prompt the user input from the terminal.

Sample Input: 
Enter Emp code:101
Enter Emp Name: Ram
Enter another student (y/n)?y
Enter Emp code:102
Enter Emp Name: Vaibhav
Enter another student (y/n)?y
Enter Emp code:103
Enter Emp Name: Priyanka
Enter another student (y/n)?n

Expected Output: 
Ram
Vaibhav
Priyanka*/
import java.util.*;
class HashMap_Task1{
    public static void main(String[] args){
        HashMap<Integer,String> map=new HashMap();
        Scanner sc=new Scanner(System.in);
        boolean lpa=true;
        do{
            System.out.println("Enter emp code:");
            int code=sc.nextInt();
            System.out.println("Enter Emp name:");
            String name=sc.next();
            System.out.println("Enter another student (y/n)?");
            String answer=sc.next();
            map.put(code,name);
            if(answer.equals("y")||answer.equals("Y")){
                continue;
            }else{
                break;
            }
            }while(lpa);
        /* for (Map.Entry m:map.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }*/
        for(Map.Entry m:map.entrySet()){
           // System.out.println(m.getKey()+" "+m.getValue());
            System.out.println(m.getValue());
        }
       
       }
}

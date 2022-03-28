/* class HDTV with the properties: 
•  Brandname 
•  Size 
Create another class having an ArrayList and add 3 objects of HDTV into it. 
Display HDTV objects in sorted order of size.(Use Comparator) 
Sample Output:
4000 Sony 20
2000 LG 26
3000 MI 27
1000 Samsung 28 */

import java.util.*;
 class HdTv{
    int cost;
    String brandname;
    int size;
    HdTv(int cost,String brandname,int size){
        this.cost=cost;
        this.brandname=brandname;
        this.size=size;
    }
}
// create the Comparator for comparing stock values
class StockComparator implements Comparator<HdTv>{
    public int compare(HdTv h1,HdTv h2)
    {
        if(h1.size==h2.size)
            return 0;
        else if(h1.size>h2.size)
           return 1;
         else 
           return -1;
    }
}
class HdtvStocks_Collection{
    public static void main(String args[]){
        ArrayList<HdTv> al=new ArrayList();
        al.add(new HdTv(3000,"MI",27));
        al.add(new HdTv(1000,"Samsung",28));
        al.add(new HdTv(2000,"LG",26));
        al.add(new HdTv(4000,"SONY",20));
        System.out.println("HdTv Stocks Are :");
        Collections.sort(al,new StockComparator());
        for(HdTv hd:al){
            System.out.println(hd.cost+" "+hd.brandname+" "+hd.size);
        }
    }
}
//Example for ArrayIndexOutOfBoundaryHandling
class ArrayIndexOutOfBoundaryHandling
{
    public static void main(String[] args){
        int a[]={12,13,14,15};
        try{
        System.out.print(a[4]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        for (int i = 0; i <= a.length; i++)
            System.out.println("Array elements are:"+a[i]);
        
    }
}
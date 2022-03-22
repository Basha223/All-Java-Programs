//sum of digits using static key word
class digits
{
    static void sum(long num)
	{
	int sum=0;
	    while(num!=0)
	    {
		sum+=num%10;
		num/=10;
	    }
	System.out.println("Sum of Digits:"+sum);
	}
}
class Sumofdigits_using_static{
    public static void main(String[] args){
        digits.sum(156);
    }
}

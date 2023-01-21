class Palindrome
{
	public static void main(String args[])
	{
	   int num=551,rev=0,rem;
	   int a=num;
	   while(num!=0)
	   {
         rem=num%10;
         rev=rev*10+rem;
	     num=num/10;
	   }
	   System.out.println(rev);

	   if(rev==a)
	   {
	   	 System.out.println(a+" is a palindrome number");
	   }
	   else
	   {
	   	 System.out.println(a+"is not a palindrome number");
	   }
	}
}

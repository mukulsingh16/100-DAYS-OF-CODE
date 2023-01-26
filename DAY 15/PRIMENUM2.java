class Primenum
{
	public static void main(String args[])
	{
	   int num=100;
	   boolean isprime=true;

	   for(int i=2;i<num;i++)
	   {
	     if(num%i==0)
	     {
	        isprime=false;
	     }
	   }

	   if(isprime==false)
	   {
	     System.out.println("not a prime number");
	   }

	   else
	   {
         System.out.println(" it is a prime number");

	   }
		}
}

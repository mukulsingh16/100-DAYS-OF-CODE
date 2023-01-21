class Count
{
	public static void main(String args[])
	{
	   int num=100,counteven=0,countodd=0;
	   for(int i=1;i<=100;i++)
	   {
	     if(i%2==0)
	     {
	       counteven++;
	     }

	     else
	     {
	       countodd++;
	     }
	   }

	   System.out.println("total even numbers are:-"+counteven);
	   System.out.println("total odd numbers are:-"+countodd);
	}
}

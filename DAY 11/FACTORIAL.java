class Factorial
{
	public static void main(String args[])
	{
	  int num=10,fact=1;
	  for(int i=num;i>=1;i--)
	  {
	    fact=fact*i;
	  }
	  System.out.println("the factorial of "+num+" is:-"+fact);
	}
}

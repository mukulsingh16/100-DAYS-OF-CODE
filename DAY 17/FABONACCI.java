class Fabonacci
{
	public static void main(String args[])
	{
	   int num=10,a=0,b=1,sum=0;
	   System.out.print(a+" "+b);
	   for(int i=3;i<=num;i++)
	   {
	      sum=a+b;
	      System.out.print(" "+sum);
	      a=b;
	      b=sum;
	      
	   }

	}
}

class ArgsSum
{
	public static void main(String args[])
	{
	   int sum=0;
	   for(int i=0;i<args.length;i++)
	   {
	       System.out.println(args[i]+" ");
	       int num=Integer.valueOf(args[i]);
	       sum=sum+num;
	   }
	   System.out.println("The sum is : "+sum);
	}
}

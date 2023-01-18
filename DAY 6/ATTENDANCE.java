class Test
{
	public static void main(String args[])
	{
	   float total=90f;
	   float attended=80f;
	   float per;

	   System.out.println("Total number of classes held="+total);
	   System.out.println("Total number of classes attended="+attended);

	   per=((attended/total)*100);
	   System.out.println("Percentage of total class attended="+per);

	   if(per>=75)
	   {
	      System.out.println("you are allowed to sit in a class");
	   }

	   else
	   {
	      System.out.println("you are not allowed to sit in a class");
	   }
	}
}

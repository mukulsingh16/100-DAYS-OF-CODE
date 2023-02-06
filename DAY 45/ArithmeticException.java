class Exceptioneg
{
	public static void main(String args[])
	{
	    try
	    {
	       int i=10,j=0;
	       int a=i/j;
	       System.out.println(a);
	    }
        catch(ArithmeticException obj)
        {
            System.out.println("cant divided by 0");
            System.out.println(obj.getMessage());
        }

        System.out.println("rest of our code");

       
	}
}

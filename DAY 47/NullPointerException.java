class Exceptioneg
{
	public static void main(String args[])
	{
	    
        try
        {
            String str=null;
            int n=str.length();
            System.out.println(n);
        }
        catch(NullPointerException obj)
        {
            System.out.println("it is a null pointer exception");
            System.out.println(obj.getMessage());
        }

        System.out.println("rest of our code");

      
	}
}

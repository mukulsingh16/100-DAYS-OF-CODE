class Exceptioneg
{
	public static void main(String args[])
	{
        try
        {
        	int num1=Integer.parseInt("1234");
        	System.out.println(num1);
        	int num=Integer.parseInt("1234kjhgf");
        	System.out.println(num);
        }
        catch(NumberFormatException obj)
        {
        	System.out.println("it is a Number Format Exception");
        	System.out.println(obj.getMessage());
        }

	}
}

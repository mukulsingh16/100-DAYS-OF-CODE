class Exceptioneg
{
	public static void main(String args[])
	{
        try
        {
            String str="hello mukul";
            System.out.println(str.length());
            char c= str.charAt(10);
            System.out.println(c);
            char z=str.charAt(100);
            System.out.println(z);
        }
        catch(StringIndexOutOfBoundsException obj)
        {
        	System.out.println("it is a string out of bounds exception");
        	System.out.println(obj.getMessage());
        }

        System.out.println("rest of our code");

	}
}

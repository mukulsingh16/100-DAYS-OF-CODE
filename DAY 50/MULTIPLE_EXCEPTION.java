class MultipleException
{
    public static void main(String args[])
    {
        try
        {
           int i=10,j=0;
           int a=i/j;
           System.out.println(a);

           String str=null;
           int n=str.length();
        }
        catch(ArithmeticException obj)
        {
           System.out.println(obj.getMessage());
           System.out.println("it is an arithmetic exception");
        }
        catch(NullPointerException obj)
        {
           System.out.println(obj.getMessage());
           System.out.println("it is an null pointer exception");
        }
        System.out.println("rest of code");
    }
}

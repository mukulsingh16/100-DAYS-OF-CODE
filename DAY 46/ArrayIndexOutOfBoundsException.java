class Exceptioneg
{
	public static void main(String args[])
	{
	   
        try
        {
            int arr[]=new int[5];
            arr[5]=90;
            System.out.println(arr[5]);
        }
        catch(ArrayIndexOutOfBoundsException obj)
        {
            System.out.println("array out of bound ");
            System.out.println(obj.getMessage());
        }

        System.out.println("rest of our code");

       
	}
}

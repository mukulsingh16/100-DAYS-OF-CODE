import java.util.Scanner;
class Test
{
	void Array()
	{
	    Scanner sc=new Scanner(System.in);
	    int arr[]=new int[5];
	    System.out.println("enter your array element");
	    for(int i=0;i<arr.length;i++)
	    {
           arr[i]=sc.nextInt();
	    }
        System.out.println("your array is:");
	    for(int i=0;i<arr.length;i++)
	    {
	       System.out.print(arr[i]+"at"+(i+1));
	    }
	}
}

class Userarray
{
	public static void main(String args[])
	{
       Test t=new Test();
       t.Array();

	}
}

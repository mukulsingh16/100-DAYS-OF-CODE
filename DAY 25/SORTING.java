import java.util.Scanner;
class Test
{
	void array()
	{
		Scanner sc=new Scanner(System.in);
		int temp=0;
        int myarr[]=new int[5];
        System.out.println("enter your array elements :");
		
		for(int i=0;i<myarr.length;i++)
		{
            myarr[i]=sc.nextInt();
		}
        System.out.println("your array is :");
		
		for(int i=0;i<myarr.length;i++)
		{
			System.out.print(myarr[i]+" ");
		}
		System.out.println("\n"+"your array after sorting is : ");
     
     for(int i=0;i<myarr.length;i++)
	   {
	   	   for(int j=i+1;j<myarr.length;j++)
	   	   {
	   	   	  if(myarr[i]>myarr[j])
	   	   	  {
	   	   	  	temp=myarr[i];
	   	   	  	myarr[i]=myarr[j];
	   	   	  	myarr[j]=temp;
	   	   	  }
	   	   }
	    }

	    for(int i=0;i<myarr.length;i++)
	    {
	    	System.out.print(myarr[i] +" ");
	    }
    }   
}

class Sorting
{
	public static void main(String args[])
	{
	   Test t=new Test();
       t.array();
	   
	}
}

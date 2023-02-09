import java.util.Scanner;
class Test
{
	void array(int arr[],int search)
	{
		boolean flag=false;
		Scanner sc=new Scanner(System.in);
	   for(int i=0;i<arr.length;i++)
	   {

	      System.out.print(arr[i]+ " ");
	      if(arr[i]==search)
	      {
	      	flag=true;
	      }
	   }
        System.out.println();
	   if(flag==true)
	   {
	   	System.out.println("element found \n");
	   }

	   else
	   {
	   	  System.out.println("element not found \n");
	   }
	   
	}
}

class ArrayInFunc
{
	public static void main(String args[])
	{
	   Test t=new Test();
	   Scanner sc=new Scanner(System.in);
	   int myarr[]={1,2,3,4,5,6,7,8,9};
       System.out.println("enter the element to be searched");
       int num=sc.nextInt();
       t.array(myarr,num);
       
    }
}

import java.util.Scanner;
class Array
{
	public static void main(String args[])
	{
       Scanner sc=new Scanner(System.in);
	   int marr[]={10,20,30,44};
	   int sum=0;
	   System.out.println("Our Array is: ");
	   for(int i=0;i<marr.length;i++)
	   {
	   System.out.print(" "+marr[i]);
	   if(marr[i]%2==0)
	   {
	   	  sum=sum+marr[i];
	   }
       }
       System.out.println("\n"+"Sum Of even number in an array is: "+sum);
    

}    
}

import java.util.Scanner;
class Array
{
	public static void main(String args[])
	{
       Scanner sc=new Scanner(System.in);
	   int marr[]={10,20,30,44};

   
    System.out.println("enter the element to be searched");
    int num= sc.nextInt();

    for(int i=0;i<marr.length;i++)
    {
        if(marr[i]==num)
        {
            System.out.println("element is found at postion "+(i+1));
        }
    }

}    
}

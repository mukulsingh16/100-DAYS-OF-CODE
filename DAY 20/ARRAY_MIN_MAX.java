import java.util.Scanner;
class Array
{
	public static void main(String args[])
	{
       Scanner sc=new Scanner(System.in);
	   int marr[]={10,20,30,44};
	
        int min,max;
       min=max=marr[0];
    
       for(int j=0;j<marr.length;j++)
       {
           if(marr[j]<min)
           {
           	min=marr[j];
           }

           if(marr[j]>max)

           {
           	max=marr[j];
           }
       }

        System.out.println("\n"+"minimmum value in an araay is : "+min);
        System.out.println("\n"+"maximum value in an araay is : "+max);
    }    
}

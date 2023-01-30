import java.util.Scanner;
class Array
{
	public static void main(String args[])
	{
       Scanner sc=new Scanner(System.in);
	   int marr[]={10,20,30,44};
	
        
        int s=marr.length;
        int newarr[]=new int[s+1];

        int newval=90;
        for(int k=0;k<s;k++)
        {
        	newarr[k]=marr[k];
        }

        newarr[s]=newval;

        // for(int k=0;k<newarr.length;k++)
        // {
        // 	 System.out.println(" "+newarr[k]);
        // }

        for(int item:newarr)
        	 System.out.println(" "+item);
    }

}    
}

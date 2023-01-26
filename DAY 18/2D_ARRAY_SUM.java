import java.util.Scanner;
class Twodarray
{
	public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int myarr[][]=new int [2][3];
	
	for(int i=0;i<2;i++)
	{
	   for(int j=0;j<3;j++)
	   {
	      myarr[i][j]=sc.nextInt();
	   }
	   System.out.println();
	}
	for(int i=0;i<2;i++)
	{
	   for(int j=0;j<3;j++)
	   {
	      System.out.print(myarr[i][j] +" ");
	   }
	   System.out.println();
	}

	int myarr2[][]=new int [2][3];

	for(int i=0;i<2;i++)
	{
		for(int j=0;j<3;j++)
		{
			myarr2[i][j]=sc.nextInt();
		}
		System.out.println();
	}

	for(int i=0;i<2;i++)
	{
		for(int j=0;j<3;j++)
		{
			System.out.print(myarr2[i][j] +" ");
		}
            System.out.println();
	}

    int addarray[][]=new int [2][3];

    

    for(int i=0;i<2;i++)
    {
    	for(int j=0;j<3;j++)
    	{
    	    
    	    addarray[i][j]=(myarr[i][j]+myarr2[i][j]);
    		
    	}
    	System.out.println();
    }
    System.out.println("Addition of two matrix is"+"\n");

    for(int i=0;i<2;i++)
    {
    	for(int j=0;j<3;j++)
    	{
    		System.out.print(addarray[i][j]+" ");
        }
    	System.out.println();
    }
}
}

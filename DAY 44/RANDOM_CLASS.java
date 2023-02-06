import java.util.Random;
class Randomcasting
{
	public static void main(String args[])
	{
	    int i=1;
	    Random n=new Random();
        while(i<=9)
        {
           for(int j=1;j<=2;j++)
           {
              int a='A'+n.nextInt(26);
              System.out.print((char)a);
           }

           for(int j=1;j<=2;j++)
           {
              int a=n.nextInt(9);
              System.out.print(a);
           }

           for(int j=1;j<=2;j++)
           {
              int a='a'+n.nextInt(26);
              System.out.print((char)a);
           }

           for(int j=1;j<=2;j++)
           {
              int a=n.nextInt(9);
              System.out.print(a);
           }
        System.out.println();
        i++;
        
        }
        int k=1;
        while(k<=10)
        {
            int a=n.nextInt(500);
            if(a>200)
            {
            	System.out.println(a);
            }
            System.out.println();
            k++;
        }
    }
}

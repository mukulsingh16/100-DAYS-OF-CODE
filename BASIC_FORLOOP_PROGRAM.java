class For
{
   public static void main(String args[])
   {
   	int i,j,sum=0,mul=1;
     System.out.println("the natural number upto 50:");
     
     for(i=1;i<=50;i++)
     {
       System.out.println(i);
     }
     
     System.out.println("the reverse of natural number upto 50:");
     
     for(i=50;i>=1;i--)
     {
       System.out.println(i);
     }
    
     System.out.println("the table of 2:");
     
     for(j=1;j<=10;j++)
     {
       int a=j*2;
       System.out.println("2X"+j+"="+a);
     }
      
     System.out.println("\n");
      
     for(i=1;i<=5;i++)
      {
      	sum=sum+i;
      }
     
     System.out.println("the sum upto 5 natural numbers ="+sum);
      System.out.println("\n");

      for(i=1;i<=5;i++)
      {
      	mul=mul*i;
      }
      System.out.println("the multiplication upto 5 natural numbers ="+mul);
   }
}

class While
{
	public static void main(String []args)
	{
       
       System.out.println("the natural number upto 50: \n");
	   int i=1;
	   while(i<=50)
	   {
	     System.out.println(i);
	     i++;
	   }
       
       System.out.println("the reverse of natural number upto 50: \n");
	   int j=50;
	   while(j>=1)
	   {
	   	 System.out.println(j);
	   	 j--;
	   }
	   
	   System.out.println("\n");
       System.out.println("the table of 2:");
	   int k=1,num;
	   while(k<=10)
	   {
          num=k*2;
          System.out.println("2"+"X"+k+"="+num);
          k++;
	   }

       System.out.println("\n");
       
       int l=1,sum=0;
       while(l<=5)
       {
         sum=sum+l;
       	 l++;
       }
       System.out.println("the sum of first 5 natural is:"+sum);
       System.out.println("\n");
       int m=1,mul=1;
       while(m<=5)
       {
       	 mul=mul*m;
       	 m++;
       }
       System.out.println("the sum of first 5 natural is:"+mul);
	}
}

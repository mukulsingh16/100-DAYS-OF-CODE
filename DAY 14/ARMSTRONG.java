class Armstrong 
{
	public static void main(String args[])
	{
	   int num=133,cube=0,rem;
	   int temp=num;
	   while(num!=0)
	   {
	   	
	     rem=num%10;
	     cube=cube+(rem*rem*rem);
	     num=num/10;
       }
       
       System.out.println("cube is="+cube);

       if(temp==cube)
       {
       	 System.out.println(temp+" is a armstrong number");
       }

       else
       {
       	  System.out.println(temp+" is not a armstrong number");
       }
	}
}

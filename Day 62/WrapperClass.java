class WrapperDemo
{
	public static void main(String args[])
	{
	    String a="100";
	    int num1=Integer.parseInt(a);
	    float num2=Integer.parseInt(a);
	    float num3=Integer.valueOf(a);
	    System.out.println(num1);
	    System.out.println(num2);
	    System.out.println(num3);
         
	    for(int i=0;i<args.length;i++)
	    {
	    	System.out.println(args[i]+" ");
	    	
	    }
	    
	}
}

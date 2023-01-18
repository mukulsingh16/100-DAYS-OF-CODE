// take age and weight from user and 
//		check if age is greater than equals to 18
		//and weight is greater than equals to 55
			// 	then only candidate can donate blood
		// otherwise not eligible
		// check also for underweight
    
    
class Test
{
	public static void main(String args[])
	{
	   int a=19,b=50;
	   if(a>=18 && b>=55)
	   {
          System.out.println("you are eligible to donate blood");
	   }
	   else
	   {
	      if(a<18)
	      {
	        System.out.println("you are under age");
	      }

	      else
	      {
	        System.out.println("you are under weight");
	      }
	   }
	}
}

class Test
{
	public static void main(String args[])
	{
	   int a=98,b=90,c=98,d=100,e=90;
	   float f;

	   f=(a+b+c+d+e)/5;
	   System.out.println("your average is"+f);

	   // and  check if avg >= 90 -> 'Grade A'
	//		 check if avg >= 75 -> 'Grade B'
	//		 check if avg >= 60 -> 'Grade C'
	//		 check if avg >= 40 -> 'Grade D'
	//		 check if avg < 40 -> 'Grade E'

	   if(f>=90)
	   {
	     System.out.println("grade A");
	   }
	   else if(f>=75)
	   {
	     System.out.println("grade B");
	   }
	   else if(f>=60)
	   {
	     System.out.println("grade C");
	   }
	   else if(f>=40)
	   {
	     System.out.println("grade D");
	   }
	   else if(f<40)
	   {
	     System.out.println("grade E");
	   }

	}
}

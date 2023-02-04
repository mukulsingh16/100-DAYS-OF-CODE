class First
{
	void first()
	{
	   System.out.println("class first");
	}

	void demo()
	{
       System.out.println("class first demo called");
	}
}

class Second extends First
{
	void second()
	{
	   System.out.println("class second");
	    super.first();
	}

	void demo()
	{
		System.out.println("class second demo called");
	}
       
}

class Singleinheritance
{
	public static void main(String args[])
	{
       Second s1=new Second();
       s1.second();
       s1.first();
       s1.demo();
	}
}

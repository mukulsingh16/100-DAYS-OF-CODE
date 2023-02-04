class First
{
	void first()
	{
	   System.out.println("first class called");
	}

	void demo()
	{
	   System.out.println("first class demo called");
	}
}

class Second extends First
{
	void second()
	{
	   System.out.println("second class called");
	}

	void demo()
	{
	   System.out.println("second class demo called");
	}
}

class Third extends First
{
	void third()
	{
	   System.out.println("third class called");
	}

	void demo()
	{
	   System.out.println("third class demo called");
	}
}

class Hierarchicalinheritance
{
	public static void main(String args[])
	{
	   Second s1=new Second();
	   s1.first();
	   s1.demo();
	   Third t1=new Third();
	   t1.first();
	   t1.demo();

	}
}

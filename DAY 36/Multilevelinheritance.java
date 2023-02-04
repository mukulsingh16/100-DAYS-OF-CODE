class First
{
	void first()
	{
	   System.out.println("class first called");
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
	   System.out.println("class second called");
	}

	void demo()
	{
	   System.out.println("second class demo called");
	}
}

class Third extends Second
{
	void third()
	{
	   System.out.println("class third called");
	}

	void demo()
	{
	   System.out.println("third class demo called");
	}
}

class Multilevelinheritance
{
    public static void main(String args[])
    {
	   Third t1=new Third();
	   t1.first();
	   t1.second();
	   t1.demo();
	   t1.third();
	}
}

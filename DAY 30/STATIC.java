class Test
{
	int var1=100;
	static int var2=40;

void func1()
{
	System.out.println("instance function called"+var2);
	System.out.println("instance function called"+var1);
}

static void func2()
{
	Test t1=new Test();
	System.out.println("static function called"+t1.var1);
	System.out.println("instance function called"+var2);
}
}

class Static 
{
    String name="mukul singh";
	public static void main(String args[])
	{
	   Test myobj=new Test();
	   Static n1=new Static();
	   System.out.println(myobj.var1);
	   System.out.println(Test.var2);
	   System.out.println(n1.name);
	   
	   myobj.func1();
	   Test.func2();
	}
}

abstract class A
{
	 void fun()
	{
	   System.out.println("this is a concrete method");
	}
	abstract void demo();
}

class B extends A
{
	public void demo()
	{
	   System.out.println("class a demo function called in class b");
	}
    void first()
	{
	   System.out.println("second class function called");
	}
    void second()
	{
	   System.out.println("second class function 2 called");
	}

}
class C extends A
{
	public void demo()
	{
	   System.out.println("class a demo function called in class c");
	}
}

class Abstract
{
	public static void main(String args[])
	{
	   B obj=new B();
	   C obj2=new C();

	   obj.demo();
	    obj2.demo();
	   obj.first();
	   obj.second();
	   obj.fun();
	}
}

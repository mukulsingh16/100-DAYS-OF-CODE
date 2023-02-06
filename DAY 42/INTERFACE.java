interface A
{
    int speed=90;
	void demo();
}

interface B
{
	void demo();
}
interface movable extends A,B
{
	int avgspeed=10;
	void move();
}
class vechicle implements movable
{
	public void move()
	{
	   System.out.println("average speed is = "+avgspeed);
	}

	public void demo()
	{
	   System.out.println("demo function calling from class A or class B");
	}
    
    public void demo2()
	{
	   System.out.println("demo 2 function called");
	}
}
class car implements A
{
	public void demo()
	{
	   System.out.println("speed is= "+speed);
	}
}

class Interface 
{
	public static void main(String args[])
	{
	   vechicle v1=new vechicle();
	   v1.move();
	   v1.demo();
	   v1.demo2();

	   A c1=new car();
	   c1.demo();

	}
}

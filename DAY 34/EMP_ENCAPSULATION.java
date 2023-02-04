class Test
{
	private int number;
	private String name;
	private String address;
	private int deptno;

	Test()
	{

	}

	Test(int number,String name,String address,int dept)
	{
	   this.number=number;
	   this.name=name;
	   this.address=address;
	   this.deptno=deptno;
	}

	private void show()
	{
	   System.out.println("number= "+number+" name= "+name+" address= "+address+" deptno= "+deptno);
	}

	public void setnumber(int number)
	{
	   this.number=number;
	}

	public void setnumber(String name)
	{
	   this.name=name;
	}

	public void setaddress(String address)
	{
	   this.address=address;
	}

	public void setdeptno(int deptno)
	{
	   this.deptno=deptno;
	}

	public int getnumber()
	{
	   return this.number;
	}

	public String getname()
	{
	   return this.name;
	}

	public String getaddress()
	{
	   return this.address;
	}

	public int getdeptno()
	{
	   return this.deptno;
	}

	public void demo()
	{
	   this.show();
	}
}

class Empencapsulation
{
	public static void main(String args[])
	{
	   Test t1=new Test(12134,"mukul","haridwar",1);
	   t1.demo();
	   Test t2=new Test();
       t2.setnumber(121);
       System.out.println("number= "+t2.getnumber());

	}
}

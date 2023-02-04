class Test
{
	private int id;
	private String name;
	private int number;
    Test()
    {

    }
    Test(int id,String name,int number)
    {
       this.id=id;
       this.name=name;
       this.number=number;
    }
    
    private void show()
    {
       System.out.println("id= "+id+  "name= "+name+  "number= "+number);
    }
    
    public int getid()
    {
      return this.id;
    }
    
    public String getname()
    {
      return this.name;
    }
    
    public int getnumber()
    {
      return this.number;
    }

    public void setid(int id)
    {
      this.id=id;
    }

    public void setname(String name)
    {
      this.name=name;
    }

    public void setnumber(int number)
    {
      this.number=number;
    }
    
    void demo()
    {
       this.show();
    }

}

class Encapsulation
{
	public static void main(String args[])
	{
	   Test t1=new Test(100,"mukul",12545);
	   t1.demo();
	   System.out.println("id= "+t1.getid());
	   t1.setid(180);
	   System.out.println("id= "+t1.getid());
     Test t2=new Test();
     t2.setname("gagan");
     
     System.out.println(t2.getname());

	}
}


class First
{
	synchronized void display(String msg)
	{
	   System.out.print("["+msg);
	   
	   try
	   {
	      Thread.sleep(1000);
	   }
       catch(InterruptedException e)
       {
          System.out.println(e.getMessage());
       }

       System.out.println("]");
	}
}

class Second extends Thread
{
	String msg;
	First fobj;
	Second (First fobj,String msg)
	{
	   this.fobj=fobj;
	   this.msg=msg;
	   start();
	}

	public void run()
	{
        fobj.display(msg);
	}
}

class Synchronised3
{
    public static void main(String args[])
    {
	First obj=new First();
	Second t1obj=new Second(obj,"welcome");
	Second t2obj=new Second(obj,"to");
	Second t3obj=new Second(obj,"national");
	Second t4obj=new Second(obj,"park");
	}
} 

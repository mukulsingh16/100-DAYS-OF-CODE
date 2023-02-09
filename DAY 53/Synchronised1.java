class Resource
{
	synchronized void disptable(int num)
	{
        for(int i=1;i<=5;i++)
        {
           System.out.println(num*i);
           
           try
           {
               Thread.sleep(1000);
           }
           catch(InterruptedException e)
           {
              System.out.println(e.getMessage());
           }
           
        }
	}
}

class Thread1 extends Thread
{
	Resource r1;
	Thread1(Resource r1)
	{
	   this.r1=r1;
	}

	public void run()
	{
	   r1.disptable(9);
	}
}

class Thread2 extends Thread
{
	Resource r1;
	Thread2(Resource r1)
	{
	   this.r1=r1;
	}

	public void run()
	{
	   r1.disptable(10);
	}
}

class Syncronized1
{
    public static void main(String args[])
    {
	Resource obj=new Resource();
	Thread1 t1obj=new Thread1(obj);
	Thread2 t2obj=new Thread2(obj);

	t1obj.start();
	t2obj.start();
	} 
}

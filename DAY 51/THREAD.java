class A extends Thread
{
	public void run()
	{
	   for(int i=1;i<=5;i++)
	   {
	       System.out.println("HELLO"+i);
	       try{
	       	Thread.sleep(1000);
	       }

	       catch(InterruptedException e)
	       {}
	   }
	}
}

class B extends Thread
{
	public void run()
	{
	    for(int j=1;j<=5;j++)
	    {
	        System.out.println("WORLD"+j);
	        try{
	       	Thread.sleep(1000);
	       }

	       catch(InterruptedException e)
	       {

	       }
	    }
	}
}

class ThreadEx
{
	public static void main(String args[])
	{
	    A obj1=new A();
	    B obj2=new B();
        
        

        obj1.start();

        try
        {
        	obj1.join();
        }
        catch(InterruptedException e)
        {}

        obj1.setName("thread1");
        System.out.println(obj1.getName());

        obj2.start();

        obj2.setName("thread2");
        System.out.println(obj2.getName());
    }
}

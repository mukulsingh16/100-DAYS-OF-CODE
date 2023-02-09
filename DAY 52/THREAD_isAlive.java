class MyThread extends Thread
{
	public void run()
	{
	   System.out.println("r1");
	   try
	   {
	       Thread.sleep(1000);
	   }
	   catch(InterruptedException e)
	   {}

	   System.out.println("r2");
	}
}

class ThreadIsAlive
{
	public static void main(String args[])
	{
	   MyThread m1=new MyThread();
	   MyThread m2=new MyThread();
	   m1.start();
	   System.out.println(m1.isAlive());
       m2.start();
       System.out.println(m2.isAlive());
	}
}

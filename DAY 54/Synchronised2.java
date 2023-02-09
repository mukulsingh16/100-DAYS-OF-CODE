class Message
{
	synchronized void showMessage(String msg)
	{
       for(int i=1;i<=5;i++)
       {
           System.out.println(msg+i);

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
	Message m1;
	Thread1(Message m1)
	{
	   this.m1=m1;
	}

	public void run()
	{
	   m1.showMessage("TCIL");
	}
}

class Thread2 extends Thread
{
	Message m1;
	Thread2(Message m1)
	{
	   this.m1=m1;
	}

	public void run()
	{
	   m1.showMessage("INSTIUTE");
	}
}

class synchronized2
{
	public static void main(String args[])
	{
	    Message obj=new Message();

	    Thread1 t1obj=new Thread1(obj);

	    Thread2 t2obj=new Thread2(obj);
	    t2obj.start();
	    t1obj.start();
	}
}

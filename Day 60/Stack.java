import java.util.*;
class Stack1
{
	public static void main(String args[])
	{
	   Stack<Integer> list=new Stack<Integer>();
	   list.push(100);
	   list.push(200);
	   list.push(300);
	   list.push(400);

	   System.out.println(list);
	   System.out.println(list.pop());
	   System.out.println(list);
	   System.out.println(list.peek());
	   System.out.println(list);

	   Iterator itr=list.iterator();
	   while(itr.hasNext())
	   {
	   	   System.out.println(itr.next());
	   }

	   System.out.println("enumeration printing");
	   Enumeration e=list.elements();
	   while(e.hasMoreElements())
	   {
	   	  System.out.println(e.nextElement());
	   }
	}
}

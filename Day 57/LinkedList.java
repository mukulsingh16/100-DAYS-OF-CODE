import java.util.*;
class Linkedlist
{
	public static void main(String args[])
	{
	   LinkedList<String> alist=new LinkedList<String>();

	   alist.add("abc");
	   alist.add("mango");
	   alist.add("1234");
	   alist.add("120.54");

	   alist.addFirst("first");
	   alist.addLast("last");
	   for(String abc:alist)
	   {
	   	System.out.println(abc);
	   }
	   System.out.println();

	   alist.remove(1);
       alist.removeFirst();
       alist.removeLast();

       Iterator itr=alist.iterator();
       while(itr.hasNext())
       {
          System.out.println(itr.next());
       }


	}
}

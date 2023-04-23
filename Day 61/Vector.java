import java.util.*;
class Vector1
{
	public static void main(String args[])
	{
	    Vector<String> list=new Vector<String>();

	    list.add("apple");
	    list.add("mango");
	    list.add("banana");
	    list.add("orange");
	    list.add("guava");

	    System.out.println(list);
	    Enumeration e=list.elements();
	    while(e.hasMoreElements())
	    {
	    	System.out.println(e.nextElement());
	    }

	    ListIterator itr=list.listIterator();

	    System.out.println("printing in forward direction");
	    while(itr.hasNext())
	    {
	    	System.out.println(itr.next());
	    }

	    System.out.println("printing in backward direction");
	    while(itr.hasPrevious())
	    {
	    	System.out.println(itr.previous());
	    }
        System.out.println();

	    
	}
}

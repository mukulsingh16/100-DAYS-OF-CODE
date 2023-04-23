import java.util.*;
class Arraylist
{
	public static void main(String args[])
	{
	   ArrayList<String> fruitlist=new ArrayList<String> ();
	   fruitlist.add("mango");
	   fruitlist.add("apple");
	   fruitlist.add("guava");
	   fruitlist.add("orange");
	   fruitlist.add("banana");
	   fruitlist.add("kiwi");

	   System.out.println(fruitlist);

	   for(String mlist:fruitlist)
	   {
	   	System.out.println(mlist);
	   }

	   fruitlist.remove(0);
	   fruitlist.set(1,"lichi");
	   System.out.println(fruitlist);

	   // fruitlist.clear();
	   System.out.println(fruitlist.isEmpty());
	   System.out.println(fruitlist.contains("lichi"));
	   System.out.println(fruitlist.indexOf("lichi"));
	   Collections.sort(fruitlist);
	   System.out.println(fruitlist);
	}
}

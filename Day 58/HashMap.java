import java.util.*;
class Hashmap
{
	public static void main(String args[])
	{
	   HashMap<String,String> map=new HashMap<String,String>();
	   map.put("color1","orange");
	   map.put("color2","blue");
	   map.put("color3","green");
	   map.put("color4","white");
	   map.put("color1","red");

	   System.out.println(map);
	   map.put("color2","cyan");
	   for(Map.Entry mjjj : map.entrySet())
	   {
	   	  System.out.println(mjjj.getKey()+" "+mjjj.getValue());
	   }

	   System.out.println(map.get("color2"));
	}
}

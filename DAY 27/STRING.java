class string 
{
	public static void main(String args[])
	{
	    String str1="hello";
	    String str2="Hello";

	    String str=new String("hello you are learning java");

	    System.out.println(str1);
	    System.out.println(str2);
	    System.out.println(str);

	    System.out.println(str1==str2);
	    System.out.println(str1==str);
	    System.out.println(str.length());
	    System.out.println(str1.equals(str));

	    System.out.println(str.codePointAt(0));

	    str=str.concat(str1);
	    System.out.println(str);

	    str=str.concat("world");
	    System.out.println(str);
	    
        System.out.println(str.substring(2,5));
        System.out.println(str2.compareTo(str1));
        System.out.println(str.contains("ell"));
        System.out.println(str2.equalsIgnoreCase(str1));

        String strarr[]=str.split(" ");

        for(int i=0;i<strarr.length;i++)
        	{
        	    String fl=strarr[i].substring(0,1);
        	    String rl=strarr[i].substring(1);
                String flup=fl.toUpperCase();
                System.out.print(flup+rl+" ");
        	}
        	int j;
        for( j=0;j<strarr.length;j++)
        {
            System.out.println(strarr[j]+" ");
        }
        

        

        char s1=str1.charAt(1);
        System.out.println(s1);

        String s=str.toUpperCase();
        System.out.println(s);
        String s2=str.toLowerCase();
        System.out.println(s2);

        int index=str.indexOf('e');
        System.out.println(index);
	}
}

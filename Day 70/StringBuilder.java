// import java.util.*;
public class String_Builder {
public static void main(String[] args) 
   {
    StringBuilder sb=new StringBuilder("mukul singh");
    System.out.println(sb); 
    
    System.out.println(sb.charAt(7));
    sb.setCharAt(8, 'y');
    
    System.out.println(sb);
    
    sb.insert(0, 'M');
    System.out.println(sb);
    
    sb.delete(0, 3);
    System.out.println(sb);
    
    sb.append("birthday") ;
    System.out.println(sb);
    
    StringBuilder sc=new StringBuilder("HelloWorld");
    for(int i=0;i<sc.length()/2;i++)
    {
      int front=i;
      int back=sc.length()-i-1;

      char frontChar=sc.charAt(front);
      char backChar=sc.charAt(back);

      sc.setCharAt(front, backChar);
      sc.setCharAt(back, frontChar);
    }
      System.out.println(sc);
   }
}

import java.util.*;

class ArrayListEx{
   public static void main(String[] args) {
      
      ArrayList<String> alist = new ArrayList<>();
      alist.add("Sameep");
      alist.add("Jatin");
      alist.add("Deeksha");
      alist.add("Manoj");
      alist.add("Anup");
      alist.add("1000");
      
      System.out.println(alist);


          HashSet<String> set = new HashSet<>(alist);
          set.add("Anup");
          set.add("Sameep");
          System.out.println(set);


   }
}

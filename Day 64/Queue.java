import java.util.*;
 class Queue1
{
    public static void main(String[] args)
    {
        Queue<Integer> list=new PriorityQueue<Integer>();
        list.add(5);
        list.add(1);
        list.add(9);
        list.add(4);
        list.add(8);
        list.add(2);
        list.add(3);
        
        System.out.println(list);
        list.remove(5);
        System.out.println(list);
        System.out.println(list.contains(6));
        System.out.println(list.peek());
        System.out.println(list.poll());
        System.out.println(list);
    }
}

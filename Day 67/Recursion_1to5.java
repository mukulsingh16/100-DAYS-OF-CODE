public class recursion1To5 {
    public static void PrintNum(int n)
    {
        if(n==6)
        {
            return;
        }
        System.out.println(n);
        PrintNum(n+1);
    }
    public static void main(String[] args) {
        int x=1;
        PrintNum(x);
    }
}

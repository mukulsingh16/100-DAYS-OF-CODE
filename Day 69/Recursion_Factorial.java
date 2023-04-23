public class recursionFACT {
    public static void PrintFact(int n,int fact)
    {
        if(n==0)
        {
            System.out.println(fact);
            return;
        }
        fact*=n;
        PrintFact(n-1, fact);
    }
    public static void main(String[] args) {
        PrintFact(5, 1);
    }
}

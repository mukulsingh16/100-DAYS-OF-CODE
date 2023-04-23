public class recursionNnaturalno {
    public static void PrintSum(int n,int sum)
    {
        if(n==0)
        {
            System.out.println(sum);
            return;
        }

        sum+=n;
        PrintSum(n-1, sum);
    }
    public static void main(String[] args) {
        
        PrintSum(5, 0);
    }
    
}

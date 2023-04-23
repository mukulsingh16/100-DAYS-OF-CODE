public class RecursionPower {
    public static int Power(int x,int n)
    {
        if(n==0)
        {
            return 1;
        }
        if(x==0)
        {
            return 0;
        }
        int x_power=Power(x,n-1);
        int xPower=x*x_power;
        return xPower;
    }
    public static void main(String[] args) {
        int x=2,n=5;
        int ans=Power(x, n);
        System.out.print(ans);
    }
}

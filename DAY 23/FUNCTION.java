import java.util.Scanner;
class Test
{
	void myfunc()
	{
	   System.out.println("My name is mukul singh");
	}

	void addfunc()
	{
	    int a,b;
	    a=10;
	    b=20;
	    System.out.println("sum is: "+(a+b));
	}

	void add(int a,int b)
	{
	    int sum=a+b;
	    System.out.println("Sum is : "+(sum));
	}

	int ad_func()
	{
        int a=10,b=90;
        int sum=a+b;
        return sum;
	}

	int square(int n)
	{
	    return(n*n);
	}
}
class Function
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        Test t=new Test();
        
        t.myfunc();
        
        t.addfunc();
        
        t.add(90,80);

        int res=t.ad_func();
        System.out.println("Adiition is :"+res);        

        System.out.println("Enter the number to be squared: ");
        int input=sc.nextInt();
        int sqres=t.square(input);
        System.out.println("The square of a number is: "+sqres);
    }
}

import java.util.Scanner;
class Bmi
{
	public static void main(String[] args)
	 {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("ENTER YOUR WEIGHT in kg");
		float wt=sc.nextFloat();
		
		System.out.println("ENTER YOUR HEIGHT in cm");
		float ht=sc.nextFloat();
		
		float bmi=(wt/ht/ht)*10000;
		
		if(ht<0 || wt<0)
		{
			System.out.println("invalid input ...... good bye");
		}
		
		else {
			if (bmi<=18.5) {
		System.out.println("for the height of "+ht+"cm and the weight of "+wt+"kg,the BMI is:"+bmi);
		System.out.println("category is:Underweight");			
		}
		
		else if (bmi>=18.5 && bmi<=24.9 ) {
		System.out.println("for the height of "+ht+"cm and the weight of "+wt+"kg,the BMI is:"+bmi);
		System.out.println("category is:Normal Weight");			
		}
		
		else if (bmi>=25 && bmi<=29.9) {
		System.out.println("for the height of "+ht+"cm and the weight of "+wt+"kg,the BMI is:"+bmi);
		System.out.println("category is:Normal Weight");			
		}
		
		else {
		System.out.println("for the height of "+ht+"cm and the weight of "+wt+"kg,the BMI is:"+bmi);
		System.out.println("category is:Obese");			
		}
	}
			
	}
}

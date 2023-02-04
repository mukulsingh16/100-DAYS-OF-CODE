class Student 
{
	int admn;
	int rollno;
	String name;
	double marks;
}

class Classobject
{
	public static void main(String args[])
	{
	   Student s1=new Student();
	   s1.admn=100;
	   s1.rollno=001;
	   s1.name="Mukul";
	   s1.marks=90.009;
       
       System.out.println("admission no = "+s1.admn+"roll no = "+s1.rollno+" name= "+s1.name+"marks= "+s1.marks);

	   Student s2=new Student();
	   s2.admn=150;
	   s2.rollno=010;
	   s2.name="Gagguu";
	   s2.marks=88.009;
	   System.out.println("admission no = "+s2.admn+"roll no = "+s2.rollno+" name= "+s2.name+"marks= "+s2.marks);

	}
}

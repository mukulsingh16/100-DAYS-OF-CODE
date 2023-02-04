class Student
{
	int admn;
	double marks;
	String name;

	Student()
	{
	    System.out.println("default constructor called after just making an object");
	}

	// Parameterized Constructor
	Student(int a1,double m1,String n1)
	{
	   admn=a1;
	   marks=m1;
	   name=n1;
	}

    Student(Student myobj)
    {
    	System.out.println(myobj.admn+" "+myobj.marks+" "+myobj.name);
    }

	void showdetails()
	{
	   System.out.println("admission no = "+admn+"marks= "+marks+" name= "+name);
	}
}

class Constructor
{
	public static void main(String args[])
	{ 
        Student s1=new Student(100,55.45,"aman");
        s1.showdetails();
         Student s3=new Student();
        Student s2=new Student(120,85.45,"himanshu");
        s2.showdetails();

        Student s4=new Student(s1);

	}
}

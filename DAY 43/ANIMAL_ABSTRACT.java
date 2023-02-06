// Animal (abstrat)
	// 	sound method(abstract)
	// 	move 
	// 	eat
 
 // cat	
 // dog
 // cow	
abstract class Animal
{
	abstract void sound();
	public void move(String str)
	{
	   System.out.println(str+" can move");
	}
	public void eat(String str)
	{
	   System.out.println(str+" animal can eat");
	}
}

class cat extends Animal
{
	void sound()
	{
	   System.out.println("this animal sounds:Meeeow");
	}
	
}
class dog extends Animal
{
	void sound()
	{
	   System.out.println("this animal bark");
	}
	
}
class cow extends Animal
{
	void sound()
	{
	   System.out.println("this animal sounds like cow");
	}
	
}

class animalAbstract
{
	public static void main(String args[])
	{
	   cat c1=new cat();
	   c1.sound();
	   c1.move("cat");
	   c1.eat("cat");
       System.out.println();
	   dog d1=new dog();
	   d1.sound();
	   d1.move("dog");
	   d1.eat("dog");
       System.out.println();
	   cow C1=new cow();
	   C1.sound();
	   C1.move("cow");
	   C1.eat("cow");
	}
}

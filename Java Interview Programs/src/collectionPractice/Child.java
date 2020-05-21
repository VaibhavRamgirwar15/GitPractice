package collectionPractice;

public class Child extends Parent{

	public void method_1()
	{
		System.out.println("Child Parameterless Method");
	}
	
	public void method_1(String name)
	{
		System.out.println("Child Parameterized Method");
	}
	
	public void onlyChildMethod()
	{
		System.out.println("Only child class method");
	}
	
	public static void main(String args[])
	{
		//1st scenario
		Parent p1 = new Parent();
		p1.method_1();
		p1.method_2();
		//1. Only parent class methods and variable can call.
		System.out.println("************************************");
		//2nd Scenario
		Child c1 = new Child();
		c1.method_1();
		c1.method_1("Vaibhav");
		c1.different();
		c1.method_2();
		//1. All the methods and variables of parent class and child class gets call if inheritance relationship is exist in between two class.
		//2. 
		System.out.println("************************************");
		//3rd scenario
		Parent p = new Child();
		p.method_1();
		p.method_2();
		p.different();
		//1. If method available in Only in parent class we can using p reference.
		//2. If method available in child class and override from parent class then we can call using object referance p
		//3. Method available only in child class we can't call using parent class reference.
		// if we do that we will get a compile time error
		System.out.println("************************************");
		//4th Scenario
		Child c = (Child)new Parent();
		c.onlyChildMethod();
		
		System.out.println("************************************");
	}
	
}

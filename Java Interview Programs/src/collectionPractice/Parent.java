package collectionPractice;

public class Parent {

	int number =10;
	String fullName="Vaibhav Dilip Ramgirwar";
	public void method_1()
	{
		System.out.println("Inside parent method");
	}
	
	public void different()
	{
		System.out.println("Another Method of parent....");
	}
	
	public void method_2()
	{
		System.out.println(this.number + this.fullName);
	}
}

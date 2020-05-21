package com.InheritancePractice;

class Parent {

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
	
	public int method_3(String name, String age)
	{
		System.out.println("Inside method_3 of Parent class");
		return 0;
	}

	
}

class Child extends Parent{

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
	
	
}


public class Inheritance_Concepts {

	public static void main(String args[])
	{
		/*	1st Scenario
		 * 
		 * 1. Only parent class methods and variable can call.
		 * */
		Parent p1 = new Parent();
		p1.method_1();
		p1.method_2();
		
		System.out.println("************************************");
		/*	2nd Scenario
		 * 
		 * 1. All the methods and variables of parent class and child class gets call if inheritance 
		 * 		relationship is exist in between two class.
		 */
		Child c1 = new Child();
		c1.method_1();
		c1.method_1("Vaibhav");
		c1.different();
		c1.method_2(); 
		System.out.println("************************************");
		/* 3rd Scenario
		 * 
		 * Upcasting: It is the process of assigning object of child class to the reference of
		 * parent class.
		 *  
		 *  1. If method available in Only in parent class we can call using p reference.
		 *  2. If method available in Child class and override from parent class then 
		 *  	we can call using object reference p
		 *  3. Method available only in child class we can't call using parent class reference.
		 *  	if we do that we will get a compile time error
		 */
		Parent p = new Child();
		p.method_1();
		p.method_2();
		p.different();
		System.out.println("************************************");
		/*
		 * 4th Scenario
		 * Classcast exeption will gate
		 * */
		try {
			Parent p2 = new Parent();
			Child c = (Child)p2;
			c.method_2();
			c.different();
			c.onlyChildMethod();
		} catch (Exception e) {
			e.getMessage();
		}
		
		System.out.println("************************************");
	}

}

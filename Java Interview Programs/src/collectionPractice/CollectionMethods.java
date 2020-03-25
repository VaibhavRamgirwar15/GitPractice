package collectionPractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionMethods {
	
	private void setMethodsIntiger()
	{
		//Set<Integer> intSet = new HashSet<Integer>();
		Set<Integer> intSet = new LinkedHashSet<Integer>();
		//Set<Integer> intSet = new TreeSet<Integer>();
		
		System.out.println("Input Intiger :");
		intSet.add(40);
		intSet.add(50);
		intSet.add(40);
		intSet.add(100);
		intSet.add(20);
		intSet.add(90);

		for (Integer elements : intSet) {
			System.out.println(elements);
		}
	
	}
	
	private void setMethodsString()
	{
		Set<String> strElement = new HashSet<String>();
		//Set<String> strElement = new LinkedHashSet<String>();
		//Set<String> strElement = new TreeSet<String>();
		System.out.println("Input String :");
		strElement.add("Vaibhav");
		strElement.add("Rupali");
		strElement.add("Vaibhav");
		strElement.add("");
		strElement.add(null);
		strElement.add(null);
		
		
		for(String elements: strElement)
		{
			System.out.println(elements);
		}
	}
	
	public void listIntiger()
	{
		//List<Integer> list= new ArrayList<Integer>(); System.out.println("Input String of ArrayList :");
		List<Integer> list = new LinkedList<Integer>(); System.out.println("Input String of LinkedList :");
		list.add(50);
		list.add(40);
		list.add(80);
		list.add(30);
		
		Iterator<Integer> itrElements = list.iterator();
		while(itrElements.hasNext())
			{System.out.println(itrElements.next());}
	}
	
	public void listString()
	{}

	public static void main(String[] args) {
		
	CollectionMethods cm= new CollectionMethods();
	//cm.listIntiger();
	cm.setMethodsString();
	
		
	//HashSet do not maintain the order of element inserted.
	//LinkedHasSet maintain the order of element inserted.
	//Tree Set display the element in sorted format
	
	//HasSet allow null values 
	//LinkedHasSet allow the null values
	//TreeSet wont allow null values
	
	//HasSet, LinkedHasSet, TreeSet wont allow duplicate values
	
	}
}

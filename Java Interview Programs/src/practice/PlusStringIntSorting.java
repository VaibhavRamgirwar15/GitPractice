package practice;

import java.util.StringTokenizer;

public class PlusStringIntSorting {

	/*
	 * Input: 9+2+6+4+5+1 
	 * Output: 1+2+4+5+6+9 
	 * 
	 * 1. Split the string using + sign 
	 * 2. Convert to the charArray 
	 * 3. sorting char array 
	 * 4. display sorted array by appending + 
	 * 
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String("9+2+6+4+5+1");
		System.out.println("Before split the string: "+str);
		
		//1. Split the string by +
		StringTokenizer strToken =new StringTokenizer(str,"+");
		String strT="";
		while (strToken.hasMoreTokens())
		{
			strT = strT+strToken.nextToken();
		}
		System.out.print("After Split String by '+' :"+strT);
	
		//2. Covert to char Array
		char[] charArray= strT.toCharArray();
		
		//3. Sorting character array
		for(int i=0; i<charArray.length-1; i++)
		{
			for(int j=i+1; j<charArray.length;j++)
			{
				if(charArray[i]>charArray[j])
				{
					char temp= charArray[i];
					charArray[i]=charArray[j];
					charArray[j]= temp;
				}
			}
			
		}
		//4. Display sorted array by appending +
		System.out.println(" ");
		System.out.print("After Sort char Array :");
		String sortedString ="";
		for(int i=0; i<charArray.length; i++)
		{
			if(sortedString!="")
			sortedString = sortedString+"+"+charArray[i];
			else
			sortedString = charArray[i]+"";
		}
		
		System.out.print(sortedString);
		
		
	}
}

package practice;



public class Pallindrom {

	public static void main(String[] args) {
		
		System.out.println(factorial(5));
		
		System.out.println(pallindrome("Level"));
	
	}
	
	public static long factorial(int number)
	{
		if(number==1)
			return 1;
		
		return number*factorial(number-1);
	}
	
	public static String pallindrome(String strName)
	{
		String revString="";
		char[] strArray= strName.toCharArray();
		
		System.out.println(strArray.length);
		for(int i=strArray.length-1; i>=0; i-- )
		{
			revString= revString+strArray[i];
		}
		
		if(revString.equalsIgnoreCase(strName))
			return "String "+strName+" is a Pallindrome";
		else
			return "String "+strName+" is not a Pallindrome";
	}
	
	

}

package collectionPractice;

public class RandomLuckyNumber {

	public void countOfCharecterInString(String str)
	{
		int count;
		char[] charArray= str.toLowerCase().toCharArray();
		
		for(int i=0; i<charArray.length; i++)
		{
			count=0;
			for(int j=0; j<charArray.length; j++)
			{
				if(charArray[i]==charArray[j])
				{
					count++;
				}
			}
			if(count == 1)
				 System.out.println("Character "+charArray[i]+" appers "+count+" time in string..!!!");
			
		}
	}
	
	public void printVowelsinString(String str)
	{
		int vowels=0;
		char[] lwStr = str.toLowerCase().toCharArray();
		
		for(int i=0; i<lwStr.length;i++)
		{
			if(lwStr[i]== 'a' | lwStr[i]== 'e'| lwStr[i]== 'i' | lwStr[i]== 'o' |lwStr[i]== 'u')
			{
				vowels++;
			}
		}
		System.out.println("Vowels count :"+vowels);
	}
	
	public static void main(String[] args) {
		
		RandomLuckyNumber string= new RandomLuckyNumber();
		
		string.countOfCharecterInString("WeLl");
		
		string.printVowelsinString("aeioukkkkkkk");
		
	}

}

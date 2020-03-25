package practice;

public class LongestSubstringInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1.Take String*/
		String orignal = "i am vaibhav ramgirwar";
		/*substring*/
		String[] srcArray= orignal.split(" ");
		int highestLength=0;
		
		for(int i=0; i<srcArray.length; i++)
		{
			System.out.println("Splitted String :"+srcArray[i]);
		}
		
		for(int j=0; j<srcArray.length-1; j++)
		{
			if(srcArray[j+1].length()>srcArray[j].length())
			{
				highestLength=srcArray[j+1].length();
			}
		}
		
		for(int i=0; i<srcArray.length; i++)
		{
			if(srcArray[i].length()==highestLength)
			System.out.println("Highest Substring in given String is :"+srcArray[i]);
		}
		
		
	}

}

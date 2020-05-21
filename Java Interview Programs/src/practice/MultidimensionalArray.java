package practice;

public class MultidimensionalArray {

	public static void main(String[] args)
	{
		int [][]myArray= {{1,2,3,4},{5,6,7}};
		
		System.out.println("Multi Dimensional Array Lenght will give no rows :"+myArray.length);
		
		System.out.println("myArray[0] will give no of colums in 0th row :"+myArray[0].length);
		System.out.println("myArray[1] will ginv no of colums in 1st row :"+myArray[1].length);
		
		for(int i=0; i<myArray.length; i++)
		{
			for(int j=0; j< myArray[i].length; j++)
			{
				System.out.print(myArray[i][j]+", ");
			}
			System.out.println(" ");
		}
	}
	
	
	
}

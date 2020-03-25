package practice;

public class GreaterWallCount {
	
	public GreaterWallCount() {
		// TODO Auto-generated constructor stub
		System.out.println("To check CTOR call");
	}

	public static void main(String[] args) {
		int [] nWalls= {1,2,3,1,4,5,6};
		int count=1;
		int highestWall=0;
		
		for(int i=0; i<nWalls.length-1; i++)
		{
			if(nWalls[i+1]>nWalls[i])
			{
				if(highestWall<nWalls[i+1])
				{
					count++;
					highestWall= nWalls[i+1];
				}
			}
		}
		System.out.println("Person can see "+count+" number of walls");

	}

}

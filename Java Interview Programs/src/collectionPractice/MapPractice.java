package collectionPractice;

import java.util.*;

public class MapPractice {

	public static void main(String[] args) {
		
		Map<Integer,String> hm = new TreeMap<Integer, String>();
		
		hm.put(40, "Suraj");
		hm.put(35, "Rahul");
		hm.put(90, "Manoj");
		hm.put(50, "Mahesh");
		
		Set<Map.Entry<Integer, String>> entries = hm.entrySet();
		
		for(Map.Entry<Integer, String> entry : entries)
		{
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
		
	}
}

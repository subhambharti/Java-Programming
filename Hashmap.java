// 44.	Create a program to iterate through a HashMap.
// Java Program to Iterate over HashMap

import java.util.HashMap;
import java.util.Map;
public class Hashmap {

	public static void main(String[] args)
	{
		Map<String, String> foodTable = new HashMap<String, String>();

		foodTable.put("A", "Angular");
		foodTable.put("J", "Java");
		foodTable.put("P", "Python");
		foodTable.put("H", "Hibernate");

		for (Map.Entry<String, String> set :
			foodTable.entrySet()) {

			System.out.println(set.getKey() + " = "
							+ set.getValue());
		}
	}
}

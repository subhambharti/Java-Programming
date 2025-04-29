// 35.	Write a Java program to replace all spaces in a string with hyphens.

class replace
{
	
	// Function to replace Space with -
	static String replaceSpace(String str)
	{
		
		String s = "";
		
		// Traverse the string character by character.
		for (int i = 0; i < str.length(); ++i) {
	
			// Changing the ith character
			// to '-' if it's a space.
			if (str.charAt(i) == ' ') 
				s += '-';
			
			else
				s += str.charAt(i);
			
		}
	
		// return the modified string.
		return s;
	
		
	}
	
	
	public static void main(String []args)
	{
	
		// Get the String
		String str = "A computer science portal for geeks";
		
		System.out.println(replaceSpace(str));
	
	
	}

}

//Write a program to verify if the given String is a Palindrome (Eg: Madam, Radar, Mom, Wow, Dad) 
package assignments_Java;

public class Assignment_41 {

	public static void main(String[] args) 
	{
		String title = "Madam";
		String output = "";
		
		int len = title.length();
		
		for(int j =len-1 ; j>=0 ;j--)
		{
			char c = title.charAt(j);
			output =output+c;
		}
		System.out.println("Reverse of the string "+title+" is - "+ output);
		
		// check if the string is palindrome
		if(title.equalsIgnoreCase(output)) 
		{
			System.out.println("The Given string "+title+" is Palindrome.");
		}
		
	}

}

//Write a program to find out alphabets in a given string (Eg: Name123, 50cents)
package assignments_Java;

import java.util.Arrays;

public class Assignment_44 
{
	public static void main(String[] args)
	{
		String password = "RuPali123";
		int count=0;
		char c [] = password.toCharArray();
		
		System.out.println(Arrays.toString(c));
		
		for(int i =0 ; i< password.length() ; i++)
		{
		boolean b= Character.isAlphabetic(c[i]);
		System.out.println(b);
			if (b==true)
			{
			count = count++;
			}	
		}
		System.out.println("Alphabetic values which is true has count - "+count);
		

	}

}

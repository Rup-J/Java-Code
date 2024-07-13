//Write a program to find out whitespaces, numeric values and special characters in a given  
//string (Eg: Name123, 50cents) 
package assignments_Java;

import java.util.Arrays;

public class Assignment_45 {

	public static void main(String[] args) 
	{
		String password = "RuPali 123 @1996";
		int count=0;
		int countofNumber = 0;
		int countofspace =0;
		char c [] = password.toCharArray();
		
		System.out.println(Arrays.toString(c));
		System.out.println("length of the string is - "+password.length());
		
		for(int i =0 ; i< password.length() ; i++)
		{
		boolean b= Character.isAlphabetic(c[i]);
		
		boolean b1 = Character.isDigit(c[i]);
		
		boolean b2 = Character.isWhitespace(c[i]);
		
			if (b==true)
			{
			count = count+1; // OR count++
			}	
			if (b1==true)
			{
				countofNumber = countofNumber+1; //// OR countofNumber++
			}
			if (b2 ==true)
			{
				countofspace++;
			}
		}
		System.out.println("Alphabetic values are - "+count);
		System.out.println("Numeric values are - "+countofNumber);
		System.out.println("White spaces are - "+countofspace);
		
		int countofspclchar = password.length()-(count+countofNumber+countofspace);
		System.out.println("Special characters in given string is - "+ countofspclchar);
		
		
		
		
		
		
	}

}

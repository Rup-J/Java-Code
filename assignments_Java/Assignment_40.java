//Write a program to Perform String Reversal
package assignments_Java;

public class Assignment_40 {

	public static void main(String[] args) 
	{
		String title = "Apple";
		String output = "";
		
		int len = title.length();
		//way -01 -not recommended
		for(int i= len-1 ; i>=0 ; i--)
		{
			System.out.print(title.charAt(i));
		}
		System.out.println();
		
		//way -02
		for(int j =len-1 ; j>=0 ;j--)
		{
			char c = title.charAt(j);
			output =output+c;
		}
		System.out.println("Reverse of the string "+title+" is - "+ output);
		
	}

}

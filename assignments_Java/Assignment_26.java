//Write a program for this() calling statement.
package assignments_Java;

public class Assignment_26 {

	Assignment_26(int id)
	{
		System.out.println("ID is - "+id);
	}
	Assignment_26(double percent)
	{
		this(54321);
		System.out.println("percent is - "+ percent);
	}
	Assignment_26(String city)
	{
		this(93.12);
		System.out.println("City is - "+ city);
	}
	public static void main(String[] args) 
	{
		new Assignment_26("Nagpur");
	}

}

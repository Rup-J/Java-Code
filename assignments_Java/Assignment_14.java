package assignments_Java;

// Assignment 4-Write a program to calculate the area and circumference of a circle in different methods and then call them in the main method

public class Assignment_14 {
	static int r=10;
	static double pi=3.14;
	
	static void area()
	{
		System.out.println(pi*r*r);
	}
	static void circum()
	{
		System.out.println(2*pi*r);
	}

	public static void main(String[] args) 
	{
		area();
		circum();

	}

}

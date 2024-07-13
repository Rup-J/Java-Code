package assignments_Java;
/// Assignment 5-Write a program to find the area of a circle using a for loop where radius is coming from math.random and pi is coming from math.pi.
// The loop has to execute 10 times.


public class Assignment_15 {
	final static double pi= Math.PI;

	public static void main(String[] args) 
	{
		for(int i=1 ; i<=10 ; i++)
		{
			double r= Math.random();
			System.out.println(pi*r*r);
		}
	}

}

//Perform array for boolean and double datatype and write down their values from scanner class.
package assignments_Java;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment_39 {

	public static void main(String[] args) 
	{
		//for boolean datatype
		Scanner s1 =  new Scanner(System.in);
		System.out.println("Enter 2 boolean values : ");
		boolean b []=  new boolean[2];
		for(int i=0; i<2 ;i++)
		{
			b[i] = s1.nextBoolean();
		}
		System.out.println(Arrays.toString(b));		
		
		//for double datatype
		Scanner s2 =  new Scanner(System.in);
		System.out.println("Enter 3 double values : ");
		double d[]= new double[3];
		
		for(int j =0 ; j<3 ;j++)
		{
			d[j] = s2.nextDouble();
		}
		System.out.println(Arrays.toString(d));
		
	}

}

package assignments_Java;
//Utilise All methods of scanner class
import java.util.Scanner;

public class Assignment_17 {

	public static void main(String[] args) 
	{
		Scanner s  = new Scanner(System.in);
		System.out.println("Enter integer: ");
		int  num = s.nextInt();
		
		System.out.println("Enter String: ");
		String  str = s.next();
		
		System.out.println("Enter Double number: ");
		double  d = s.nextDouble();
		
		System.out.println("Enter Long number: ");
		long  l = s.nextLong();
		
		System.out.println("Enter Byte: ");
		byte  by = s.nextByte();
		
		System.out.println("Enter Boolean: ");
		boolean  bln = s.nextBoolean();
		
		System.out.println("Enter Float : ");
		float  f = s.nextFloat();
		
		System.out.println("The entered values are.........");
		System.out.println(num);
		System.out.println(str);
		System.out.println(d);
		System.out.println(l);
		System.out.println(by);
		System.out.println(bln);
		System.out.println(f);
		

	}

}

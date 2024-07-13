package assignments_Java;

//Assignment 1-Write a program to perform addition,subtraction,multiplication,division and modulus in the main method

public class Assignment_01
{
	static int a = 40;
	static int b = 20;
	
	static void addition()
	{
		int add= a+b;
		System.out.println(add);
	}
	static void substration()
	{
		int sub = a-b;
		System.out.println(sub);
	}
	static void multiplication()
	{
		int mul = a*b;
		System.out.println(mul);
	}
	static void division()
	{
		int div= a/b;
		System.out.println(div);
	}
	static void modulus()
	{
		int mod = a/b;
		System.out.println(mod);
	}
	
	
	public static void main(String[] args) 
	{
		
		addition();
		substration();
		multiplication();
		division();
		modulus();		

	}

}

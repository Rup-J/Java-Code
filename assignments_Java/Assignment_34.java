//Write a program using with abstract class-Abstract class 
// (2 abstract methods,2 concrete methods) and class have 2 concrete methods
package assignments_Java;

abstract class Company
{
	abstract void add();
	abstract void sub();
}

class class1 extends Company
{
	void add()
	{
		System.out.println("Add method");
	}
	
	void sub()
	{
		System.out.println("sub method");
	}
	void login()
	{
		System.out.println("login successfull");
	}
	static void logout()
	{
		System.out.println("Logout is completed");
	}
}
public class Assignment_34 extends class1 {

	public static void main(String[] args) 
	{
		Assignment_34 a34 = new Assignment_34();
		a34.add();
		a34.sub();
		a34.login();
		a34.logout();
		class1.logout();
		

	}

}

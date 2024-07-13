//For methodoverride concept,make parent method as final,check override is possible or not?
package assignments_Java;

 class Spider
{
	 //final void method_01()
	{
		System.out.println("final method....");
	}
}
public class Assignment_33 extends Spider {
	void method_01()
	{
		System.out.println("override final method....");
	}

	public static void main(String[] args) 
	{
		Assignment_33 a33 = new Assignment_33();
		a33.method_01();
	}

}

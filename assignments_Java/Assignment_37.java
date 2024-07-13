//1.write a program for remaining methods of string(isempty,lastindexof,replace,replaceall,)  
//2.write a program for matches string function for 4 questions given in class 22 i.e  
//1.check given string ends with i for string manish kumar tiwari 
//2.check given string starts with m 
//3.check if letter k is present or not 
//4.check if given string tom,has 3 characters or not
package assignments_Java;

public class Assignment_37 {

	public static void main(String[] args) 
	{
		String name = "This is that";
		System.out.println(name.isEmpty());
		System.out.println(name.lastIndexOf('t'));
		System.out.println(name.replace('a', 'u'));
		System.out.println(name.replaceAll("This", "A"));
		
		//MATCHES
		String name1= "Krupali";
		System.out.println(name1.matches("(.*)i"));
		System.out.println(name1.matches("m(.*)"));
		System.out.println(name1.matches("(.*)K(.*)"));
		
		String name2= "JOY";
		System.out.println(name2.matches("..."));
	}

}

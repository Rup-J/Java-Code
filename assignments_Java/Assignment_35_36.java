//Write a program for all methods of String length,lowercase,uppercase,indexofchar,
//charAt(index),trim,equals,equalsignorecase,contains,substring(start index),
//substring(startindex,endindex)
package assignments_Java;

public class Assignment_35_36 {

	public static void main(String[] args) 
	{
		String name = "Rupali";
		System.out.println(name.length());
		
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.indexOf('p'));
		System.out.println(name.charAt(3));
		
		String name1 = "  Salesforce qA    ";
		System.out.println(name1.trim());
		
		System.out.println(name.equals(name1));
		
		String name2 = "Salesforce QA";
		System.out.println(name2.equalsIgnoreCase(name1));
		System.out.println(name2.contains(name1));
		System.out.println(name.substring(4));
		System.out.println(name.substring(1, 4));
		
		String name3 = "My Name is Michael";
		System.out.println(name3.substring(3));
		System.out.println(name3.substring(0,7));
		System.out.println(name3.substring(8,11));
		System.out.println(name3.substring(11,18));
			}

}

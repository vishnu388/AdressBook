package AddressBook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
	static List listing = new ArrayList();
	public static Scanner sc = new Scanner(System.in);
	static AddressBook vishnu = new AddressBook();
	static  final int i=0;
	 public void addContact() {
		System.out.println("Enter numbers of  persons you want to add");
		int numOfPerson=sc.nextInt();
	    for(int i=0; i<=numOfPerson; i++)
	    {
	    	System.out.println("\nPerson :  "+i+" Enter First Name");
	        String fn= sc.next();
	        sc.nextLine();
	        System.out.println("Person : " +i+ " Enter Last Name");
	        String ln = sc.next();
	        sc.nextLine();
	        System.out.println("Person : " +i+ " Enter Address");
	        String add = sc.next();
	        sc.nextLine();
	        System.out.println("Person : " +i+ " Enter City");
	        String city = sc.nextLine();
	        System.out.println("Person : " +i+ " Enter State");
	        String state = sc.next();
	        sc.nextLine();
	        System.out.println("Person : " +i+ " Enter postal_Code");
	        String zip = sc.next();
	        System.out.println("Person : " +i+ " Enter Country_Name");
	        String country = sc.next();
	        System.out.println("person :" +i+ "Enter Mobile number");
	        String mob=sc.next();
	        System.out.println("Person : " +i+ " Enter E-mail");
	        String mail = sc.next();
	        contact contact = new contact(fn, ln, add, city, state, zip,country,mob, mail);
	        listing.add(contact);
	          
	    }
	   
}
	   
public static void main(String args[]) {
	
	vishnu.addContact();	
	System.out.println("The person records are listed below");
	System.out.println(listing);
	System.out.println("number of  contacts added sccessfully");
	}

}

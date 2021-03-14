package AdressBook;

import java.util.Scanner;

public class AdressBook {
	Scanner sc=new Scanner(System.in);
	static contact[] contactList=new contact[10];
	int add(int increment)
	{
		System.out.println("Enter First Name:");
		String fn=sc.next();
		System.out.println("Enter last name:");
		String ln=sc.next();
		System.out.println("Enter Address:");
		String add=sc.next();
		System.out.println("Enter City:");
		String city=sc.next();
		System.out.println("Enter State:");
		String state=sc.next();
		System.out.println("Enter postal_code:");
		String zip=sc.next();
		System.out.println("Enter Country-code");
		String country=sc.next();
		System.out.println("Enter contact number:");
		String mob=sc.next();
		System.out.println("Enter email :");
		String mail=sc.next();
		contactList[increment++]=new  contact(fn, ln, add, city, state,zip,country,mob,mail);
		return increment;
	 }
	void Edit(int increment)
	{
		int i;
		for(i=0;i<10;i++)
		{
			if(i==increment)
			{
			
				System.out.println("Enter First Name:");
			 	String fn=sc.next();
      		System.out.println("Enter last name:");
      		String ln=sc.next();
      		System.out.println("Enter Address:");
      		String add=sc.next();
      		System.out.println("Enter City:");
      		String city=sc.next();
      		System.out.println("Enter State:");
      		String state=sc.next();
      		System.out.println("Enter postal_code:");
      		String zip=sc.next();
      		System.out.println("Enter Country:");
      		String country=sc.next();
      		System.out.println("Enter contact number:");
      		String mob=sc.next();
      		System.out.println("Enter email :");
      		String mail=sc.next();
      		contactList[increment++]=new  contact(fn, ln, add, city, state,zip,country,mob,mail);
				break;
			}
		}
		System.out.println("Your changes added to the AddressBook successfully");
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		AdressBook vishnu=new AdressBook();
		vishnu.Edit(0); 
	}
}

package com.bl.addressbook;
import java.util.ArrayList;
import java.util.Scanner;
public class AddressBookMain {
	public  void start() {
		final int ADD_PERSON = 1;
		final int EDIT_CONTACT = 2 ;
		final int DELETE_CONTACT = 3 ;

		System.out.println("**********Welcome to Address Book Program***********");
		/*
		 * creating an arraylist to store the person details
		 */
		ArrayList<addContact> list = new ArrayList<addContact>();
		System.out.println("if you want to add person in the address book please type 1 ");
		Scanner scanner = new Scanner(System.in);
		boolean status =true;
		/*
		 * checking for operations to perform like add person , edit person 
		 */
		while(status) {
			System.out.println("enter your choice");
			int option = scanner.nextInt();
			if(option == ADD_PERSON ) {
				addContact person = new addContact();
				person.addContact();
				list.add(person);
				System.out.println("person added!\n type 1 to add more person\n type 2 to edit added person\n type 3 to "
						+ "delete contact\n type 0 to exit");
			}
			// editing the existing contact
			else if(option == EDIT_CONTACT ) {
				if(list.isEmpty()) {
					System.out.println("the addressbook is empty , first add some contacts");
					break;
				}
				else
					System.out.println("Enter the first name of the person to edit ");
				String fName = scanner.next();
				for(int j = 0 ; j<=list.size() ; j++) {
					if(fName.equalsIgnoreCase(list.get(j).getFirst_name())) {
						addContact newperson = new addContact();  
						newperson.addContact();
						list.set(j,newperson);
						System.out.println("Done Editing ! ");
						System.out.println("type 1 to add more person\n type 2 to edit added person\n type 3 to "
								+ "delete contact\n type 0 to exit");
						break;
					}
				}
			}
			else if (option == DELETE_CONTACT) {
				if(list.isEmpty()) {
					System.out.println("the addressbook is empty , first add some contacts");
					break;
				}
				else
					System.out.println("Enter the first name of the person to edit ");
				String fName = scanner.next();
				for(int j = 0 ; j<=list.size() ; j++) {
					if(fName.equalsIgnoreCase(list.get(j).getFirst_name())) {
						list.remove(j);
						System.out.println("Person deleted ! ");
						break;
					}
				}
			}
			else {
				status= false;
			}
		}
		if(list.isEmpty()) {
			System.out.println("the addressbook is empty ");
		}
		/*
		 * printing the stored data
		 */
		else
			for(int j = 0 ; j<list.size() ; j++) {
				System.out.println(" contact ("+(j+1)+") is "+list.get(j));
			}
	}

	public static void main(String[] args) {
		AddressBookMain start =new 	AddressBookMain(); 
		start.start();
	}
}



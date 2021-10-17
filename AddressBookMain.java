package com.bl.addressbook;

import java.util.ArrayList;
import java.util.Scanner;
public class AddressBookMain {
	public  void start() {
		final int ADD_PERSON = 1;
		final int EDIT_ADDRESSBOOK = 2 ;
		System.out.println("**********Welcome to Address Book Program***********");
		ArrayList<addContact> list = new ArrayList<addContact>();
		System.out.println("if you want to add person in the address book please type 1 ");
		Scanner scanner = new Scanner(System.in);
		boolean status =true;
		while(status) {
			System.out.println("enter your choice");
			int option = scanner.nextInt();
			if(option == ADD_PERSON ) {
				addContact person = new addContact();
				person.addContact();
				list.add(person);
				System.out.println("person added!\n type 1 to add more person\n type 2 to edit added person\n type 0 to exit");
			}
			else if(option == EDIT_ADDRESSBOOK ) {
				System.out.println("Enter the first name of the person to edit ");
				String fName = scanner.next();
				for(int j = 0 ; j<=list.size() ; j++) {
					if(fName.equalsIgnoreCase(list.get(j).getFirst_name())) {
						System.out.println();
						addContact newperson = new addContact();  
						newperson.addContact();
						list.set(j,newperson);
						System.out.println("Done Editing ! ");
						System.out.println("type 1 to add more person\n type 2 to edit added person\n type 0 to exit");
						break;
					}
				}
			}
			else {
				status= false;
			}
		}

		System.out.println("size is "+list.size());	
		for(int j = 0 ; j<list.size() ; j++) {
			System.out.println("entered addresses are"+list.get(j));
		}
	}
	public static void main(String[] args) {
		AddressBookMain start =new 	AddressBookMain(); 
		start.start();
	}
}



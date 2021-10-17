package com.bl.addressbook;
import java.util.Scanner;
public class addContact {
	static final int ADD_PERSON = 1;
	private String first_name ;
	private String last_name ;
	private String address ;
	private String city ;
	private String state ;
	private int zip_code;
	private long phone_number;
	private String email;
	;
	Scanner scanner = new Scanner(System.in);
	/*
	 *taking input from the user  
	 * using console
	 */
	public void  addContact() {
		addContact person = new addContact();
		System.out.println("Enter First Name : ");
		first_name = scanner.next();
		System.out.println("Enter Last Name : ");
		last_name = scanner.next();
		System.out.println("Enter Address : ");
		address = scanner.next();
		System.out.println("Enter City : ");
		city = scanner.next();
		System.out.println("Enter State : ");
		state = scanner.next();
		System.out.println("Enter ZipCode : ");
		zip_code = scanner.nextInt();
		System.out.println("Enter Mobile Number : ");
		phone_number = scanner.nextLong();
		System.out.println("Enter EmailId : ");
		email = scanner.next();
	}
	/*
	 * Indicates that a method declaration is intended to override a method declaration in a super type.  
	 */
	@Override
	public String toString() {
		return "[first name : " + first_name + ", last name : " + last_name + ", address : " + address + ", city : "
				+ city + ", state : " + state + ", zip code : " + zip_code + ", phone number : " + phone_number + ", email : "
				+ email + "]";
	}
	/*
	 *making getters and setters 
	 * to make private members accesible
	 * outside the class 
	 */
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZip_code() {
		return zip_code;
	}
	public void setZip_code(int zip_code) {
		this.zip_code = zip_code;
	}
	public long getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(long phone_number) {
		this.phone_number = phone_number;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}	
}

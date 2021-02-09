package ContactListPackage;

public class Contacts {

	public static void main(String[] args) {
	ContactList CL = new ContactList();
	CL.addContact("Hyderabad" , 957322778);
	CL.addContact("Telugu" , 897822334);
	CL.addContact("Andhra", 765645342);
	CL.addContact("India", 678954321);
	System.out.println("India: " + CL.searchName("India"));
	System.out.println("678954321: " + CL.searchNo(678954321));
	System.out.println("San: " + CL.searchName("San"));
	System.out.println();
	CL.listAllContacts();
	}

}

package serialization;

import java.util.Scanner;

public class Launcher {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Person p = new Person();

		System.out.print("Please enter your first name: ");
		p.setFirstName(scan.nextLine());

		System.out.print("Please enter your last name: ");
		p.setLastName(scan.nextLine());

		System.out.print("Please enter some transient information: ");
		p.setTranientField(scan.nextLine());

		System.out.println("your person object: " + p);

		SerializePerson serialize = new SerializePerson();
		serialize.writePerson(p);

		System.out.println("The person read is" + serialize.readPerson());
		scan.close();
	}

}

package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializePerson {

	private String filename = "person.txt";

	public void writePerson(Person p) {
		System.out.println("attempting to write person to file");
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
			oos.writeObject(p);
			System.out.println("successfully wrote objec to file" + p);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Person readPerson() {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
			Person person = (Person) ois.readObject();
			return person;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

}

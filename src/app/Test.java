package app;
import java.util.Arrays;

/**
 * This Test class demonstrates the Person objects
 * and their methods.
 */
public class Test {

	/**
	 * The main method is the entry point of the
	 * program. We create Person objects, perform 
	 * equality tests and output the equality to the user.
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Create new Person objects.
		Person[] persons = new Person[4];
		persons[0] = new Person("Justine", "Reha", 25);
		persons[1] = new Person("Brianna", "Reha", 30);
		persons[2] = new Person("Mary", "Reha", 28);
		persons[3] = new Person("Mark", "Reha", 22);
		Arrays.sort(persons);
		for(int x=0;x < 4;++x) {
			System.out.println("This is the persons array sorted: " + persons[x]);
		}
		Person person1 = new Person("Justine", "Reha", 21);
		Person person2 = new Person("Brianne", "Reha", 31);
		Person person3 = new Person(person1);
		
		// Test object equality.
		if(person1 == person2)
			System.out.println("These persons are identical using ==");
		else
			System.out.println("These persons are not identical using ==");
		
		// Test object equality.
		if(person1.equals(person2))
			System.out.println("These persons are identical using equals()");
		else
			System.out.println("These person are not identical using equals()");
		
		// Test Copy constructor.
		if(person1.equals(person3))
			System.out.println("These copied person is identical using equals()");
		else
			System.out.println("These copied person is not identical using equals()");
		
		// Print the objects.
		System.out.println(person1);
		System.out.println(person2.toString());
		System.out.println(person3);
		
		// Make a Person walk and run
		person1.walk();
		person1.run();
		System.out.println("Person 1 is running: " + person1.isRunning());
		person1.walk();
		System.out.println("Person 1 is running: " + person1.isRunning());
	}
}

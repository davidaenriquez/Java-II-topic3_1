package app;

/**
 * This Person class represents a person
 * with first and last names.
 */
public class Person implements PersonInterface, Comparable<Person> {
	private String firstName = "Mark";
	private String lastName = "Reha";
	private boolean running = false;
	private int age; // New age property
	
	/**
	 * Constructor for Person class object with
	 * the given first and last names.
	 * @param firstName, the first name of the person.
	 * @param lastName, the last name of the person.
	 * @param age, the age of the person.
	 */
	public Person(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	/**
	 * Constructor for Person class object
	 * as a copy of another Person object.
	 * @param person, the person object to be copied.
	 */
	public Person(Person person) {
		this.firstName = person.getFirstName();
		this.lastName = person.getLastName();
		this.age = person.getAge();
	}
	
	/**
	 * Method to retrieve the
	 * first name of the person.
	 * @return, the first name of the person.
	 */
	public String getFirstName() {
		return firstName;
	}
	
	/**
	 * Method to retrieve the
	 * last name of the person.
	 * @return, the last name of the person.
	 */
	public String getLastName() {
		return lastName;
	}
	
	/**
     * Method to retrieve the
     * age of the person.
     * @return, the age of the person.
     */
    public int getAge() {
        return age;
    }
	
	/**
	 * Method to compare this Person object 
	 * to another object for equality.
	 * @param other, the object to compare to this person.
	 * @return true if objects are equal, false otherwise
	 */
	@Override
	public boolean equals(Object other) {
		if(other == this) {
			System.out.println("I am here in other == this");
			return true;
		}
		if(other == null) {
			System.out.println("I am here in other == null");
			return false;
		}
		if(getClass() != other.getClass()) {
			System.out.println("I am here in getClass() != other.getClass()");
			return false;
		}
		Person person = (Person)other;
		return (this.firstName == person.firstName && this.lastName == person.lastName);
	}
	
	/**
	 * Method to provide a string representation
	 * of the Person object.
	 * @return a string representing the Person object.
	 */
	@Override
	public String toString() {
		return "My class is " + getClass() + " " + this.firstName + " " + this.lastName;
	}

	/**
	 * Makes the person walk.
	 * Prints "I am walking" and sets the running status to false.
	 */
	@Override
	public void walk() {
		System.out.println("I am walking");
		running = false;
			}

	/**
	 * Makes the person run.
	 * Prints "I am running" and sets the running status to true.
	 */
	@Override
	public void run() {
		System.out.println("I am running");
		running = true;		
	}

	/**
	 * Checks if the person is running.
	 * @return true if the person is running, false otherwise.
	 */
	@Override
	public boolean isRunning() {
		return running;
	}

	/**
	 * Compares the age, last name, and first name of two Person objects.
	 * Prints comparisons for ages, last names, and first names.
	 * @param p the Person to compare to.
	 * @return a negative integer, zero, or a positive integer if this person is less than, equal to, or greater than the specified person.
	 */
	@Override
	public int compareTo(Person p) {
	    // Compare ages
	    System.out.println("Comparing ages...");
	    int ageComparison = Integer.compare(this.age, p.age);

	    // Print name comparisons
	    System.out.println("Comparing last names...");
	    int lastNameComparison = this.lastName.compareTo(p.lastName);

	    System.out.println("Comparing first names...");
	    int firstNameComparison = this.firstName.compareTo(p.firstName);

	    // Return comparison results in the correct order
	    if (ageComparison != 0) {
	        return ageComparison;
	    } else if (lastNameComparison != 0) {
	        return lastNameComparison;
	    } else {
	        return firstNameComparison;
	    }
	}
}

package fixcode;

/**
 * A simple model for a person with a name.
 * 
 * @author Kanchanok Kannee
 */
public class Person {
	/** the person's full name. */
	public String name;

	/**
	 * @param Initialize a new Person object.
	 */
	public Person(String name) {
		this.name = name;
	}

	/*
	 * @param Get the person's name.
	 * 
	 * @return the person's name.
	 */
	public String getName() {
		return name;
	}

	/*
	 * @param Set or change the person's name.
	 */
	public void setName(String newname) {
		this.name = newname;
	}

	/**
	 * Compare person's by name. They are equal if the name matches.
	 * 
	 * @param other is another Person to compare to this one.
	 * @return true if the name is same, false otherwise.
	 */
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		if (obj.getClass() != this.getClass()) {
			return false;
		}

		Person other = (Person) obj;
		if (name.equalsIgnoreCase(other.name)) {
			return true;
		}
		return false;
	}

	/**
	 * Get a string representation of this Person.
	 */
	public String toString() {
		return "Person " + name;
	}
}

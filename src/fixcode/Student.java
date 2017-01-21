package fixcode;

/**
 * 
 * A simple model for a Student.
 * 
 * @author Kanchanok Kannee
 * 
 */
public class Student extends Person {
	private long id;

	/**
	 * 
	 * @param name is the name of student
	 * @param id is the ID of student
	 * 
	 */
	public Student(String name, long id) {
		super(name); // name is managed by Person class
		this.id = id;
	}

	/**
	 * Return a string representation of this Student.
	 */
	public String toString() {
		return String.format("Student %s (%d)", getName(), id);
	}

	/**
	 * Compare person's by name and id. They are equal if the name and id
	 * matches. other is another Person to compare to this one.
	 * 
	 * @return true if the name is same and the id is same, false otherwise.
	 */
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (obj.getClass() != this.getClass()) {
			return false;
		}

		Student other = (Student) obj;
		if (name.equalsIgnoreCase(other.name) && (this.id == other.id)) {
			return true;
		}
		return false;
	}

	/**
	 * 
	 * To get student's id.
	 * 
	 * @return id of the student
	 */
	public long getId() {
		return id;
	}

	/**
	 * 
	 * Set or change the ID of student
	 * 
	 * @param Set id of student that you want.
	 */
	public void setId(long id) {
		this.id = id;
	}

}

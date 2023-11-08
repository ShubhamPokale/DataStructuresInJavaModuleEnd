package Sorting;

public class Student {
	
	private String name ;
	private int ID ;
	private int Marks ;
	
	public Student(String name, int iD, int marks) {
		super();
		this.name = name;
		ID = iD;
		Marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public int getMarks() {
		return Marks;
	}

	public void setMarks(int marks) {
		Marks = marks;
	}
	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", ID=" + ID + ", Marks=" + Marks + "]";
	}
	
}

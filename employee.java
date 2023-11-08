package Sorting;

public class employee {
	
	private String name ;
	private int id;
	private float salary ;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public employee(String name, int id, float salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "employee [name=" + name + ", id=" + id + ", salary=" + salary + "]";
	}

}

package Stack_using_Array;

public class Employee {
	
	private String name ;
	private int emdID ;
	private float Sal ;
	public Employee(String name, int emdID, float sal) {
		super();
		this.name = name;
		this.emdID = emdID;
		Sal = sal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmdID() {
		return emdID;
	}
	public void setEmdID(int emdID) {
		this.emdID = emdID;
	}
	public float getSal() {
		return Sal;
	}
	public void setSal(float sal) {
		Sal = sal;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", emdID=" + emdID + ", Sal=" + Sal + "]";
	}
	
	

}

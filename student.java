package Stack_using_Array;

public class student{
	
	String name;
	int id;
	//address add;
	
	public student() {
		name="Dwarkesh";
		id = 121;
		//add = new address();
	}
	
	public student(String name ,int id) {
		this.id=id;
		this.name=name;
		//this.add=new address(city,Area,state);
		
	}
	
	public void display() {
		
		System.out.println(this.id +" "+this.name);
		//add.display();
		//System.out.print(add.display());
	}

	@Override
	public String toString() {
		return "student [name=" + name + ", id=" + id + "]";
	}
	
	

}

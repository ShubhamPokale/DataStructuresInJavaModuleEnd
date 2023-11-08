package Stack_using_Array;

public class Employee_user {
	
	public static void main(String[] args) {
		
		Employee []E = new Employee[5];
		
		E[0]=new Employee("Dwarkesh", 101, 50000f);
		E[1]=new Employee("Amey", 102, 515242f);
		E[2]=new Employee("chandu", 103, 545123f);
		E[3]=new Employee("Yash", 104, 556455f);
		E[4]=new Employee("Rushi", 105, 5889523f);
		
		
		
		
		Employee_Stack Emp = new Employee_Stack();
		
		Emp.push(E[0]);
		Emp.push(E[1]);
		Emp.push(E[2]);
		Emp.push(E[3]);
		
		
		System.out.println("Before pop :" );
		Emp.print_IntStack();
		
	
		
		System.out.println("After pop :");
		Emp.pop();
		Emp.print_IntStack();
		

		System.out.println("peek element is :" + Emp.peek());
		
		
		System.out.println("isFull  :"+Emp.isFull());
		
		System.out.println("isEmpty :" + Emp.isEmpty());
		
		//Emp.print_IntStack();
		
	}

}

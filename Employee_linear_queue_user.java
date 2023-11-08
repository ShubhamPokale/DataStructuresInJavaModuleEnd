package Queue;

import Sorting.employee;

public class Employee_linear_queue_user {
	
	public static void main(String[] args) {
		
		Employee Emp[] = new Employee[5];
		
		
		Emp[0]=new Employee("Dwarkesh", 100, 12000f);
		Emp[1]=new Employee("Amey", 101, 15000f);
		Emp[2]=new Employee("Chandu", 112, 13000f);
		Emp[3]=new Employee("Nishant", 130, 1000f);
		Emp[4]=new Employee("Prajwal", 105, 17000f);
		
		
		Employee_linear_Queue E = new Employee_linear_Queue(5);
		
		E.Enqueue(Emp[0]);
		E.Enqueue(Emp[1]);
		E.Enqueue(Emp[2]);
		
		
		System.out.println("Employee list :");
		E.Display();
		
		E.Dequeue();
		
		System.out.println("after Dquee : ");
		
		E.Display();
		
		System.out.println("isfull :" + E.isFull() + "   " + "isempty "+ E.isEmpty() );
		
		System.out.println(E.peek());
	
	}

}

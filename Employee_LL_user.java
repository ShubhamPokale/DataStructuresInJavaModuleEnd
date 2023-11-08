package Linked_List;

public class Employee_LL_user {
	
	public static void main(String[] args) {
		
		Employee_LinkedList Emp = new Employee_LinkedList();
		
		Employee E1 = new Employee("Dwarkesh", 101, 500000f);
		Employee E2 = new Employee("Amey", 102, 700000f );
		Employee E3 = new Employee("Veer", 103, 800000f);
		Employee E4 = new Employee("Rushi", 104 , 900000f);
		Employee E5 = new Employee("Chandu", 105, 8000f);
		Employee E6 = new Employee("sarthak", 120, 100200f);
		Employee E8 = new Employee("Prajwal", 150, 120000f);
		Employee E9 = new Employee("Abhi", 140, 121451f);
		
		Emp.insert_at_first(E1);
		Emp.insert_at_first(E2);
		Emp.insert_at_first(E3);
		Emp.insert_at_first(E4);
		Emp.insert_at_last(E5);
		Emp.insert_at_last(E6);
		Emp.insert_by_pos(E8, 3);
		
		Emp.Display();
		
		
		
		
		System.out.println("After delete first ");
		
		Emp.delete_first();
		
		Emp.Display();
		
		System.out.println("After delete last ");
		
		Emp.delete_last();
		Emp.Display();
		
		
		System.out.println("After delete by pos :");
		
		Emp.delete_by_pos(2);
		
		Emp.Display();
		
		System.out.println("After insertion sorted : ");
		
		Emp.inseret_sord(E9);
		
		Emp.Display();
		
		System.out.println("------------------------------------------------------");
		
		System.out.println("Reverese the linked_list : ");
		
		Emp.Reverse();
		
		Emp.Display();
		

	}
}

package Stack_using_Array;

public class Employee_Stack {
	
	private Employee []arr ;
	
	private int top ;
	
	public Employee_Stack() {
		arr = new Employee[5];
		top=-1;
	}
	
	public void push(Employee E) {
		if(isFull()) {
			System.out.println("\nOver Flow !!!");
		}
		top++;
		arr[top]=E;
	}
	
	public boolean isFull() {
		if(top==arr.length-1) {
			return true ;
			
		}
		else {
			return false ;
		}
	}
	
	public Employee pop() {
		
		Employee E = null ;
		if(isEmpty()) {
			System.out.println("\nUnder flow");
		}
		else {
			E = arr[top];
			top = top - 1;
			
		}
		
		return E ;
		
	}
	
	public boolean isEmpty() {
		
		if(top==-1) {
			return true ;
		}
		else
			return false ;
		
	}
	
	public Employee peek() {
		
		Employee E = null ;
		if(isEmpty()) {
			System.out.println("\n Employee Stack is Empty  !! ");
		}
		else {
			E = arr[top];
		}
		
		return E ;
	}
	
	public void print_IntStack() {
		int i  ;
		for(i=0 ; i <= top ; i++) {
			
			System.out.println(arr[i].toString() +" ");
		}
	
	}
}



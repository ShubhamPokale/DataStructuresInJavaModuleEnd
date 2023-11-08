package Queue;

import Sorting.employee;

public class Employee_linear_Queue {
	
	private Employee[] arr;
	private int front , rear ;
	
	public Employee_linear_Queue() {
		
		arr = new Employee[5];
		front=rear = -1 ;
	}
	
	public Employee_linear_Queue(int s) {
		arr = new Employee[s];
		front = rear = -1 ;
	}
	
	public boolean isFull(){
		
		if(rear == arr.length-1)
			return true ;
		else
			return false ;
	}
	
	public boolean isEmpty() {
		
		if((front==-1) || (front-rear==1)){
			return true ;
		}
		else
			return false ;
		
	}
	
	public void Enqueue(Employee E) {
		
		if(isFull()) {
			System.out.println("\n Overflow ");
		}
		if(front==-1) {
			front=0;
			
		}
		rear++;
		arr[rear]= E;
	}
	
	public Employee Dequeue() {
		
		if(isEmpty()) {
			System.out.println("\n Underflow !!!");
		}
		Employee E = arr[front];
		front++;
		return E ;
	}
	
	
	public Employee peek() {
		
		if(isEmpty()) {
			System.out.println("\n no element in the Queue :");
			
		}
		return arr[front];
	}
	
	public void Display() {
		
		for(int i= front ; i<= rear ; i++ ) {
			
			System.out.println(arr[i].toString()+ " ");

		}
	}

}

package Stack_using_Array;

public class Student_Stack {
	
	private student[] arr;
	private int top;

	public Student_Stack() {
		arr = new student[15];
		top = -1;
	}

	public void push(student d) {

		if (IsFull()) {
			System.out.println(" Overflow !!! ");
		}
		top++;
		arr[top] = d;

	}

	public boolean IsFull() {

		if (top == arr.length - 1) {
			return true;
		} else {
			return false;
		}
	}

	public student pop() {
		student d = null ;
		if (Isempty()) {
			System.out.println(" Underflow !!!!   ");
		}

		else {
			d = arr[top];
			top = top - 1;

		}
		return d;
	}

	public boolean Isempty() {

		if (top == -1) {
			return true;
		} else {
			return false;

		}
	}

	public student peek() {

		student d = null ;
		if (Isempty()) {
			System.out.println(" Stack is empty !!!  ");
		}

		else {

			d = arr[top];
		}
		return d;
	}

	
	public void print_student_Stack() {
		int i  ;
		for(i=0 ; i <= top ; i++) {
			
			System.out.println(arr[i] +" ");
		}
		
		
	}
}
	



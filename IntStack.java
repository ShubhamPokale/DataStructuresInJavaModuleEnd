package Stack_using_Array;

import java.util.Scanner;

public class IntStack {

	private int[] arr;
	private int top;

	public IntStack() {
		arr = new int[15];
		top = -1;
	}

	public void push(int d) {

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

	public int pop() {
		int d = -999;
		if (IsFull()) {
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

	public int peek() {

		int d = -999;
		if (Isempty()) {
			System.out.println(" Stack is empty !!!  ");
		}

		else {

			d = arr[top];
		}
		return d;
	}

	
	public void print_IntStack() {
		int i  ;
		for(i=0 ; i <= top ; i++) {
			
			System.out.print(arr[i] +" ");
		}
		
		
		
	}
	/*
	 * public class studentStack { int rollno ; String name ; float fee ;
	 * 
	 * 
	 * public student() { System.out.println("i am Student ");
	 * 
	 * } public student(int R,String N ,float F) { // this.rollno=rollno ; //
	 * this.name=name; // this.fee=fee; rollno=R; name=N; fee=F ; //
	 * 
	 * 
	 * } void display(){ System.out.println(this.rollno+" "+this.name+" "+this.fee);
	 * }
	 * 
	 * }
	 */
}

	 

	

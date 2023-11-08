package Stack_using_Array;

public class Char_Stack {


		private char[] arr;
		private int top;

		public Char_Stack() {
			arr = new char[15];
			top = -1;
		}
		

		public void push(char d) {

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

		public char pop() {
			char d = '*';
			if (Isempty()) {
				System.out.println(" Underflow !!!!   ");
			}

			else {
				d = arr[top];
				top = top - 1;

			}
			return (char)d;
		}

		public boolean Isempty() {

			if (top == -1) {
				return true;
			} else {
				return false;

			}
		}

		public char peek() {

			char d = '*';
			if (Isempty()) {
				System.out.println(" Stack is empty !!!  ");
			}

			else {

				d = arr[top];
			}
			return d;
		}
		
		
		public void print_char() {
			
			int i;
			for(i=0 ; i<= top ; i++) {
				System.out.print(arr[i] + " " );
			}
			
			
		}

	
	

}

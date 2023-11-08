package Stack_using_Array;

public class Stack_user {

	public static void main(String[] args) {
		
		{

			//int data ; 
			//char ch ;
//			/*
//			 * IntStack S1 = new IntStack();
//			 * 
//			 * 
//			 * S1.push(20); S1.push(23); S1.push(50); S1.push(40);
//			 * 
//			 * S1.print_IntStack();
//			 * 
//			 * 
//			 * 
//			 * System.out.println(); System.out.println("the pop element : "+ S1.pop() );
//			 * 
//			 * S1.print_IntStack(); System.out.println();
//			 * 
//			 * 
//			 * 
//			 * 
//			 * Char_Stack Ch = new Char_Stack();
//			 * 
//			 * 
//			 * Ch.push('A'); Ch.push('B'); Ch.push('C'); Ch.push('D');
//			 * 
//			 * Ch.print_char();
//			 * 
//			 * System.out.println();
//			 * 
//			 * System.out.println("pop element is   :" + Ch.pop());
//			 * System.out.println("peek element is   : " + Ch.peek() );
//			 * 
//			 * System.out.println();
//			 * 
//			 * Ch.print_char(); System.out.println();
//			 * 
//			 * System.out.println("Isfull   :" + Ch.Isempty() );
//			 * System.out.println("Isempty   : " + Ch.IsFull());
//			 */
			
			Student_Stack S1 = new Student_Stack();
			
			
			student A = new student("Dwarkesh" , 101);
			student B = new student("Amey" , 102);
			student C = new student("Chandu", 103);
			
			S1.push(A);
			S1.push(B);
			S1.push(C);
			
			S1.print_student_Stack();
			
			
		System.out.println("pop Student : " + 	S1.pop() );
		
		
		S1.print_student_Stack();
		
		
		System.out.println("pop Student : " + S1.pop());
		
		S1.print_student_Stack();
		
		
		System.out.println("IsEmpty    :" + S1.Isempty());
		
		
		
		System.out.println("Isfull   :" + S1.IsFull());
		
		System.out.println(S1.peek());
		
	}
}

}
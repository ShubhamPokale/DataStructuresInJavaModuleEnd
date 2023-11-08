package Queue;

public class Student_Circular_queue {
	
	private Student []arr;
	private int front , rear ;
	
	public Student_Circular_queue() {
		arr = new Student[5];
		front=rear=-1;
		
	}
	public Student_Circular_queue(int s) {
		arr = new Student[s];
		front=rear=-1;
	}
	
	public boolean isFull() {
		
		if(((front==0)&& (rear==arr.length-1))|| (front - rear == 1)){
			
			return true ;

		}
		else {
			return false;
		}
	}
	
	public boolean isEmpty() {
		
		if(front==-1) {
			return true ;
		}
		else {
			return false ;
		}
	}
	
	public void Equeue(Student S) {
		
		if(isFull()) {
			System.out.println("\n overflow ");
			return ;
		}
		if(front == -1) {
			front=0;
		}
		if(rear == arr.length) 
			rear =0 ;
		else
			rear = rear+1 ;
		arr[rear] = S ;

	}
	
	public Student Deque() {
		
		Student S = null ;
		if(isEmpty()) {
			System.out.println("\n Underflow ");
			return S ;
		}
		
		S = arr[front];
		if(front == rear ) {
			front = -1;
			rear = -1;
		}
		else if(front == arr.length-1) {
			front = 0;
		}
		else
			front = front + 1;
		
		return S ;
		
	}
	
	public Student peek() {
		
		if(isEmpty()) {
			System.out.println("your is queue is empty ");
		}
		return arr[front];
		
	}
	
public void Print_circular_queque() {
		
		int i;
		for(i=front ; i <= rear ; i++) {
			
			System.out.println(arr[i].toString() + "  ");
			
			
		}
	}


public static void main(String[] args) {
	
	Student_Circular_queue S1 = new Student_Circular_queue();
	
	Student s1 = new Student("Dwarkesh", 100, 100);
	Student s2 = new Student("Amey", 101, 99);
	Student s3 = new Student("Yash", 105, 102);
	Student s4 = new Student("Chandu", 102, 105);
	Student s5 = new Student("Rushi", 120, 120);
	
	
	S1.Equeue(s1);
	S1.Equeue(s2);
	S1.Equeue(s3);
	S1.Equeue(s4);
	S1.Equeue(s5);
	
	System.out.println("Student circular queue :");
	
	S1.Print_circular_queque();
	
	S1.Deque();
	S1.Deque();
	System.out.println("After deque :");
	
	S1.Print_circular_queque();
	
	System.out.println("peek is :"+ S1.peek());
	
	System.out.println("isFull : "+ S1.isFull() +   "   " + "isEmpty : " + S1.isEmpty() );

}

}

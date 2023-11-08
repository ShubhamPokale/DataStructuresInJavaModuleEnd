package Linked_List;

public class Queue_using_LL {
	
	private intNode front ;
	private intNode rear ;
	
	
	public Queue_using_LL() {
		
		front = rear = null ;
		
		
	}
	
	public boolean isEmpty() {
		
		if(front == null ) {
			//System.out.println("LL is Empty !!! ");
			return true;
		}
		else {
			return false;
		}
		

	}
	
	public void Eneque(int d) {
		
		
		intNode new_node = new intNode(d);
		
		if(isEmpty()) {
			//System.out.println(" overflow  !!! ");
			//return true;
			front = new_node;
			rear = new_node ;
			return ;
		}
		rear.setNext(new_node);
		rear = new_node ;
	}
	
	public int deque() {
		
		
		intNode deletable ;
		int d=-999 ;
		if(isEmpty()) {
			return d;
		
		}
		deletable = front;
		d = deletable.getData();
		
		front=front.getNext();
		deletable.setNext(null);
		deletable= null ;
		return d;	
	}
	
	public int peek() {

		int d = -999;

		if (isEmpty()) {

			System.out.println("list is Empty !!! ");
			return d;
		}

		d = front.getData();

		System.out.println("top element is : ");

		return d ;

	}
	
public void Display() {
		
		if(front == null) {
			System.out.println("My linked List is empty ....! ");
			return ;
		}
		intNode iterator = front ;
		while(iterator != null ) {
			System.out.print(iterator.getData()+" ");
			iterator = iterator.getNext();	
		}
		return;
	}

public String toString() {
	
	String str = "" ;
	intNode iter ;
	if(front==null) {
		str = str + "list is empty";
		return str ;
	}
	
	iter = front ;
	 
	while(iter != null  ){
		
		str = str + iter.getData() + " " ;
		iter = iter.getNext();
	}
	
	str = str + "\n" ;
	
	return str ;
	
	}
	
	
	
	public static void main(String[] args) {
		
		Queue_using_LL Q1 = new Queue_using_LL();
		
		Q1.Eneque(10);
		Q1.Eneque(20);
		Q1.Eneque(30);
		Q1.Eneque(40);
		
		System.out.println(" \n Queue after enque is : ");
		
		Q1.Display();

		System.out.println(" \n Afte deque element is : ");
		Q1.deque();
		
	
	
		System.out.println(Q1.toString());
		
	
		//Q1.Display();
		
		
		System.out.println();
		System.out.println(Q1.peek());
		
		Q1.deque();
		
		System.out.println(Q1.peek());
	} 

}

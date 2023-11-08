package Queue;

public class Circular_Queue {
	
	private int []arr ;
	private int front , rear ;
	
	public Circular_Queue() {
		
		arr = new int[10];
		front = rear = -1 ;
		
		
	}
	public Circular_Queue(int S) {
		
		arr = new int[S];
		
		front = rear = -1 ;
	}
	
	public boolean isFull() {
		
		if(((front==0) && (rear == arr.length-1)) || (front - rear == 1 )) {
			
			return true ;
			
		}
		else {
			return false;
		}
	
	}
	
	public boolean isEmpty() {
		
		if(front == -1)
			return true;
		else
			return false ;
	}
	
	public void Equeue(int d ) {
		
		if(isFull()){
			System.out.println("\n Overfollow !!! ");
			return ;
		}
		if(front == -1) {
			front=0;
			
		}
		if(rear == arr.length-1) 
		{
			rear=0;
		}
		else {
			rear = rear + 1 ;
		}
		
		arr[rear]=d;
	
	}
	
	public int Dueque() {
		
		int d = -999 ;
		if( isEmpty() ) {
			System.out.println("\n under flow !!! ");
			return d ;
		}
		
		d = arr[front];
		if(front == rear) {
			front = -1;
			rear = -1 ;
		}
		
		else if(front == arr.length-1) {
			front = 0 ;
		}
		else
			front = front + 1 ;
		
		return d ;
		
	}
	
	public void Display() {
		int i;
		for( i=rear ; i >= front ; i-- ) {
			System.out.print(arr[i] + " ");
		}
		
	}

}

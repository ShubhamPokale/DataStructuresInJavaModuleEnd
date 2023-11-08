package Queue;

public class linear_Queue {
	
	private int[] arr;
	private int front , rear ;
	
	public linear_Queue() {
		
		arr = new int[10];
		front = rear = -1 ;
		
	}
	
	public linear_Queue(int s) {
		
		arr = new int[s];
		front=rear=-1 ;
		
	}
	
	public boolean isFull() {
		
		if(rear==arr.length-1)
			return true;
		else 
			return false ;
		
	}
	public boolean isempty() {
		
		if((front == -1) || ((front-rear)==-1)) {
			return true ;
			
		}
		else {
			return false;
		}
	}
	
	
	public void Enque(int d) {
		
		if(isFull()) {
			System.out.println("Overflow !!!!! ");
		}
		if( front==-1 )
			front = 0 ;
		 
		rear++;
		arr[rear]=d;
		
	}
	
	public int Deque() {
		if(isempty()) {
			return -999 ;
		}
		int d= arr[front];
		front++;
		return d;	
	}
	
	public int peek() {
		
		if(isempty()) {
			return -999;
		}
		return arr[front];
		
	}
	
	public void Print_linear_queque() {
		
		int i;
		for(i=front ; i <= rear ; i++) {
			
			System.out.print(arr[i] + "  ");
			
			
		}
		
		
		
	}
	
	
	

}

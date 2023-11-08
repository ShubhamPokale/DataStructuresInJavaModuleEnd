package Queue;

public class Main_linear_Q {
	
	public static void main(String[] args) {
		
		linear_Queue L1 = new linear_Queue();
		
		L1.Enque(10);
		L1.Enque(20);
		L1.Enque(30);
		L1.Enque(40);
		L1.Enque(50);
		L1.Enque(60);
		L1.Enque(70);
		L1.Enque(80);
		L1.Enque(90);
		//L1.Enque(100);
		
		
		L1.Print_linear_queque();
		System.out.println();
		
		L1.Deque();
		
		
		System.out.println(L1.peek());
		
		L1.Print_linear_queque();
		System.out.println();
		
		L1.Deque();
		
		
		System.out.println(L1.peek());
		
		
		L1.Print_linear_queque();
		System.out.println();
		
		
		System.out.println("Isempty is : " + L1.isempty());
		
		System.out.println("Isfull is : " + L1.isFull());
		
	}

}

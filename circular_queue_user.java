package Queue;

public class circular_queue_user {
	
	public static void main(String[] args) {
		
		 Circular_Queue C1 = new Circular_Queue();
		 
		 C1.Equeue(10);
		 C1.Equeue(20);
		 C1.Equeue(30);
		 C1.Equeue(40);
		 C1.Equeue(50);
		 C1.Equeue(60);
		 C1.Equeue(70);
		 C1.Equeue(80);
		 C1.Equeue(90);
		 C1.Equeue(100);
		 
		 //System.out.println();
		 
		 System.out.println("\ncircular_queue  : ");
		 
		 C1.Display();
		 
		 C1.Dueque();
		 C1.Dueque();
		 
		 System.out.println("\nCircular_queue After Dueue :");
		 
		 
		 C1.Display();	
	}

}

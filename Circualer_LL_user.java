package Linked_List;

import java.awt.geom.Arc2D;

//import Queue.circular_queue_user;

public class Circualer_LL_user {
	
	public static void main(String[] args) {
		
		Circular_linked_list  C1 = new Circular_linked_list();
		
		C1.insert_first(10);
		C1.insert_first(20);
		C1.insert_first(30);
		C1.insert_first(40);
		C1.insert_first(50);
		
		System.out.println("Circular Linked_list  : ");
		
		System.out.println(C1.toString());
		
		System.out.println("After the insert at last : ");
		
		C1.insert_last(60);
		C1.insert_last(70);
		C1.insert_last(80);
		C1.insert_last(90);
		C1.insert_last(100);
		C1.insert_last(110);
		
		System.out.println(C1.toString());
		
		C1.insert_at_posotion(200, 4);
		
		System.out.println("after insert at pos");
		
		System.out.println(C1.toString());
		
		C1.delete_first();
		
		System.out.println("After delete_first  : ");
		
		System.out.println(C1.toString());
		
		
		
		
		C1.delete_last();
		C1.delete_last();
		System.out.println("After delete_last ");
		
		
		
		System.out.println(C1.toString());
		
		
	
	}

}

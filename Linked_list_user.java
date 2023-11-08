package Linked_List;

import java.util.LinkedList;

public class Linked_list_user {
	
	public static void main(String[] args) {
		
		linked_list L1 = new linked_list();
		
		linked_list L2 = new linked_list();
		
		linked_list L3 = new linked_list();
	
		//linked_list L5 = new linked_list();
		
//		L1.insert_at_last(100);
//		/*
//		 * L1.insert_at_last(110); L1.insert_at_last(130);
//		 */
		
		System.out.println("\n insert at first ");
		L1.insert_at_last(121);
		L1.insert_at_last(212);
		L1.insert_at_last(304);
		L1.insert_at_last(418);
		L1.insert_at_last(623);
		L1.insert_at_last(825);
		
		System.out.println("L1 :");
		
		L1.Display();
		System.out.println("\n Reverse Linked_list L1 :");
		L1.reverseRecusive(L1.getHead());
		
		
		System.out.println();
		
		L2.insert_at_last(100);
		L2.insert_at_last(200);
		L2.insert_at_last(300);
		L2.insert_at_last(400);
		L2.insert_at_last(600);
		L2.insert_at_last(800);
		
		System.out.println("L2 :");
		
		

		L2.Display();
		
		
	
		//L1.Odd_even();
		
		L3.Sorted_Merged();
		
		
		
		
		//L3.Display();
		
		
		/*
		System.out.println("Sum of LL :");
		
		System.out.println(L1.Sum_of_linkedlist());
		
		
		System.out.println("\n insert at last ");
		
		L1.insert_at_last(200);
	L1.insert_at_last(100);
	L1.insert_at_last(140);
		L1.Display();
		*/
		
		
		//L1.to_String();
		
		/*
		System.out.println();
		
		L1.insert_at_posotion(55, 4);
		
		System.out.println(" \n After insert at position : ");
		
		L1.Display();
		
		L1.Delete_first();
		System.out.println(" \n After deletion at first  :");
		
		L1.Display();
		
		L1.Delete_last();
		
		System.out.println(" \n After deletion at last : ");
		L1.Display();
		
		
		L1.Delete_By_position(2);
		
		System.out.println(" \n After Deletion At positon :");
		
		L1.Display();
		
		
		L1.Reverse();
		
		System.out.println("\n After Reversing the linked List : ");
		
		
		
		L1.Display();
		*/
		
		
		
		//L1.to_String();
		
	}

}

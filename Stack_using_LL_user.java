package Linked_List;

public class Stack_using_LL_user {
	
	public static void main(String[] args) {
		
		Stack_using_LL L1 = new Stack_using_LL();
		
		L1.push(10);
		L1.push(20);
		L1.push(30);
		L1.push(40);
		L1.push(50);
		
		System.out.println("\n stack using LL is after push operation :");
		
		L1.Display();
		
		L1.pop();
		
		L1.pop();
		
		System.out.println("\n After pop operation : \n ");
		
		L1.Display();
		//System.out.println();
		System.out.println();
		System.out.println(L1.peek());
		
		//L1.Display();
			
	}

}

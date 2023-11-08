package Linked_List;

public class Stack_using_LL {

	private intNode top;

	public Stack_using_LL() {
		top = null;

	}

	public void push(int d) {

		intNode new_node = new intNode(d);

		if (top == null) {
			top = new_node;
			return;
		}

		new_node.setNext(top);
		top = new_node;
		return;

	}

	public boolean isempty() {

		if (top == null) {
			System.out.println("Underflow !!!! ");
			return true;

		} else {
			return false;
		}

	}

	public int pop() {

		intNode deletable;
		int d = -999;

		if (isempty()) {

			System.out.println("list is Empty !!! ");
			return d;
		}
		deletable = top;
		top = top.getNext();
		d = deletable.getData();

		deletable = null;
		return d;

	}

	public int peek() {

		int d = -999;

		if (isempty()) {

			System.out.println("list is Empty !!! ");
			return d;
		}

		d = top.getData();

		System.out.println("top element is : ");

		return d;

	}
	
	public void Display() {
		
		if(top == null) {
			System.out.println("My linked List is empty ....! ");
			return ;
		}
		intNode iterator = top ;
		while(iterator != null ) {
			System.out.print(iterator.getData()+" ");
			iterator = iterator.getNext();	
		}
		return;
	}

}

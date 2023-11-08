package Linked_List;

public class intNode {
	
	private int data;
	private intNode next ;
	
	
	public intNode() {
		
		this.data= 0;
		this.next = null;
		
	}
	public intNode(int D) {
		this.data=D;
		this.next= null;
		
	}
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public intNode getNext() {
		return next;
	}
	public void setNext(intNode next) {
		this.next = next;
	}

}

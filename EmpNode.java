package Linked_List;

public class EmpNode {
	
	private Employee data ;
	private EmpNode next ;
	
	public EmpNode() {
		
		data = null  ;
		next = null ;
		
	}
	
	
	public EmpNode(Employee data) {
		//super();
		this.data = data;
		this.next = null ;
	}
	
	public EmpNode getNext() {
		return next;
	}

	public void setNext(EmpNode next) {
		this.next = next;
	}


	public Employee getData() {
		return data;
	}


	public void setData(Employee data) {
		this.data = data;
	}

}

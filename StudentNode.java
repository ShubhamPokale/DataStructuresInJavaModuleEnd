package Linked_List;

public class StudentNode{
	private Student S ;
	private StudentNode next ;
	
	public StudentNode() {
		S = null ;
		this.next=null ;
	}
	
	public StudentNode(Student s) {
		//super();
		S = s;
		this.next = null ;
	}
	public Student getS() {
		return S;
	}
	public void setS(Student s) {
		S = s;
	}
	public StudentNode getNext() {
		return next;
	}
	public void setNext(StudentNode next) {
		this.next = next;
	}
	
}

package Linked_List;

public class Student_Circularlist {
	
	
private StudentNode last ;
	
	public Student_Circularlist() {
		last = null ;
	}
	
	public void insert_first(Student S) {
		
		StudentNode new_node = new StudentNode(S);
		
		if(last == null) {
			last = new_node ;
			last.setNext(last);
			return ;
		}
		new_node.setNext(last.getNext());
		last.setNext(new_node);
		return ;
	}
	
	public void insert_last(Student S) {
		
		StudentNode new_node = new StudentNode(S);
		
		if(last == null ) {
			last= new_node ;
			last.setNext(last);
			return ;
			
		}
		
		new_node.setNext(last.getNext());
		last.setNext(new_node);
		last = new_node ;
		return ;
	}
	
	
public void insert_at_posotion(Student S , int pos) {
		
		StudentNode new_node  = new StudentNode(S);
		int i ;
		if(last==null) {
			last = new_node ;
			return ;
		}
		
		if(pos == 1) {
			
			new_node.setNext(last);
			last=new_node;
			return ;	
		}
		StudentNode iterator = last ;
		
		for(i=1 ; i < pos  && iterator.getNext()!=null  ; i++ ) {
			
			iterator=iterator.getNext();

		}
		new_node.setNext(iterator.getNext());
		iterator.setNext(new_node);
		
		return ;
	}
	


public Student delete_first() {
	
	Student S =null ;
	
	StudentNode delatable;
	
	if(last == null) {
		
		System.out.println("Empty !!!!! ");
		return S ;
		
	}
	
	if(last.getNext() == last){
		
		last.setNext(null);
		S=last.getS();
		last = null ;
		return S ;
	}
	
	delatable = last.getNext();
	last.setNext(delatable.getNext());
	
	S=delatable.getS();
	
	delatable= null ;
	return S ;
	
}

public Student delete_last() {
	
	Student S= null ;
	StudentNode deletable ;
	if(last == null) {
		System.out.println("Empty !!! ");
		return S ;
	}
	
	if(last.getNext()==last) {
		last.setNext(null);
		S=last.getS();
		last=null;
		return S ;
	}
	
	
	StudentNode iter = last.getNext();
	
	
	while(iter.getNext()!=last)
	{
		iter = iter.getNext();

		//return d ;	
		//return d;
	}
	deletable = iter.getNext();
	iter.setNext(last.getNext());
	S=deletable.getS();
	deletable.setNext(null);
	last = iter ;
	deletable = null ;
	return S ;
	
	
}
	
	
	public String toString() {
		
		String str = " " ;
		StudentNode iter ;
		if(last==null) {
			str = str + "list is empty";
			return str ;
		}
		
		iter = last.getNext();
		do {
			
			str = str + iter.getS() + " " ;
			iter = iter.getNext();
		}while(iter != last.getNext());
		
		str = str + "\n" ;
		
		return str ;
		
		}
}

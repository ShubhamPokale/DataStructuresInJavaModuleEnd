package Linked_List;

public class Circular_linked_list {
	
	private intNode last ;
	
	public Circular_linked_list() {
		last = null ;
	}
	
	
	public void insert_first(int d) {
		
		intNode new_node = new intNode(d);
		
		if(last == null) {
			last = new_node ;
			last.setNext(last);
			return ;
		}
		new_node.setNext(last.getNext());
		last.setNext(new_node);
		return ;
	}
	
	public void insert_last(int d) {
		
		intNode new_node = new intNode(d);
		
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
	
	
public void insert_at_posotion(int d , int pos) {
		
		intNode new_node  = new intNode(d);
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
		intNode iterator = last ;
		
		for(i=1 ; i < pos  && iterator.getNext()!=null  ; i++ ) {
			
			iterator=iterator.getNext();

		}
		new_node.setNext(iterator.getNext());
		iterator.setNext(new_node);
		
		return ;
	}
	


public int delete_first() {
	
	int d =-999 ;
	
	intNode delatable;
	
	if(last == null) {
		
		System.out.println("Empty !!!!! ");
		return d ;
		
	}
	
	if(last.getNext() == last){
		
		last.setNext(null);
		d=last.getData();
		last = null ;
		return d ;
	}
	
	delatable = last.getNext();
	last.setNext(delatable.getNext());
	
	d=delatable.getData();
	
	delatable= null ;
	return d ;
	
}

public int delete_last() {
	
	int d= -999 ;
	intNode deletable ;
	if(last == null) {
		System.out.println("Empty !!! ");
		return d ;
	}
	
	if(last.getNext()==last) {
		last.setNext(null);
		d=last.getData();
		last=null;
		return d ;
	}
	
	
	intNode iter = last.getNext();
	
	
	while(iter.getNext()!=last)
	{
		iter = iter.getNext();
		deletable = iter.getNext();
		iter.setNext(last.getNext());
		d=deletable.getData();
		deletable.setNext(null);
		last = iter ;
		deletable = null ;
		//return d ;	
		//return d;
	}
	return d ;
	
	
}
	
	
	public String toString() {
		
		String str = " " ;
		intNode iter ;
		if(last==null) {
			str = str + "list is empty";
			return str ;
		}
		
		iter = last.getNext();
		do {
			
			str = str + iter.getData() + " " ;
			iter = iter.getNext();
		}while(iter != last.getNext());
		
		str = str + "\n" ;
		
		return str ;
		
		}

}

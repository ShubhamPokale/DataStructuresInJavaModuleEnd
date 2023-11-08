package Linked_List;

public class linked_list {
	private intNode head ;
	
	public intNode getHead() {
		return head;
	}

	public void setHead(intNode head) {
		this.head = head;
	}

	public linked_list() {
		
		this.head = head ;
		
	}
	
	public void insert_at_first(int d) {
		
		intNode new_node = new intNode(d);
		
		if(head == null) {
			head = new_node ;
			return ;
		}
		
		new_node.setNext(head);
		head = new_node ;
		return  ; 
	}
	
	public void insert_at_last(int d) {
		
		intNode new_node = new intNode(d);
		
		if(head==null) {
			head = new_node ;
			return ;
		}
		intNode iterator = head ;
		while(iterator.getNext()!=null)
		{
			iterator = iterator.getNext();
		}
		iterator.setNext(new_node);
		return ;	
	}
	
	public void insert_at_posotion(int d , int pos) {
		
		intNode new_node  = new intNode(d);
		int i ;
		if(head==null) {
			head= new_node ;
			return ;
		}
		
		if(pos == 1) {
			
			new_node.setNext(head);
			head=new_node;
			return ;
			
			
		}
		intNode iterator = head;
		
		for(i=1 ; i < pos-1 && iterator.getNext()!=null  ; i++ ) {
			
			iterator=iterator.getNext();

		}
		new_node.setNext(iterator.getNext());
		iterator.setNext(new_node);
		
		return ;
	}
	
	public int Delete_first() {
		intNode Deletable ;
		int d ;
		if(head == null) {
			System.out.println("List is empty ..... !!  ");
			return -999 ;
			
		}
		
		Deletable = head ;
		head = head.getNext();
		d=Deletable.getData();
		
		Deletable = null ;
		
		return d ;
	}
	
	
	public int Delete_last() {
		
		intNode deletable ; 
		int d ;
		if(head == null) {
			System.out.println("List is empty !!! ");
			return -999;
		}
		
		if(head.getNext() == null) {
			d = head.getData();
			deletable = head ;
			head = null;
			deletable = null ;
			
		}
		
		intNode iter = head ;
		
		while(iter.getNext().getNext() != null) {
			iter = iter.getNext();
		}
		
		deletable = iter.getNext();
		d = deletable.getData() ;
		
		iter.setNext(null);
		
		deletable = null ;
		return d ;
		
	}
	
	
	public int Delete_By_position(int  pos ){
		
		int d ;
		intNode deletable ;
		if(head == null) {
			System.out.println("List is empty !!!!  ");
			return -999;
		}
		
		if(pos == 1 ) {
			deletable = head ;
			head = head.getNext();
			d=deletable.getData();
			
			deletable = null ;
			
			return d ;
		}
		
		
		if(head.getNext() == null) {
			System.out.println("Invalid Postion !!!!");
		}
		
		int i ; 
		intNode iter = null ;
		
		for(i=1 , iter = head ; i < pos - 1 && iter.getNext()!=null ; i++  , iter=iter.getNext() );
		
		if(iter.getNext()==null) {
			System.out.println("Invalid position !!! ");
			return -999 ;
		}
		
		
		deletable = iter.getNext();
		d=deletable.getData();
		iter.setNext(deletable.getNext());
		return d;
		
	}
	
	
	
	public void inseret_sord(int d) {
		
		intNode new_node = new intNode(d);
		
		if( (head == null) || (d<head.getData())) {
			
			new_node.setNext(head);
			head = new_node;
			return ;
			
		}
		
		intNode iter = head ;
		while((iter.getNext() != null ) && (d<iter.getNext().getData())){
			
			iter=iter.getNext();	
		}
		new_node.setNext(iter.getNext());
		iter.setNext(new_node);
		
		return ;	
	}
	
	public int Sum_of_linkedlist() {
		
		intNode iter=head ;
		int  sum = 0 ;
		while(iter != null) {
			sum = sum + iter.getData();
			iter=iter.getNext();
			
		}
		return sum ;
	}
	
	public void Reverse() {
		
		intNode prev , iter , next ;
		prev = null ;
		iter = head ;
	 
		
		while(iter != null) {
			
			
			next = iter.getNext();
			iter.setNext(prev);
			prev = iter ;
			iter = next ;
			
		}
		head = prev ;
	}
	
	
	
	
	
	

	

public void Display() {
	
	if(head == null) {
		System.out.println("My linked List is empty ....! ");
		return ;
	}
	intNode iterator = head ;
	while(iterator != null ) {
		System.out.print(iterator.getData()+" ");
		iterator = iterator.getNext();	
	}
	return;
}

public String to_String()
{
	String Str = new String();
	
	if(head == null) {
		Str = Str + "list  is Empty  !!! " ;
		return Str ;
	}
	
	intNode iterator = head ;
	Str = Str + "List : " ;
	
	while(iterator != null){
		
		Str = Str + iterator.getData() + "->" ;
		iterator = iterator.getNext();
		
	}
	
	Str = Str + " ";
	return Str ;
}


public void Odd_even() {
	
	linked_list L4 = new linked_list() ;
	
	intNode iter1 =  head;
	
	while(iter1 != null) {
		
		if(iter1.getData()%2==0) {
			L4.insert_at_last(iter1.getData());
			iter1=iter1.getNext();
		
		}
		else {
			L4.insert_at_last(iter1.getData());
			iter1=iter1.getNext();
		}
		
	}
	
	System.out.println(" \nLists L4  :");

	L4.Display();
	
}

public void reverseRecusive(intNode iter) {
	
	
	linked_list temp = new linked_list();
	
	if(iter==null)
		return ;
	
	else
	{
		reverseRecusive(iter.getNext());
		temp.insert_at_last(iter.getData());
		
	}
	temp.Display();
	//current.getNext() = null ;
}



public void Sorted_Merged() {
	
	
	intNode iter1;
	intNode iter2 ;
	
	linked_list L1 = new linked_list();
	
	L1.insert_at_last(121);
	L1.insert_at_last(212);
	L1.insert_at_last(304);
	L1.insert_at_last(418);
	L1.insert_at_last(623);
	L1.insert_at_last(825);
	
	linked_list L2 = new linked_list();
	
	L2.insert_at_last(100);
	L2.insert_at_last(200);
	L2.insert_at_last(300);
	L2.insert_at_last(400);
	L2.insert_at_last(600);
	L2.insert_at_last(800);
	
	linked_list L3 = new linked_list();
	
	iter1 = L1.head ;
	iter2 = L2.head ;
	
	
	
	while(iter1 != null && iter2 != null) {
		
		if(iter1.getData() > iter2.getData()) {
			L3.insert_at_last(iter2.getData());
			iter2= iter2.getNext();
		}
		else {
			L3.insert_at_last(iter1.getData());
			iter1 = iter1.getNext();
		}	
	}
	
	
	while(iter1 != null) {
		L3.insert_at_last(iter1.getData());
		iter1= iter1.getNext();		
	}
	
	while(iter2 != null) {
		L3.insert_at_last(iter2.getData());
		iter2 = iter2.getNext();
	}
	
	
	System.out.println();
	
	System.out.println("\n Sorted_LL merged LL is :  ");
	
	L3.Display();
	
	System.out.println();
	
}


}

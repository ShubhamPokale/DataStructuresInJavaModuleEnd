package Binary_tree;

import java.util.LinkedList;

import java.util.Queue;



public class Binary_tree {
	
	//private static final int MIN_INTEGER = 0;
	//private static final int MAX_INTEGER = 0;
	BTnode root ;
	
	//private BTnode new_node ;
	
	public Binary_tree(){
		
		root = null; 
	}

	public BTnode getRoot() {
		return root;
	}

	public void setRoot(BTnode root) {
		this.root = root;
	}
	
	public BTnode create_node(int d) {
		
		if(root == null) {
			root = new BTnode(d);
			return root ;
		}
		
		BTnode new_node = new BTnode(d);
		
		return new_node;
	}
	
	
	public void insert_levelwise(int d) {
		
		BTnode new_node = new BTnode(d);
		
		BTnode iter ;
		
		Queue<BTnode> q = new LinkedList<BTnode>();
		
		if(root == null) {
			root=new_node;
			return ;
		}
		
		q.add(root);
		
		
		while(!q.isEmpty()) {
			
			iter = q.remove();
			if(iter.getLeft()==null) {
				
				iter.setLeft(new_node);
				return ;
				
			}
			
			else {
				q.add(iter.getLeft());
				
			}
			if(iter.getRight()==null){
				iter.setRight(new_node);
				return ;
			}
			else {
				q.add(iter.getRight());
			}
		} // end of while ;
	
	} // end of method ;
	
	public void Level_wise_traversal() {
		
		
		//BTnode new_node = new BTnode(d);
		
		BTnode iter ;
		
		Queue<BTnode> q = new LinkedList<BTnode>();
		
		if(root == null) {
			//root=new_node;
			System.out.println("Empty !!! ");
			//return sum ;
		}
		q.add(root);   // 
		
		
		while(!q.isEmpty()) {
			
			iter = q.remove();  
			System.out.print(iter.getdata()+ "->" );
			
//			if((iter.getLeft()==null) && (iter.getRight()==null)) 
//				
//				sum = sum + iter.getdata();
			
			if(iter.getLeft()!=null)
				q.add(iter.getLeft());
				
				//return ;
			if(iter.getRight()!=null)
				//iter.setRight(new_node);
				q.add(iter.getRight());
				//return ;
			
			
		} // end of while ;
		
		//return sum ;

	} // end of method ;
		



public int sum_of_leafNodes() {
	int sum= 0;
	
	//BTnode new_node = new BTnode(d);
	
	BTnode iter ;
	
	Queue<BTnode> q = new LinkedList<BTnode>();
	
	if(root == null) {
		//root=new_node;
		System.out.println("Empty !!! ");
		return sum ;
	}
	q.add(root);   // 
	
	
	while(!q.isEmpty()) {
		
		iter = q.remove();  
		System.out.print(iter.getdata()+ "->" );
		
		if((iter.getLeft()==null) && (iter.getRight()==null)) 
			
			sum = sum + iter.getdata();
		
		if(iter.getLeft()!=null)
			q.add(iter.getLeft());
			
			//return ;
		if(iter.getRight()!=null)
			//iter.setRight(new_node);
			q.add(iter.getRight());
			//return ;
		
		
	} // end of while ;
	
	return sum ;

} // end of method ;


public int sum_of_NonleafNodes() {
	int sum= 0;
	
	//BTnode new_node = new BTnode(d);
	
	BTnode iter ;
	
	Queue<BTnode> q = new LinkedList<BTnode>();
	
	if(root == null) {
		//root=new_node;
		System.out.println("Empty !!! ");
		return sum ;
	}
	q.add(root);   // 
	
	
	while(!q.isEmpty()) {
		
		iter = q.remove();  
		//System.out.print(iter.getdata()+ "->" );
		
		if((iter.getLeft()!=null) || (iter.getRight()!=null)) 
			
			sum = sum + iter.getdata();
		
		if(iter.getLeft()!=null)
			q.add(iter.getLeft());
			
			//return ;
		if(iter.getRight()!=null)
			//iter.setRight(new_node);
			q.add(iter.getRight());
			//return ;
		
		
	} // end of while ;
	
	return sum ;

} // end of method ;


public int max_of_BT(){
	int max = Integer.MIN_VALUE ;
	
	//BTnode new_node = new BTnode(d);
	
	BTnode iter ;
	
	Queue<BTnode> q = new LinkedList<BTnode>();
	
	if(root == null) {
		//root=new_node;
		System.out.println("Empty !!! ");
		return -999 ;
	}
	q.add(root);   // 
	
	
	while(!q.isEmpty()) {
		
		iter = q.remove();  
		//System.out.print(iter.getdata()+ "->" );
		
		//if((iter.getLeft()==null) && (iter.getRight()==null))
		if(iter.getdata() > max) {	
			max = iter.getdata();
		}
		
		if(iter.getLeft()!=null)
			q.add(iter.getLeft());
			
			//return ;
		if(iter.getRight()!=null)
			//iter.setRight(new_node);
			q.add(iter.getRight());
			//return ;
		
	} // end of while ;
	
	return max ;

} // end of method ;
	

public int min_of_BT(){
	int min = Integer.MAX_VALUE ;
	
	//BTnode new_node = new BTnode(d);
	
	BTnode iter ;
	
	Queue<BTnode> q = new LinkedList<BTnode>();
	
	
	if(root == null) {
		//root=new_node;
		System.out.println("Empty !!! ");
		return min ;
	}
	q.add(root); 
	  // 
	
	
	while(!q.isEmpty()) {
		//System.out.println("-");
		
		iter = q.remove();  
		//System.out.print(iter.getdata()+ "->" );
		
		//if((iter.getLeft()==null) && (iter.getRight()==null))
		if(min > iter.getdata() ) {
			
			min = iter.getdata();
			//System.out.println(min);
		}
		
		if(iter.getLeft()!=null)
			q.add(iter.getLeft());
			
			//return ;
		if(iter.getRight()!=null)
			//iter.setRight(new_node);
			q.add(iter.getRight());
			//return ;
		
	} // end of while ;
	
	return min;

} // end of method ;

public int Level_count() {
	
	
	//BTnode new_node = new BTnode();
	BTnode dummy = new BTnode(-999);
	int level_count=0;
	
	BTnode iter ;
	
	Queue<BTnode> q = new LinkedList<BTnode>();
	
	if(root == null) {
		//root=new_node;
		System.out.println("Empty !!! ");
		//return sum ;
		//return dummy ;
	}
	q.add(root);
	q.add(dummy);    
	
	
	while(!q.isEmpty()) {
		
		iter = q.remove();  
		//System.out.print(iter.getdata()+ "->" );
		
//		if((iter.getLeft()==null) && (iter.getRight()==null)) 
//			
//			sum = sum + iter.getdata();
		if(iter.getdata() == -999) {
			level_count = level_count + 1;
			q.add(dummy);
			iter=q.remove();
		}
		if(iter.getLeft()!=null)
			q.add(iter.getLeft());
			
			//return ;
		if(iter.getRight()!=null)
			//iter.setRight(new_node);
			q.add(iter.getRight());
			//return ;
		
		
	} // end of while ;
	
	//return sum ;
return level_count ;
} // end of method ;


public  boolean isIdentical(BTnode b1 , BTnode b2 ) {
	
	
	BTnode iter1 = b1 ;
	BTnode iter2 = b2 ;
	
	Queue<BTnode> q1 = new LinkedList<BTnode>() ;
	Queue<BTnode> q2 = new LinkedList<BTnode>() ;
	
	q1.add(iter1);
	q2.add(iter2);
	
	while((!q1.isEmpty()) && (!q2.isEmpty())){
		
		iter1 = q1.remove();
		iter2 = q2.remove();
		
		if(iter1.getdata()!=iter2.getdata()) 
			return false ;
		
		
	 if(iter1.getLeft() != null) {
		 q1.add(iter1.getLeft());
	 }
	 
	 if(iter1.getRight() != null) {
		 q1.add(iter1.getRight());
	 }
	 
	 if(iter2.getLeft() != null) {
		 q2.add(iter2.getLeft());
	 }
	 
	 if(iter2.getRight() != null) {
		 q2.add(iter2.getRight());
	 }
	 
		
	}
	System.out.println(q1.isEmpty());
	System.out.println(q2.isEmpty());
	
	if((!q1.isEmpty()) && (!q2.isEmpty())) {
		
		return false ;
	}
	else
		return true ;
	}

	public static void swap(BTnode r) {
		
		BTnode t ;
		t=r.getLeft();
		r.setLeft(r.getRight());
		r.setRight(t);
		
	}
	
	public BTnode mirror_image( ) {
		
		BTnode iter , res ;
		Binary_tree t = new Binary_tree();
		
		
		t.setRoot(create_node(root.getdata()));
		
		iter = root;
		res = t.getRoot();
		
	Queue<BTnode> q1 = new LinkedList<BTnode>();
	Queue<BTnode> q2 = new LinkedList<BTnode>();
	
	q1.add(iter);
	q2.add(res);
	
	while(!q1.isEmpty()) {
		
		iter=q1.remove();
		res=q2.remove();
		
		if(iter.getLeft()!=null) {
			
			q1.add(iter.getLeft());
			res.setLeft(create_node(iter.getLeft().getdata()));
			
			q2.add(res.getLeft());
			
		}
		if(iter.getRight()!=null) {
			q1.add(iter.getRight());
			res.setRight(create_node(iter.getRight().getdata()));
			
			q2.add(res.getLeft());
	
		}
		
	}
	
	iter = t.getRoot();
	q1.add(iter);
	
		
	
	while(!q1.isEmpty()) {
		
		iter = q1.remove();
		swap(iter);
		if(iter.getLeft() != null) 
			q1.add(iter.getLeft());
		if(iter.getRight()!=null)
			q1.add(iter.getRight());	
	}
			
		return t.getRoot();
	}

}
		


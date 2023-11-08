package Binary_search_Tree;

import Binary_tree.BTnode;

public class BinarySearchTree {
	
	private BTnode root;
	
	public BinarySearchTree() {
		root = null;
	}
	
	public BinarySearchTree(BTnode n) {
		root = n ;
	}

	public BTnode getRoot() {
		return root;
	}

	public void setRoot(BTnode n) {
		root = n ;
	}
	
	
	public void insert(int d) {
		
		root = insertRec(root,d);
	}
	
	private BTnode insertRec(BTnode ptr , int d) {
		
		if(ptr == null ) {
			ptr = new BTnode(d) ;
			return ptr ;
		}
		else if(d<ptr.getdata()) {
			
			ptr.setLeft(insertRec(ptr.getLeft(), d));
			
		}
		else if(d>ptr.getdata()) {
			
			ptr.setRight(insertRec(ptr.getRight(), d));
			
			
		}
		else {
			System.out.println("\n Duplicate value ");
		}
		
		return ptr ;
		
	}
	
	
	  public void inorder() 
	  { 
		  visit_inorder(root); 
	  
	  }
	 	
	public void visit_inorder(BTnode ptr) {
		
		if(ptr == null)
			return ;
		
		visit_inorder(ptr.getLeft());
		System.out.print(ptr.getdata() + " ");
		
		visit_inorder(ptr.getRight());
	
	}
	
	public void Postorder() {
		
		visit_preorder(root); 

	}
	
	public void visit_preorder(BTnode ptr) {
		
		if(ptr == null)
			return ;
		
		System.out.print(ptr.getdata() +" ");
		visit_preorder(ptr.getLeft());
		visit_preorder(ptr.getRight());
	
	}
	
public void Preorder() {
		
	visit_preorder(root); 

	}
	public void visit_postorder(BTnode ptr) {
		
		if(ptr == null)
			return ;
		
		visit_postorder(ptr.getLeft());
		visit_postorder(ptr.getRight());
		System.out.print(ptr.getdata()+ " ");
	
	}
	
	
	
		public BTnode search(int key) {
		
		//int num = searchRec(root ,key);
		return searchRec(root ,key);
	
	}
	
	public BTnode searchRec(BTnode ptr , int d ) {
		
		if(ptr== null) {
			System.out.println("\n element not found  ");
			return null;
		}
		else if(d<ptr.getdata()){
			return searchRec(ptr.getLeft(), d);
		}
		else if(d>ptr.getdata()) {
			return searchRec(ptr.getRight(), d);
		}
		else
			return ptr ;	
	}
	
	public int find_ht(BTnode ptr) {
		
		int hleft , hright ;
		if(ptr == null)
			return 0;
		hleft = find_ht(ptr.getLeft());
		hright = find_ht(ptr.getRight());
		
		if(hleft > hright) {
			return 1 + hleft;
		}
		else {
			return 1 + hright ;
		}
	}
	
	
	public void Delete_node(int d) {
		
		BTnode res =deleteNode(root ,d );
	
	}
	
	public BTnode deleteNode(BTnode ptr , int d) {
		BTnode succ , tmp ;
		
		if(ptr == null) {
			return null;
		}
		if(d < ptr.getdata()) {
			ptr.setLeft(deleteNode(ptr.getLeft(), d));
		}
		else if(d>ptr.getdata()) {
			ptr.setRight(deleteNode(ptr.getRight(), d));
		}
		else 
		{
			System.out.println("\n Given element is found  in the BST :");
			if((ptr.getLeft()!=null) && (ptr.getRight() != null)) {
				succ = ptr.getRight();
				while(succ.getLeft() != null) {
					succ = succ.getLeft();
				}
				ptr.setdata(succ.getdata());
				ptr.setRight(deleteNode(ptr.getRight(), succ.getdata() ));	
			}
			
			else {
				
				tmp = ptr ;
				if(ptr.getLeft() != null) {
					ptr= ptr.getLeft();
					tmp.setLeft(null);
				}
				else if(ptr.getRight() != null)
				{
					ptr= ptr.getRight();
				tmp.setRight(null);
			}
			
			else {
				ptr=null ;
			}
	}
		
	}

		return ptr ;
		
	}

	@Override
	public String toString() {
		return "BinarySearchTree [root=" + root + "]";
	}
	
	
	
}
	
	



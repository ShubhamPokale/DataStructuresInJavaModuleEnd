package Binary_tree;

public class BTnode {
	
	private int data ;
	private BTnode left ;
	private BTnode right;
	//public BTnode root;
	
	
	public BTnode() {
		
	 data = 0;
	left=  null ;
	right = null ;	
	
	}
	
	public BTnode(int d) {
		 data = d ;
		left = null;
		right = null ;
		
	}
	
	public void setdata(int d) {
		this.data=d;
		
	}
	public int getdata() {
		return data ;
		
	}

	public BTnode getLeft() {
		return left;
	}

	public void setLeft(BTnode left) {
		this.left = left;
	}

	public BTnode getRight() {
		return right;
	}

	public void setRight(BTnode right) {
		this.right = right;
	}

}

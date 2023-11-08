package Binary_search_Tree;

import Binary_tree.BTnode;

public class BST_user {
	//private BTnode root ;
	public static void main(String[] args) {
		BinarySearchTree B1 = new BinarySearchTree();
		 B1.insert(10);
		 B1.insert(30);
		 B1.insert(70);
		 B1.insert(50);
		 B1.insert(80);
		 B1.insert(20);
		 B1.insert(60);
		 B1.insert(110);
		 B1.insert(130);
		 B1.insert(100);
		 
		 System.out.println("\n Inorder Traversing : ");
		 B1.inorder();
		 
		 System.out.println("\n Preorder Traversing  :");
		 
		 //B1.visit_preorder( B1.getRoot());
		 B1.Postorder();
		 
		 System.out.println("\n Postorder Traversing  :");
		 
		 //B1.visit_postorder(B1.getRoot());
		 B1.Preorder();
		 
		 System.out.println("\n After search method  for element in BST value -> 80 :");
		 
		 System.out.println( "element is found  : "+ B1.search(80).getdata() +" is at ref of " +  B1.search(80).getdata());
		 System.out.println("\n After search method  for element in BST value -> 140 :");
		 System.out.println(B1.search(140));
		 
		 System.out.println();
		 
		 
		
		 System.out.println("\n After delete operation method (30): ");
		 B1.Delete_node(30);
		 
		 B1.inorder();
		 
		 System.out.println();
		 System.out.println("Height of BST is : " + B1.find_ht(B1.getRoot()));
	}
}

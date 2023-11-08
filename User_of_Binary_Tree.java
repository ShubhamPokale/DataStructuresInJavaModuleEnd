package Binary_tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class User_of_Binary_Tree {
	
	
	//private static final BTnode BTnode = null;

	
	public static boolean isIdentical(BTnode b1 , BTnode b2 ) {
		
		
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
	

	public static void main(String[] args) {

		/*
		 * simple_Binary_tree BT = new simple_Binary_tree();
		 * 
		 * BT.setRoot(BT.create_node(10));
		 * 
		 * BT.getRoot().setLeft(BT.create_node(20));
		 * 
		 * BT.getRoot().getLeft().setRight(BT.create_node(30));
		 */
		// return ;

		Binary_tree B1 = new Binary_tree();
		
		Binary_tree B2 = new Binary_tree();
		
		
		
		Scanner sc = new Scanner(System.in);
		int num;

		for (int i = 1; i <= 5; i++) {
			System.out.println("Enter the " + i + "  nodes for  BT no. 1  :");
			num = sc.nextInt();
			
			B1.insert_levelwise(num);
		}
		
		
		
		
		
		
		/*
		 * for (int i = 1; i <= 5; i++) { System.out.println("Enter the " + i +
		 * "  nodes for  BT no. 2  :"); num = sc.nextInt();
		 * 
		 * B2.insert_levelwise(num); }
		 */
		
		
		
	
		System.out.println("\n  Binary tree element in level_wise traversal is : ");
		
		B1.Level_wise_traversal();
		
		B2.setRoot(B1.mirror_image());
		
		System.out.println("\n  Binary tree element in level_wise traversal is : ");
		
		B2.Level_wise_traversal();
		
		
		
		
		
		/*
		 * System.out.println("Is_identicale : ");
		 * 
		 * System.out.println(User_of_Binary_Tree.isIdentical( B1.root , B2.root) );
		 * 
		 * 
		 * 
		 * System.out.println();
		 */
		
		/*
		 * System.out.println();
		 * 
		  System.out.println(" \n The sum of all leaf nodes is : " +
		  B1.sum_of_leafNodes());
		 * System.out.println(" \n The sum of all Non_leaf nodes is : " +
		 * B1.sum_of_NonleafNodes());
		 * 
		 * B1.sum_of_leafNodes();
		 * 
		 * System.out.println("\n The max of BT is  : " + B1.max_of_BT() );
		 * System.out.println("\n The min of BT is  : " + B1.min_of_BT() );
		 * 
		 * 
		 * System.out.println("\n The level count is :" + B1.Level_count());
		 */
		//int t = ;
		//System.out.println(MAX_INTEGER);
		
		
	
	}

}

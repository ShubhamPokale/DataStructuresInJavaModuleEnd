package Seraching;

import Linked_List.linked_list;

public class Linear_search {
	
	public int search(int []arr , int key) {
		
		int pos = -1 ;
		int  i; 
		for(i=0; i<arr.length ; i++) {
			if(arr[i]==key) {
				pos = i ;
				break ;
			}
		}
		
		return pos ;
	}
	
	public static void main(String[] args) {
		
		int arr[] = {34,14,4,50,11,67,7,80,90,100,101};
		
		System.out.println("Array is :");
		
		for(int i=0 ; i< arr.length ; i++) {
			
			System.out.print(arr[i] + " ");
			
		}
		
		Linear_search L1 = new Linear_search();
		
		System.out.println("\n Element  is present at index : "+L1.search(arr, 100) );
	
		
	}

}

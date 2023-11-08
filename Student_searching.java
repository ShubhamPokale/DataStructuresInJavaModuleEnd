package Seraching;

import Sorting.Student;
import Stack_using_Array.student;

public class Student_searching {
	
	public int Bi_search_student(Student arr[], int key) {

		Student t ;
		int low , high , mid ;
		low = 0;
		high = arr.length - 1;
		mid = low + (high - low) / 2;

		while ((arr[mid].getID() != key && low < high)) {
			if (key < arr[mid].getID()) {
				high = mid - 1;

			} else {
				low = mid + 1;
			}

			mid = low + (high - low) / 2;

		}
		if (arr[mid].getID() == key ){
			return mid;
		}

		return -1;

	}
	
	public static void Student_bubble_sort(Student arr[] , int size) {
		
		Student temp ;
		int i , j , flag =0 ;
		
		for(j=size-1 ; j>0 ; j--) {
			flag=0 ;
			for(i=0 ; i<j ; i++) {
				
				if(arr[i].getMarks()>arr[i+1].getMarks()) {
					
					temp = arr[i] ;
					arr[i]=arr[i+1];
					arr[i+1]=temp ;
					flag=1 ;
				}
				
			}
			
			if(flag==0) {
				break ;
			}
		}	
	}
	
public static void selection_sort(Student []arr , int size) {
		
		int  i, j , min ;
		Student temp ;
		
		for(i=0 ; i<size-1 ; i++) {
			min=i ;
			for(j=i+1 ; j<size ; j++) {
				
				if(arr[min].getMarks()>arr[j].getMarks()) {
					min=j ; 
				}
				
			}
			
			if(min != i) {
				
				temp=arr[i];
				arr[i]=arr[min];
				arr[min]=temp ;
			}
			
			
		}
		
		
	}

public static void Display(Student []arr , int size) {
	
	System.out.println("List :");
	
	for(int i=0 ;i<= size-1 ; i++) {
		System.out.println(arr[i].toString() + " ");
		
	}

}
	

	// array should be sorted first

	public static void main(String[] args) {

		Student arr[] =new Student[7];
		
		arr[0] = new Student("Dwarkesh", 101, 100);
		arr[1] = new Student("Amey", 105, 99);
		arr[2] = new Student("Veer", 110, 95);
		arr[3] = new Student("Yash", 111, 70);
		arr[4] = new Student("Chandu", 115 , 96);
		arr[5] = new Student("Piyush", 120, 80);
		arr[6] = new Student("Rushi", 199, 85);
		
		Student_searching S1 = new Student_searching();
		
		//Binary_Search B1 = new Binary_Search();

		System.out.println("\n Student ID is present at index : " + S1.Bi_search_student(arr,199));
		
		System.out.println("Sorting of Student by ID using bubble sorting : ");
		S1.Student_bubble_sort(arr, arr.length);
		Display(arr, arr.length);
		
		System.out.println("Sorting of Student by ID using Selection sorting : ");
		S1.selection_sort(arr, arr.length);
		Display(arr, arr.length);
	

	}


}

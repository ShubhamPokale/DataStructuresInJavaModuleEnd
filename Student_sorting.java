package Sorting;

//import Stack_using_Array.student;

public class Student_sorting {
	
	
	
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
	
public static void Display(Student []S , int size) {
		
		System.out.println("List :");
		
		for(int i=0 ;i<= size-1 ; i++) {
			System.out.println(S[i].toString() + " ");
			
		}
	
}
	public static void main(String[] args) {
		
		Student S[] = new Student[5];
		
		 S[0] = new Student("Dwarkesh",100,99);
		 S[1] = new Student("Amey",110,100);
		 S[2] = new Student("Yash",115,98);
		 S[3] = new Student("Prajwal",54,78);
		 S[4] = new Student("Rushi",145,89);
		// S[5] = new Student("Veer",150,67);
		 
		 System.out.println("Sorting student by Bubble_sort :");
		 
	Student_bubble_sort(S, S.length);
	Display(S, S.length);
	
	
	}

}



package Sorting;

public class employee_sorting {
	
	//private employee emp ;
	public static void Bubble_sort(employee arr[] , int size )
	{	
		int i ,j  , flag=0;
		employee t ;
		
		
		for( j = size-1  ;j>0 ; j--) {
			 flag = 0;
			for(i=0 ; i< j ; i++) {
				
				if(arr[i].getId()>arr[i+1].getId()) {
					t=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=t ;
					flag =1 ;
					
				}
			}
			
			if(flag==0)
				break;
		}
		
	}
	
	
	public static void Bubble_sort_sal(employee arr[] , int size )
	{	
		int i ,j  , flag=0;
		employee t ;
		
		
		for( j = size-1  ;j>0 ; j--) {
			 flag = 0;
			for(i=0 ; i< j ; i++) {
				
				if(arr[i].getSalary()>arr[i+1].getSalary()) {
					t=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=t ;
					flag =1 ;
					
				}
			}
			
			if(flag==0)
				break;
		}
		
	}
	
	
public static void selection_sort(employee []arr , int size) {
		
		int  i, j , min ;
		employee temp ;
		
		for(i=0 ; i<size-1 ; i++) {
			min=i ;
			for(j=i+1 ; j<size ; j++) {
				
				if(arr[min].getId()>arr[j].getId()) {
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
/*
public static void insertion_sort(employee arr[], int size) {
	
	int i ,j , k ;
	employee t ;
	
	
	for(i=1 ; i<size ; i++) {
		k=arr[i].getId();
		for(j=i-1 ; j>=0 && arr[j].getId()> k ; j-- ) {
			
			//arr[j+1].getId() = arr[j] ;
			arr[j+1] = arr[i] ;
		}
		k=arr[j+1] ;
		
		
	}
	
	
}
*/
	
	public static void Display(employee []E , int size) {
		
		System.out.println("List :");
		
		
		
		for(int i=0 ;i<= size-1 ; i++) {
			System.out.println(E[i].toString() + " ");
			
		}
	
	}

	
	public static void main(String[] args) {
		
		
		
		
		//employee E1[0]  = new employee("Dwarkesh" ,1200,50000f);
		
		employee E[] = new employee[5];
		E[0]=new employee("Dwarkesh", 100, 12000f);
		E[1]=new employee("Amey", 101, 15000f);
		E[2]=new employee("Chandu", 112, 13000f);
		E[3]=new employee("Nishant", 130, 1000f);
		E[4]=new employee("Prajwal", 105, 17000f);
		//E[0]=new employee("Dwarkesh", 100, 12000);
		
		
		System.out.println("Sorting  employee  by Id by Bubble sort :");
		Bubble_sort(E, E.length);
		Display(E, E.length);
		
		System.out.println("_________________________________________________________");
		
		System.out.println("Sorting  employee by Salary by Bubble sort :");
		Bubble_sort_sal(E, E.length);
		Display(E, E.length);
		
		System.out.println("_________________________________________________________");
		
		System.out.println("Sorting employee by ID using Selection Sort : ");
		
		selection_sort(E, E.length);
		Display(E, E.length);
		
		
		
	
	}
	
	

}



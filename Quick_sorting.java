package Sorting;

public class Quick_sorting {
	
	public static int partition(int arr[], int low , int high) {
		
		int pivot = arr[high];
		int i= low-1;
		for(int j=low ; j<high ; j++) {
			if(arr[j]<pivot) {
				i++;
				
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j]= temp ;
				
			}
		}
		i++;
		int temp = arr[i];
		arr[i] = pivot;
		arr[high]=temp ;
		return i ;
		
		
	}
	
	public static void quicksort(int arr[] , int low , int high) {
		
		if(low<high) {
			int pivotidx = partition(arr,low,high);
			
			
			quicksort(arr, low, pivotidx-1);
			quicksort(arr, pivotidx+ 1 , high);
			
		}
	}
	
	
	
	public static void main(String[] args) {
		
		int arr[]= {4,7,8,9,6,1,2};
		
		int n = arr.length ; 
		
		quicksort(arr, 0, n-1);
		
		System.out.println("Qucik sorted array is :");
		for(int i=0 ; i<n ; i++) {
			System.out.print( arr[i] + " ");
			
		}
		System.out.println();
		
	}

}

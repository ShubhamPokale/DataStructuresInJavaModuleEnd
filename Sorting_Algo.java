package Sorting;

public class Sorting_Algo {
	
	public static void Bubble_sort(int arr[] , int size )
	{	
		int i ,j , temp , flag=0;
		
		for( j = size-1  ;j>0 ; j--) {
			 flag = 0;
			for(i=0 ; i< j ; i++) {
				
			if(arr[i]>arr[i+1]) {
					temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp ;
					flag =1 ;
					
				}
			}
			
			if(flag==0)
				break;
		}
		
	}
	
	public static void selection_sort(int []arr , int size) {
		
		int  i, j , t , min ;
		
		for(i=0 ; i<size-1 ; i++) {
			min=i ;
			for(j=i+1 ; j<size ; j++) {
				
				if(arr[min]>arr[j]) {
					min=j ; 
				}
				
			}
			
			if(min != i) {
				
				t=arr[i];
				arr[i]=arr[min];
				arr[min]=t ;
			}
	
		}
		
		
	}
	
	public static void insertion_sort(int arr[], int size) {
		
		int i ,j , k ;
		
		for(i=1 ; i<size ; i++) {
			k=arr[i];
			for(j=i-1 ; j>=0 && arr[j]>k ; j-- ) {
				
				arr[j+1] = arr[j] ;
				
				
			}
			arr[j+1]=k;
			
			
		}
		
		
	}
	
	public static void merge_ver1(int arr1[] , int arr2[] , int []tar ) {
		
		int i , j , k ;
		i=j=k=0 ;
		
		while((i<arr1.length) && (j<arr2.length)) {
			
			if(arr1[i] < arr2[j]) {
				tar[k]=arr1[i];
				k++;
				i++;
			}
			else if(arr2[j] < arr1[i]) {
				tar[k]=arr2[j];
				k++;
				j++;
			}
			else {
				tar[k]=arr1[i];
				k++;
				i++;
				j++;
				
			}
		}
		
		while(i<arr1.length) {
			tar[i] = arr1[i];
			i++;
			k++;
		}
		
		while(j<arr2.length) {
			tar[i] = arr2[j];
			j++;
			k++;
		}
		
		
		
		
	}
	
	public static void merge_sort_ver2(int []arr , int low1 ,int high1 , int low2 , int high2 , int []tar ) {
		
		
		int i , j , k ;
		i=low1 ;
		j=low2 ;
		k=low1 ;
		
		
		while((i<= high1 ) && (j<= high2 )) {
			
			if(arr[i] < arr[j]) {
				tar[k]=arr[i];
				k++;
				i++;
			}
			else if(arr[j] < arr[i]) {
				tar[k]=arr[j];
				k++;
				j++;
			}
			else {
				tar[k]=arr[i];
				k++;
				i++;
				j++;
				
			}
		}
		
		while(i<= high1 ) {
			tar[k] = arr[i];
			i++;
			k++;
		}
		
		while(j<= high2) {
			tar[k] = arr[j];
			j++;
			k++;
		}
		
		
		
		
	}
	
	public static void merge_sort(int []arr , int low , int high) {
		
		int mid ;
		int temp[] = new int[arr.length];
		
		
		if(low>=high)    // Base condition ;
			return ;
		
		if(low<high) {
			
			 mid=(low+high)/2 ;
			 System.out.println("high = " + high + "Low = " + low + " " + "Mid" + mid );
			 
			 merge_sort(arr, low, mid);
			 
			 System.out.println("mid = " + mid + "mid + 1 = " + mid + 1  + " " + "Low = " + low );
			 
			 merge_sort(arr, mid+1 , high);
			 
			 //merge_ver1(arr, , arr);;
			 merge_sort_ver2(arr, low, mid, mid+1, high, temp);
			 
			 copy(arr, temp, low, high);
			
		}
		return ;
		
	}
	
	public static void copy(int []arr , int []tar , int low , int high ) {
		int i;
		for(i=low ; i<= high ; i++) {
			arr[i]= tar[i];
			
		}
		
	}
	
	public static int patition(int []arr , int low , int high) {
		
		int left , right , pivot ,t ;
		left = low ;
		right = high ;
		pivot = arr[low] ;
		
		while(left <= right) {
			while((arr[left] <= pivot) && (left<high))
				left++;
			while((arr[right]> pivot)) 
				right-- ;
			if(left<right) {
				t=arr[left];
				arr[left]=arr[right];
				arr[right] = t ;
				left++ ;
				right ++ ;
			}
			else left++;
		}
		
		arr[low]= arr[right];
		arr[right]=pivot ;
		
		return right ;
		
	}
	
	public static void quick_sort(int arr[] , int low , int high) {
		
		int pivloc  ;
		if(low <= high ) {
			pivloc = patition(arr, low, high);
			quick_sort(arr, low, pivloc-1);
			quick_sort(arr, pivloc+1 , high);
		}
	}
	
	
	
	public static  void Display(int []arr , int size) {
		
		System.out.println("List :");
		
		for(int i=0 ;i<= size-1 ; i++) {
			System.out.print(arr[i] + " ");
			
		}
		
		
	}
	
	public static void main(String[] args) {
		
		//Sorting_Algo S1 = new Sorting_Algo();
		
		int arr[] = {12,45,78,55,63,26,41,14,20};
		
		System.out.println("Bubble sort : ");
		
		Bubble_sort(arr, arr.length);
		Display(arr, arr.length);
		
		System.out.println();
		
		System.out.println("\nSelection sort :");
		
		selection_sort(arr, arr.length);
		Display(arr, arr.length);
		
		System.out.println("\nInsertion_sort :");
		
		insertion_sort(arr, arr.length);
		Display(arr, arr.length);
		
		
		System.out.println("\nMerge_sort :");
		
		//merge_sort_ver2(arr, 0, 0, 0, 0, arr);
		merge_sort(arr, 0, arr.length-1);
		Display(arr, arr.length);
		
		System.out.println("\nQuick sort  : ");
		quick_sort(arr, 0, arr.length-1);
		Display(arr, arr.length);
		
		
	}
	
	
}

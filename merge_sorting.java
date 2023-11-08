package Sorting;

public class merge_sorting {
	
	public static void conquer(int arr[] , int si ,int mid , int ei) {
		
		int megred[] = new int[ei-si+1];
		
		int idx1= si ;
		int idx2= mid+1 ;
		int x =0 ;
		
		
		while(idx1<= mid && idx2 <= ei) {
			if(arr[idx1] <= arr[idx2]) {
				megred[x]=arr[idx1];
				x++;
				idx1++;
						
			}
			else {
				megred[x] = arr[idx2];
				x++;
				idx2++;
			}
		}
		
		while(idx1 <= mid) {
			megred[x++]= arr[idx1++];
		}
		while(idx2 <= ei) {
			megred[x++]= arr[idx2++];
		}
		
		for(int i=0 ,j=si ; i<megred.length ; i++ ,j++) {
			
			arr[j]=megred[i];
			
		}
		
	}
	
	public static void divide(int arr[] , int si , int ei ) {
		
		
		if(si >= ei)
			return ;
		
		int mid = si + (ei-si)/2;
		
		divide(arr, si, mid);
		divide(arr, mid+1 , ei);
		conquer(arr, si ,mid , ei);
		
	}
	
	
	public static void main(String[] args) {
		
		int arr[]= {4,7,8,9,6,1,2};
		
		int n = arr.length ; 
		
		divide(arr, 0, n-1);
		
		System.out.println("Merged sorted array is : ");
		
		for(int i=0 ; i<n ; i++) {
			
			
			System.out.print(arr[i] + "  ");
		}
		System.out.println();
		
	}

}

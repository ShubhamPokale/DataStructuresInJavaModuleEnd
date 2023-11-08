package Array_in_java;
import java.util.Arrays;

public class megre_two_array {
	
	public static int[] merge_array(int[] arr1 , int[] arr2) {
		
		int[] MergedArray = new int[arr1.length + arr2.length ];
		/*
		 * for(int i=0 ; i<=arr1.length -1 ; i++) { for(int j=i ; j<=arr2.length -i ;
		 * j++ ) {
		 * 
		 * if(arr1[i]<arr2[j]) { k[i]=arr1[i];
		 * 
		 * } if(arr2[j]<arr1[i]) { k[i]=arr2[j]; } else if (arr1[i]==arr2[j]){
		 * k[i]=arr1[i];
		 * 
		 * } else { continue; }
		 * 
		 * } }
		 */
		
		int i=0 , j=0 , k=0  ;
		
		while(i<arr1.length && j<arr2.length ) {
			if(arr1[i]<arr2[j]) {
				k++;
				MergedArray[k]=arr1[i];
				i++;
			}
			else {
				k++;
				MergedArray[k]=arr2[j];
				j++;
			}
			
		}
		
		while(i<arr1.length) {
			MergedArray[k++] = arr1[i++];
			
			
		}
		while(j<arr2.length) {
			MergedArray[k++] = arr2[j++];
		}	
		
		System.out.println("Merged Sorted array is : ");
		return MergedArray;
	}
	
	public static void main(String[] args) {
		
		megre_two_array A1 = new megre_two_array();
		
		int[] arr1= {3,8,12,15,18,20};
		int[] arr2= {1,5,10,19,22,25};
		int[] mergedArray = merge_array(arr1, arr2);
		
		System.out.println(Arrays.toString(mergedArray)); 
	}

}

package Array_in_java;

import java.util.Scanner;

public class Array_Operation {
	
	private int arr[];
	
	public Array_Operation() {
		arr = new int[5];
	}
	
	public Array_Operation(int s) {
		
		arr  = new int[s];
	}
	
	
	public void ReadArray() {
		
		int i ;
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter Element : ");
		for(i=0 ; i< arr.length  ; i++) {
			arr[i] = Sc.nextInt();
		}
		
	}

	
	
	public void PrintArrayElement() {
		
		int i ;
		//System.out.println("\n");
		for(i=0  ; i < arr.length   ; i++) {
			
			if(arr[i] != 0)
			System.out.print( arr[i] + " ");
		}
		System.out.println();
		//return ;
	}
	
	
	
	public void LeftShift() {
		int i;
		for(i=0 ; i<arr.length-1 ;  i++) {
			arr[i]=arr[i+1];
		}
		
		arr[i]=0;	
	}

	
	public void RightShift() {
		
		int i;
		for(i=arr.length-1  ; i>0 ; i--) {
			arr[i] = arr[i-1];
		}
		arr[i]=0;
		
	}
	
	
	public void LeftRotate() {
		int i ;
		int temp = arr[0];
		for(i=0 ; i<arr.length-1 ; i++) {
			
			 arr[i] = arr[i+1];
			
		}
		arr[i]=temp;
	
	}
	
	public void RightRotate() {
		
		int i ;
		int temp= arr[arr.length-1];
		
		for(i=arr.length-1 ; i>0 ; i--) {
			arr[i]=arr[i-1];
		}
		
		arr[i]=temp;
		
		
	}
	
	public void Insert_At_Positon(int pos , int key) {
		
		int i ;
		for( i=arr.length -1 ; i>=pos ; i--)
		{
			arr[i]=arr[i-1];
		}
		
		arr[i]= key ;
		
	}
	
	
	public int delete_at_position(int pos) {
		
		int i , data = arr[pos-1];
		
		for(i=pos-1 ; i<arr.length -1 ; i++) {
			arr[i]= arr[i+1];
		}
		
		arr[i]=0;
	return  data ;
	}
	
	
	
	public void remove_duplicates_version0() {
		
		int temp[] = new int[arr.length];
		
		int i ; 
		for(i=0; i<arr.length ; i++) {
			temp[arr[i]]=arr[i];
			
		}
		arr=temp;
		
		}

	public void remove_duplicates_ver1() {
		
		int temp[]= new int[arr.length];
		
		int i , j , temp_index= -1 ;
		int flag =0 ;
		
		for(i=0 ; arr[i] != -999 ; i++) {
			
			flag = 1 ;
			for(j=0 ; j<= temp_index ;j++ ) {
				
				if(arr[i]==temp[j]) {
					flag = 0;
					break;
				}
			}
			if(flag == 1 ) {
				temp_index++;
				temp[temp_index]=arr[i];
				}
		}
		
		arr= temp;		
	}
	

	public void remove_duplicate_version_3() {
		
		int i,j ;
		for(i=0 ; arr[i] != -999 ; i++) {
			
			for(j=i+1 ; arr[j] != -999 ; j++) {
				
				if(arr[i]==arr[j]) 
				delete_at_position(j+1);
				
			}
			
		}
		
		
	}
	
	
	public void remove_duplicate_ver_4() {
		
		int check[] = new int[101];
		
		int i, j ;
		int n;
		for(i=0 ; arr[i] != -999 ; i++) {
			
			n = arr[i];
			check[n]++;
			
		}
		for(i=0 , j=-1 ; arr[i] != -999 ; i++) { 
			
			n = arr[i];
			if(check[n]>0) {
				j++;
				arr[j]=n;
				check[n]=0;
			}
		}
		j++;
		arr[j]=-999;
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		Array_Operation A1 = new Array_Operation(101);
		
		A1.ReadArray();
		A1.PrintArrayElement();
		
//		System.out.println();
//		
//		System.out.println("Left_Shift : ");
//		A1.LeftShift();
//		A1.PrintArrayElement();
//		
//		System.out.println();
//		
//		System.out.println("Right_Shift : ");
//		A1.RightShift();
//		A1.PrintArrayElement();
//		
		
		
		
		/*
		System.out.println("Left_Rotate :");
		A1.LeftRotate();
		System.out.println();
		A1.PrintArrayElement();
		*/
		
		
		//A1.PrintArrayElement();
		
		/*
		System.out.println("Rigth_Rotate :");
		A1.RightRotate();
		//System.out.println();
		A1.PrintArrayElement();
	*/
		
		
		/*
		System.out.println("Insert At Position :");
		
		A1.Insert_At_Positon(2, 6);
		A1.PrintArrayElement();
		
		*/
		
		
		/*
		System.out.println("Delete AT position :");
		
		A1.delete_at_position(3);
		A1.PrintArrayElement();
		*/
		
		
		
		/*
		System.out.println("Remove_Duplicate_element :");
		
		A1.remove_duplicates_ver1();
		A1.PrintArrayElement();
		
		*/
		 
		 
		/*
		System.out.println("Remove_Duplicate_element :");
		
		A1.remove_duplicate_version_3();
		A1.PrintArrayElement();
		*/
		System.out.println("Remove_duplicate_version_4");
		
		A1.remove_duplicate_ver_4();
		A1.PrintArrayElement();


	}
	 
}



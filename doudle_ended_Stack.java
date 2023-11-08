package Double_ended_Stack;

public class doudle_ended_Stack {
	
	private int []arr;
	private int topA , topB ;
	
	public doudle_ended_Stack() {
		
		arr = new int[10];
		topA=-1 ;
		topB = arr.length;
		
		
	}
	
	public boolean IsFull() {
		
		if((topA - topB)==1) {
			return true ;
		}
		
		else {
			return false ;
		}
	}
	
	public boolean isEmptyA(){
		
		if(topA == -1) {
			return true ;
		}
		else {
			return false;
			
		}
		
		
	}
	
	public boolean isEmptyB(){
		
		if(topB==arr.length) {
			return true ;
		}
		else {
			return false ;
		}
		
		
	}
	
	
	public void pushA(int d) {
		if(IsFull()) {
			
			System.out.println("overflow... !!! ");
			return ;
		}
		topA++ ;
		arr[topA]=d ;
		
	}
	
	public void pushB(int d) {
		if(IsFull()) {
			
			System.out.println("\n Overflow ......!! ");	
		}
		topB--;
		arr[topB]=d ;
	
	}
	
	public int popA() {
		
		int d= -999 ;
		if(isEmptyA()) {
			System.out.println("underflow ");
		}
		else {
			d=arr[topA];
			topA--;
		}
		return d ;	
	}
	
	public int popB() {
		
		int d =-999 ;
		if(isEmptyB()) {
			System.out.println("Underflow !!!! ");
			
		}
		else {
			d=arr[topB];
			topB++ ;
		}
		return d ;
		
	}
	
	public int peekA() {
		
		if(isEmptyA()) {
			System.out.println("stack_A  is empty ");
			
		}
		return arr[topA];
		
	
	}
public int peekB() {
		
		if(isEmptyB()) {
			System.out.println("stack_B  is empty ");
			
		}
		return arr[topB];
		
	
	}
	

public void Print_doublely_ended_array() {
	
	int i ;
	
	
	for(i=topA ; i>=0 ; i--) {
		System.out.println(arr[i] + " ");
	}
	System.out.println();
	
	for(i=topB ; i < arr.length  ; i++) {
		System.out.println(arr[i] + " ");
	}
	
}
	
	

}

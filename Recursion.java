package Recursion;
import java.util.*;

//import javax.xml.parsers.FactoryConfigurationError;

public class Recursion {
	
	
	
	public int fact(int N) {
		
		if(N<2) {
			System.out.println(" \n I am in base condition ");
			return 1 ;
		}
		else {
			return N*fact(N-1);
		}
	}
	
	
	void fun(int n) {
		
		if(n>5) {
			System.out.println(" \n I am Base conditon ");
			return;
		}
		
		System.out.print(n + " ");
		
		fun(n+1);
		
		return ;	
	}
	
void fun1(int n) {
		
		if(n>5) {
			System.out.println(" \n I am Base conditon ");
			return;
		}
	
		fun1(n+1);
		System.out.print(n + " ");
		return ;	
	}

void Rarray(int a[] , int i) {
	
	if(i>a.length-1) {
		return ;
		
	}
	
	
	Rarray(a,i+1);	
	System.out.print(a[i] + " ");

	
	
}


int Array_sum_R(int n) {
	
	if(n/10==0)
		return n ;
	
	return n%10 + Array_sum_R(n/10);
	
	
}



	
	
	
	public static void main(String[] args) {
		
		Recursion num = new Recursion();
		
		int  i;
		int len ;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length  :");
		
		len= sc.nextInt();
		
		int[] arr= new int[len] ;
		/*
		 * Scanner sc = new Scanner(System.in); int A = sc.nextInt();
		 * 
		 * System.out.println("Enter the number : ");
		 * 
		 * System.out.println("Factorial of number is : " + num.fact(A));
		 */
		//num.fun(1);
		
		//num.fun1(1);
		
		
		//int len  ;
		
		
		System.out.println("Enter the length of element : ");
		//len=sc.nextInt();
		
		
		
for( i=0 ; i<= arr.length-1 ; i++) {
			
			//System.out.println("Enter" + i + "elment : " + arr[i]);
			 arr[i]=sc.nextInt();
		}
		

		num.Rarray(arr, 0);
		
		
		System.out.println(" \n Sum of digits is : " + num.Array_sum_R(123));
		
		
	}
	
	


}

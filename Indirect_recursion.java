package Recursion;

public class Indirect_recursion {
	
	static void fun1(int n) {
//		System.out.println(n);
//		fun2(n+1);
		
		System.out.println(n);
		if(n>10)
			return ;
		fun2(n+1 );
		
		
	}
	
	static void fun2(int i) {
		fun1(i+1);
		
	}
	
	public static void main(String[] args) {
		
		fun1(4); // stack overflow !!!! 
	
	}

}

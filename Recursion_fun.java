package Recursion;

public class Recursion_fun {

	public static void swap(A obj1 , A obj2 ) {
		
//		int t ;
//		t= obj1.getNum1();
//		obj1.setNum1(obj2.getnum2());
//		obj2.setnum2(t);
		
		A t = new A(obj1.getNum1());
		
		obj1.setNum1(obj2.getNum1());
		
		obj2.setNum1(t.getNum1());
		
	
	}
	
	public static void main(String[] args) {
		
//		A obj1 = new A();
//		B obj2 = new B();
		
		A obj1 = new A(10);
		A obj2 = new A(20);
		 
		 
		 //System.out.println("before swap num1 and num2 : "+ obj1.getNum1() + "  " + obj2.getNum1()) ;
		 
		 
		System.out.println(" \n before swap num1 and num2 : "+ obj1.getNum1() + "  " + obj2.getNum1()) ;
		
		swap(obj1 , obj2 );
		
		System.out.println(" \n After swap num1 and num2  : "+ obj1.getNum1() +" " + obj2.getNum1());
		
	}
	

}

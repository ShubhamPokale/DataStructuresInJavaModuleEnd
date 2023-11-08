package Linked_List;

public class Student_circular_user {
	
	public static void main(String[] args) {
		
		Student_Circularlist student = new Student_Circularlist();
		
		Student S1 = new Student("Dwarkesh", 100, 100);
		Student S2 = new Student("Amey", 110 , 99);
		Student S3 = new Student("Sanjay", 111, 101);
		Student S4 = new Student("Saru", 112, 111);
		Student S5 = new Student("veer", 113, 112);
		Student S6 = new Student("Swara", 115 , 122);
		
		student.insert_first(S1);
		student.insert_first(S2);
		student.insert_first(S3);
		
		System.out.println("insert At first : ");
		
		System.out.println(student.toString());
		
		
		System.out.println("insert At last :");
		
		student.insert_last(S4);
		student.insert_last(S5);
		
		System.out.println(student.toString());
		//System.out.println();
		
		System.out.println("after insertion at position : ");
		
		student.insert_at_posotion(S6, 4);
		
		System.out.println(student.toString());
	}

}

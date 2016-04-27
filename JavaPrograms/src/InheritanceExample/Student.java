package InheritanceExample;

public class Student {
	int roll;
	String name;
	int age;
	
	
	Student(){
		System.out.println("invoking constructor");
	}
	
	
	public static void main(String[] args) {
		Student s1 =new Student();
		s1.age=22;
		s1.name = "reddy";
		s1.roll = 12;
		
		Student s2 =new Student();
		s2.age=22;
		s2.name = "reddy";
		s2.roll = 12;

	}

}

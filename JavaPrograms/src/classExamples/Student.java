package classExamples;

public class Student {

	int roll;
	String name;
	int age;
	
	Student(){
		System.out.println("Invoking constructor");
	}
	
	Student(int age,String name,int roll){
		this.age = age;
		this.name = name;
		this.roll = roll;
	
	}
	
	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.age = 20;
		s1.name = "abc";
		s1.roll = 01;
		
		Student s2 = new Student();
		s2.age=20;
		s2.name="xyz";
		s2.roll=02;
		
		Student s3 = new Student(22, "yyy", 03);
		System.out.println(s3.age);
		System.out.println(s3.name);
		System.out.println(s3.roll);
		
	}
	
	

}

package classExamples;


public class Home{
	
	// static -> static, can not call non static method
	//non static -> static and non static
	
	
	public static void main(String[] args) {
		Home h = new Home();
		h.go1();
		System.out.println("we are in main method");
		
	
	
	}
	
	public static void go(){
		System.out.println("we are in go method");
		Home h1 = new Home();
		h1.go2();
		System.out.println("after calling go2 method");
	}
	
	public void go1(){
		System.out.println("we are in go1 method");
		go();
		System.out.println("after calling go method");
	}
	
	public void go2(){
		System.out.println("we are in go2 method");
	}
}

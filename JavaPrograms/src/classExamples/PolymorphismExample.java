package classExamples;

public class PolymorphismExample {

	public static void main(String[] args) {
		PolymorphismExample p = new PolymorphismExample();
		p.add(10.23, 20.20);
		p.add(10, 20);
		p.add(10, 20, 30);

	}
	
	
	public void add(int a, int b){
		System.out.println(a+b);
	}
	
	public void add(int a, int b,int c){
		System.out.println(a+b+c);
	}

	public void add(double a, double b){
		System.out.println(a+b);
	}
}

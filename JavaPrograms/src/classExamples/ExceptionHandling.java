package classExamples;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		//ArithmeticException
		
		/*int a = 10/0;
		System.out.println(a);
		System.out.println("next statements");
		System.out.println("continuation of statements");*/
		
		/* int a=10;
		 int b = 0;
		 try
		 {
		 int result = a/b;
		 System.out.println(result);
		 }
		 catch (ArithmeticException e){
			 System.out.println("Getting error when divided by zero");
		 }
		 System.out.println("continuation of execution");
		 System.out.println("next statements");*/
	
		//NullPointerException
		/*String s = null;
		System.out.println(s.length()); */
		
		//Data conversion(String to Integer)
		/*String s1 = "10";
		String s2 = "20";
		int a = Integer.parseInt(s1);
		int b = Integer.parseInt(s2);
		System.out.println(a+b);*/
		
		//NumberFormatException
		/*String s= "abc";
		int a = Integer.parseInt(s);
		System.out.println(a);*/
		
		//ArrayIndexOutOfBoundsException
		/*int a[] = new int[5];
		a[10] = 20;
		System.out.println(a[10]);*/
		
		
		//Multiple catch blocks
		 int a=10;
		 int b = 0;
		 try
		 {
		 int result = a/b;
		 System.out.println(result);
		 }
		 catch (ArithmeticException e1){
			 System.out.println("Getting error when divided by zero");
		 }
		 System.out.println("continuation of execution");
		 System.out.println("next statements");
		 int c[] = new int[5];
		 try{
			c[10] = 20;
			System.out.println(c[10]);
		 }
		catch(ArrayIndexOutOfBoundsException e2){
			System.out.println("Getting Array Index error");
		}
		 System.out.println("continuation of execution");
		
	}

}

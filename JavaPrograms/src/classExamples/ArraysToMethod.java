package classExamples;

public class ArraysToMethod {

	public static void main(String[] args) {
		int b[]={10,20,30,40};
		/*
		ArraysToMethod a = new ArraysToMethod();
		a.max(b);*/
		int myArray[][] = { { 10, 20, 30 }, { 12, 18, 21 }, { 2, 31, 13 }};
		  for (int[] x : myArray) 
		  {
			  for (int y : x) 
		  { 
				  System.out.print(y +  "\t"); 
		  }
		  System.out.println(); }

	}
	
	public void max(int a[]){
		int max = 0;
		for(int i=0;i<a.length;i++){
			if(max<a[i]){
				max=a[i];
				}
	}
	System.out.println(max);

}
}
package classExamples;

public class Tables {

	public static void main(String[] args) {
		// Table of 1
		//1 * 1 = 1
		
		
		for (int i=1;i<=10;i++){ 
			System.out.println("Table of "+i);
			for (int j=1;j<=10;j++){// 1 to 10
				System.out.println(i+" * "+j+" = "+i*j);
			}
			System.out.println("************");
		}

	}

}

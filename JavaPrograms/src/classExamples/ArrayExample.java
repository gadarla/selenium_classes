package classExamples;

public class ArrayExample {

	public static void main(String[] args) {
		/*int a[] = new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		
		for (int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		
		String weeks[]= {"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
		System.out.println(weeks[2]);
		for(int j=0;j<weeks.length;j++){
			System.out.println(weeks[j]);
		}*/
		// add array values
		/*int a[]={10,20,30,40};
		int total = 0;
				for (int i=0;i<a.length;i++){
					total = total + a[i];
		}
				System.out.println("total: "+total);
	*/
		// max value from array elements
		/*int a[]={10,20,30,40};
		int max=0;
		for(int i=0;i<a.length;i++){
			if(max<a[i]){
				max=a[i];
			}
			
		}
		System.out.println("max: "+max);
			*/
	
		/*int a[][]= new int[3][3];
		a[0][0]=10;
		a[0][1]=20;
		a[0][2]=30;
		
		a[1][0]=22;
		a[1][1]=33;
		a[1][2]=44;
		
		a[2][0]=55;
		a[2][1]=66;
		a[2][2]=77;*/
	
		int a[][] = {{10,20,30},{22,33,44},{55,66,77}};
		int max = a[0][0];
		//System.out.println(a[1][1]);
		
		for(int row=0;row<a.length;row++){
			for(int col=0;col<a[0].length;col++){
				if(max > a[row][col]){
					max = a[row][col];
				}
				
			}
			
		}
		System.out.println(max);
		
	}	
}

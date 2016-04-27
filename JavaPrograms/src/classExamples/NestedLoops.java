package classExamples;

public class NestedLoops {

	public static void main(String[] args) {
		// while -> 3
		// forloop -> 4
		// do while-> 5

		/*
		 * int i=0; int count = 0; while(i<3){ for(int j=0;j<4;j++){ int k=0;
		 * do{ System.out.println("i ="+i+" J="+j+" K="+k); k++; count++;
		 * }while(k<5); } i++; } System.out.println("count= " +count);
		 */

		for (int outer = 1; outer <= 5; outer++) {
			for (int inner = 0; inner < outer; inner++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}

import java.util.List;
import java.util.ArrayList;

public class arrayExample {

	public static void main(String[] args) {
		/*
		 * Home[] test = new Home[10]; for (int i = 0 ; i < test.length ; i++) {
		 * test[i] = new Home(); System.out.println(test[i].show()); }
		 */
		/*
		 * int a[] = new int[5]; a[0] = 2; a[1] = 5; a[2] = 7; a[3] = 3; a[4] =
		 * 8; System.out.println(a[2]); String
		 * months[]={"Jan","Feb","Mar","Apr"}; System.out.println(months[2]);
		 * for (int i=0;i<a.length;i++){ System.out.println(a[i]); } for (int
		 * j=0;j<months.length;j++){ System.out.println(months[j]); }
		 */
		// total of an array
		/*
		 * int a[] = {10,20,30,40}; int total = 0; for (int i=0;i<a.length;i++){
		 * total = total + a[i]; } System.out.println("Total "+total);
		 */
		// max from an array
		/*
		 * int a[] = {10,20,30,90,40}; int max = 0; for (int
		 * i=0;i<a.length;i++){ if(max<a[i]){ max = a[i]; } }
		 * System.out.println("Total "+max);
		 */
		// multi demensional array

		// int a[][]=new int[3][3];
		// a[0][0]=10;
		// a[0][1]=20;
		// a[0][2]=30;
		//
		// a[1][0]=12;
		// a[1][1]=18;
		// a[1][2]=22;
		//
		// a[2][0]=21;
		// a[2][1]=31;
		// a[2][2]=13;
		/*
		 * int a[][]= {{10,20,30},{12,18,22},{21,31,13}};
		 * System.out.println(a.length); System.out.println(a[0].length);
		 * for(int row=0;row<a.length;row++){ for(int
		 * col=0;col<a[0].length;col++){ System.out.print(" "+a[row][col]); }
		 * System.out.println(" "); }
		 */

		// enhanced arrays
		/*
		 * int myArray[][] = { { 10, 20, 30 }, { 12, 18, 21 }, { 2, 31, 13 } };
		 * for (int[] x : myArray) { for (int y : x) { System.out.print(y +
		 * "\t"); } System.out.println(); }
		 */

		// min value from multi demensional array
		/*
		 * int a[][]= {{10,20,30},{12,18,21},{2,31,13}}; int min=a[0][0]; for
		 * (int row=0;row<a.length;row++){ for(int col=0;col<a[0].length;col++){
		 * if(min>a[row][col]){ min = a[row][col]; } } }
		 * System.out.println(min);
		 */
		// arraylist example

		/*List<String> al = new ArrayList<>();
		al.add("sun");
		al.add("mon");
		al.add("tue");
		al.add("wed");
		System.out.println(al.size());
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}*/

	}
}

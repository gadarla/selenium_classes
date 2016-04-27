package classExamples;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		List<String> weeks = new ArrayList<>();
		weeks.add("Sun");
		weeks.add("Mon");
		weeks.add("Tue");
		weeks.add("Wed");
		weeks.add("Thu");
		weeks.add("Fri");
		weeks.add("Sat");
		
		System.out.println(weeks.size());
		for(int i=0;i<weeks.size();i++){
			System.out.println(weeks.get(i));
		}
		
		
		}

	

}

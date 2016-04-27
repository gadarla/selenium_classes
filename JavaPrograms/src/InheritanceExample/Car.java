package InheritanceExample;

public class Car extends Vehicle {
		
		int gears;
		
		public void tireType(){
			System.out.println("Tubeless tire");
		}
	  
		public void startVehicle(){
			System.out.println("we are in sub class");
		}
}

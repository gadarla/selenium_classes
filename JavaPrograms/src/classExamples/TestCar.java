package classExamples;

public class TestCar {

	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		v.color = "red";
		v.wheels = 4;
		//v.startVehicle();
		
		Car c = new Car();
		c.gears = 5;
		c.typeOfTyre();
		c.startVehicle();
		

	}

}

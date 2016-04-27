package InheritanceExample;

public class TestCar{

	public static void main(String[] args) {
	
		Vehicle v = new Vehicle();
		v.color= "blue";
		v.wheels = 4;
		v.startVehicle();
		
		Car c = new Car();
		c.color = "red";
		c.gears = 5;
		c.wheels = 4;
		c.tireType();
		c.startVehicle();
		
		
	}

}

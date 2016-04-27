

public class Department implements Employee{

	public static void main(String[] args) {
		Employee e = new Department();
		e.bonus();
		e.salary();
	}

	@Override
	public void salary() {
	
		System.out.println("salary of employee");
	}

	
	@Override
	public void bonus() {
		System.out.println("bonus of employee");
	}
	
	

}

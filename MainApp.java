package employee;

public class MainApp {

	public static void main(String[] args) {
		Employee em=new Employee(78, "lavanya", "madamboina", 2344);
		System.out.println(em);
		double newSalary=  em.raiseSalary(5);
	
		System.out.println(newSalary);

	}

}

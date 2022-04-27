package employee;

public class Employee {
	public int id;
	public String firstName;
	public String lastName;
	public double salary;
	
	public Employee(int id, String firstName, String lastName, int salary) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double newSalary) {
		this.salary = newSalary;
	}
	public double getAnnualSalary1(double newSalary) {
		return newSalary*12;
		
	}
	public double raiseSalary(int percent) {
	
		return (int)(double)salary*(1+(double)percent/100);
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary
				+ "]";
	}
	public double getAnnualSalary(double newSalary) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	

}

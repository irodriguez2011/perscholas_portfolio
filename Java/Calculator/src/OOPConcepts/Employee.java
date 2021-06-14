package OOPConcepts;

public class Employee extends Person implements PersonInterface {

	int emp_id;
	double emp_salary;
	
	Address addr;
	
	Employee (int id,String name, int age, char gender, double salary) {
		
		super(name,age,gender);
		this.emp_id=id;
		this.emp_salary =salary;
		
		
	}
	
	public void createAddress(String street, String city, 
			String state, int zipcode) {
		
		addr = new Address();
		addr.street = street;
		addr.city = city;
		addr.state =state;
		addr.zipcode = zipcode;
		
	}
	
	
	public void display () {
		System.out.println(Organization);
		System.out.println("----------");
		System.out.println("Id: " +this.emp_id);
		super.display();
		System.out.println("Street: " + addr.street);
	  	System.out.println("City: " + addr.city);
	  	System.out.println("State: " + addr.state);
	  	System.out.println("Zipcode: " + addr.zipcode);
		System.out.println("Salary: "+this.emp_salary);
	}
	
	public double calculate (int bonus) {
		   double netSalary = bonus +this.emp_salary;
		   return netSalary;
	}

	public static void totalPerson() {
		System.out.println("Number of employees: " +count);
	}

	@Override
	public String title(String jobTitle) {
		// TODO Auto-generated method stub
		
		return jobTitle;
	}


	
	
}

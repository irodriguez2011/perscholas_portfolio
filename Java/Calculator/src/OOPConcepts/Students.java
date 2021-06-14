package OOPConcepts;

public class Students extends Person implements PersonInterface {
    
	int stud_id;
	double subject1;
	double subject2;
	double subject3;
	String major;
	
	Address addr;
	
	Students (String name,int id, int age, char gender,double subject1,
	double subject2,
	double subject3,
	String major
	) {
		super (name,age,gender);
		this.stud_id = id;
		this.subject1 = subject1;
		this.subject2 = subject2;
		this.subject3 = subject3;
		this.major = major;
	
		
	}
	 
	public void createAddress(String street, String city, 
			String state, int zipcode) {
		addr = new Address();
		addr.street = street;
		addr.city = city;
		addr.state =state;
		addr.zipcode = zipcode;
	}
	
	
	public void display() {
		System.out.println("ID: " +this.stud_id);
		super.display();
		System.out.println("Subject 1: "+this.subject1);
		System.out.println("Subject 2: " +this.subject2);
		System.out.println("Subject 3: " +this.subject3);
		System.out.println("Major: "+this.major);
		System.out.println("Street: "+addr.street);
		System.out.println("City: "+addr.city);
		System.out.println("State: " +addr.state);
		System.out.println("Zipcode: "+addr.zipcode);
		
	}
	
	public double calculate(int totalSubjects) {
		double average = ( (this.subject1+this.subject2+this.subject3) /totalSubjects);
		return average;
	}
	
	public String title (String clubName) {
		String club = clubName;
		return club;
	}
	
}
